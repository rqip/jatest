package ru.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.addressbook.appmanager.AppManager;

public class TestBase {

  protected static final AppManager app = new AppManager(BrowserType.FIREFOX);

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
   }

  @AfterSuite
  public void tearDown() {
      app.stop();
  }

}
