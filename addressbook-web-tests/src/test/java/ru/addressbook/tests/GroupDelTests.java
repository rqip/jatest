package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.addressbook.model.GroupData;

public class GroupDelTests extends TestBase {

  @Test
  public void testGroupDel() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }

    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().delSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
  }

}
