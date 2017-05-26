package ru.addressbook.tests;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentDisposition;
import org.testng.annotations.Test;
import ru.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactPhoneTests extends TestBase {

  @Test
  public <T> void testContactPhones() {
    app.goTo().gotoHomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().InfoFromEditForm(contact);

    assertThat(contact.getAllPh(), equalTo(mergePh(contactInfoFromEditForm)));
  }

  private String mergePh(ContactData contact) {
    return Arrays.asList(contact.getHomePh(), contact.getMobilePh(), contact.getWorkPh())
        .stream().filter((s) -> ! s.equals(""))
        .map(ContactPhoneTests::cleaned)
        .collect(Collectors.joining("\n"));
  }

  public static String cleaned(String phone) {
    return phone.replaceAll("\\s", "").replaceAll("[-()]", "");
  }
}