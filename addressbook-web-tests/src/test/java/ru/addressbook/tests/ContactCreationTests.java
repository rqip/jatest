package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;
import ru.addressbook.model.Groups;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
      Groups groups = app.db().groups();
      File photo = new File("src/test/resources/file.png");

      ContactData newContact = new ContactData().withFirstName("test_name")
              .withLastName("test_lastname").withPhoto(photo)
              .inGroup(groups.iterator().next());
      app.goTo().groupPage();
      app.contact().initContactCreation();

      app.contact().fillContactForm(newContact, true);
      app.contact().submitContactCreation();
      app.contact().returnToHomePage();
    }


    @Test(enabled = false)
    public void testCurrentDir() {
      File currentDir = new File(".");
      System.out.println(currentDir.getAbsolutePath());

      File photo = new File("src/test/resources/file.png");
      System.out.println(photo.getAbsolutePath());
      System.out.println(photo.exists());
    }
}
