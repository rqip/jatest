package ru.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test_name",
            "test_lastname", null), false);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();

    app.getContactHelper().wd.findElement(By.linkText("Logout")).click();
  }
}
