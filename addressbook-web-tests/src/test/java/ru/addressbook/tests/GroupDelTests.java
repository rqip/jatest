package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDelTests extends TestBase {

  @Test
  public void testGroupDel() {
    app.gotoGroupPage();
    app.SelectGroup();
    app.delSelectedGroups();
    app.returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }

}
