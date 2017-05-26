package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test(enabled = false)
  public void testContactCreation() {
    app.goTo().groupPage();
    app.contact().initContactModification();

    app.contact().fillContactForm(new ContactData().withFirstName("test_name")
            .withLastName("test_lastname").withGroup(null), false);
    app.contact().submitContactCreation();
    app.contact().returnToHomePage();
  }
}
