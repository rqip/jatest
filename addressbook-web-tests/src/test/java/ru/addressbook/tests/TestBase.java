package ru.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import ru.addressbook.appmanager.AppManager;

@Listeners(MyTestListener.class)
public class TestBase {

  protected static final AppManager app = new AppManager(BrowserType.FIREFOX);

  @BeforeSuite
  public void setUp(ITestContext context) throws Exception {
    app.init();
    context.setAttribute("app", app);

   }

  @AfterSuite
  public void tearDown() {
      app.stop();
  }

}
