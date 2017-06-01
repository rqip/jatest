package ru.mantis.model;

public class Issue {

  private int id;
  private String summary;
  private String desc;
  private Project proj;

  public int getId() { return id; }

  public Issue withId(int id) { this.id = id; return this; }

  public String getSummary() { return summary; }

  public Issue withSummary(String summary) { this.summary = summary; return this; }

  public String getDesc() { return desc; }

  public Issue withDesc(String desc) { this.desc = desc; return this; }

  public Project getProj() { return proj; }

  public Issue withProj(Project proj) { this.proj = proj; return this; }

}
