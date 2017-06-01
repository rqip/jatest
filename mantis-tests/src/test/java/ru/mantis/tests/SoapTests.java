package ru.mantis.tests;

import org.testng.annotations.Test;
import ru.mantis.model.Issue;
import ru.mantis.model.Project;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

public class SoapTests extends TestBase {

  @Test
  public void testGetProjects() throws MalformedURLException, ServiceException, RemoteException {

    Set<Project> projects = app.soap().getProjects();
    System.out.println(projects.size());
    for (Project proj : projects) {
      System.out.println(proj.getName());
    }
  }

  @Test
  public void testCreateIssue() throws MalformedURLException, ServiceException, RemoteException {

    Set<Project> projects = app.soap().getProjects();

    Issue issue = new Issue().withSummary("Test issue").withDesc("Test issue desc")
            .withProj(projects.iterator().next());

    Issue created = app.soap().addIssue(issue);
    assertEquals(issue.getSummary(), created.getSummary());
  }
}
