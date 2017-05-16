package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDelTests extends TestBase {

  @Test
  public void testGroupDel() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().delSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
  }

}
