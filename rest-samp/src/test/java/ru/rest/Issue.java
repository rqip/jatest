package ru.rest;

public class Issue {

  private int id;
  private String subj;
  private String desc;

  public int getId() { return id; }

  public Issue withId(int id) { this.id = id; return this; }

  public String getSubj() { return subj; }

  public Issue withSubj(String subj) { this.subj = subj; return this; }

  public String getDesc() { return desc; }

  public Issue withDesc(String desc) { this.desc = desc; return this; }

}
