package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
    try { Thread.sleep(500); }
    catch (InterruptedException qq) { qq.printStackTrace(); }
    wd.get("http://localhost/addressbook/group.php");
  }

}