package ru.ghub;

import com.google.common.collect.ImmutableMap;
import com.jcabi.github.*;

import org.testng.annotations.Test;

import java.io.IOException;

public class GhubTests {

  @Test
  public void testCommits() throws IOException {

    Github github = new RtGithub("784e45b4aa202acbb87e6c861c3130b9fd1f299c");

    RepoCommits commits = github.repos()
            .get(new Coordinates.Simple("rqip", "jatest")).commits();

    for (RepoCommit commit : commits.iterate(
            new ImmutableMap.Builder<String, String>().build())) {

      System.out.println(new RepoCommit.Smart(commit).message());
    }
  }

}
