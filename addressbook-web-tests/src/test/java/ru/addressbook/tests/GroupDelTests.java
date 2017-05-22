package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.addressbook.model.GroupData;

import java.util.List;

public class GroupDelTests extends TestBase {

  @Test
  public void testGroupDel() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }

    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().SelectGroup(before.size() - 1);
    app.getGroupHelper().delSelectedGroups();
    app.getGroupHelper().returnToGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    /*for (int i = 0; i < after.size(); i++) {
      Assert.assertEquals(before.get(i), after.get(i));
    }*/
    Assert.assertEquals(before, after);

    app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
  }

}
