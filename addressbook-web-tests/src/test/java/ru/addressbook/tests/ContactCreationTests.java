package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
      app.goTo().groupPage();
      app.contact().initContactCreation();

      File photo = new File("src/test/resources/file.png");

      app.contact().fillContactForm(new ContactData().withFirstName("test_name")
             .withLastName("test_lastname").withPhoto(photo), true);
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
