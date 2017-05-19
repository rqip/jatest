package ru.addressbook.model;

public class ContactData {

  private final String firstname;
  private final String lastname;
  private final String group;

  public ContactData(String firstname, String lastname, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.group = group;
  }

  public String getFirstName() {
      return firstname;
    }

  public String getLastName() {
    return lastname;
  }

  public String getGroup() { return group; }
}
