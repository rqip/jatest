package ru.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.addressbook.appmanager.AppManager;

public class TestBase {

  protected final AppManager app = new AppManager(BrowserType.FIREFOX);
  //protected final AppManager app = new AppManager(BrowserType.IE);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
   }

  @AfterMethod
  public void tearDown() {
      app.stop();
  }

}
