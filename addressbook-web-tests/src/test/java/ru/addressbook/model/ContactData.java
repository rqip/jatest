package ru.addressbook.model;

import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.io.File;
import java.beans.Transient;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "adressbook")
public class ContactData {

  @Id
  @Column(name = "id")
  private int id;
  @Column(name = "firstname")
  private String firstname;
  @Column(name = "lastname")
  private String lastname;

  @Column(name = "home")
  @Type(type = "text")
  private String homePh;

  @Column(name = "mobile")
  @Type(type = "text")
  private String mobilePh;

  @Column(name = "work")
  @Type(type = "text")
  private String workPh;

  @Transient
  private File allPhones;
  @Column(name = "photo")
  @Type(type = "text")
  private String photo;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "address_in_groups", joinColumns = @JoinColumn(name = "id"),
      inverseJoinColumns = @JoinColumn(name = "group_id") )
  private Set<GroupData> groups = new HashSet<GroupData>();

  public File getPhoto() { return new File(photo); }

  public ContactData withPhoto(File photo) {
    this.photo = photo.getPath(); return this;
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

  public Groups getGroups() {
    return new Groups(groups);
  }

  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  public ContactData inGroup(GroupData group) {
    groups.add(group); return this;
  }

}