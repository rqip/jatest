package ru.mantis.appmanager;

import org.openqa.selenium.By;

public class RegHelper extends HelperBase {

  public RegHelper(AppManager app) { super(app); }

  public void start(String username, String email) {

    wd.get(app.getProperty("web.baseUrl") + "/signup_page.php");
    type(By.name("username"), username);
    type(By.name("email"), email);
    click(By.cssSelector("input[value='Signup']"));
  }

  public void finish(String confirmLink, String password) {
    wd.get(confirmLink);
    type(By.name("password"), password);
    type(By.name("password_confirm"), password);
    click(By.cssSelector("input[value='Update User']"));
  }
}
