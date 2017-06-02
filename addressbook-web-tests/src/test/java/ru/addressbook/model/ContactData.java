package ru.addressbook.model;

import java.io.File;

public class ContactData {
  private int id;
  private String firstname;
  private String lastname;
  private String group;
  private String homePh;
  private String mobilePh;
  private String workPh;
  private File photo;

  public File getPhoto() { return photo; }

  public ContactData withPhoto(File photo) {
    this.photo = photo; return this;
  }

  private String allPhones;

  public String getAllPh() { return allPhones; }

  public ContactData withAllPh(String allPhones) {
    this.allPhones = allPhones; return this;
  }

  public String getWorkPh() {
    return workPh;
  }

  public ContactData withWorkPh(String workPh) {
    this.workPh = workPh; return this;
  }

  public String getMobilePh() {
    return mobilePh;
  }

  public ContactData withMobilePh(String mobilePh) {
    this.mobilePh = mobilePh; return this;
  }

  public String getHomePh() {
    return homePh;
  }

  public ContactData withHomePh(String homePh) {
    this.homePh = homePh; return this;
  }

  public int getId() { return id; }

  public ContactData withId(int id) {
    this.id = id; return this;
  }

  public String getFirstName() { return firstname; }

  public ContactData withFirstName(String firstname) {
    this.firstname = firstname; return this;
  }

  public String getLastName() {
    return lastname;
  }

  public ContactData withLastName(String lastname) {
    this.lastname = lastname; return this;
  }

  public String getGroup() { return group; }

  public ContactData withGroup(String group) {
    this.group = group; return this;
  }

}