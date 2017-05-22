package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;
import ru.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
      app.getNavigationHelper().gotoGroupPage();
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("test_name",
              "test_lastname", "test1"), true);
      app.getContactHelper().submitContactCreation();
      app.getContactHelper().returnToHomePage();

      app.getContactHelper().wd.findElement(By.linkText("Logout")).click();
    }

}
