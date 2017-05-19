package ru.addressbook.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
  }

}
