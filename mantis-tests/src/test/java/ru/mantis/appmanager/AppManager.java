package ru.mantis.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManager {

  private final Properties properties;
  private WebDriver wd;
  private String browser;

  private RegHelper regHelper;
  private FtpHelper ftp;
  private MailHelper mailHelper;
  private JamesHelper jamesHelper;
  private SoapHelper soapHelper;

  public AppManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(
            new File(String.format("src/test/resources/%s.properties", target))));
  }

  public void stop() {
    if (wd != null) { wd.quit(); }
  }

  public HttpSession newSession() {
    return new HttpSession(this);
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public RegHelper registration() {
    if (regHelper == null) { regHelper = new RegHelper(this); }
    return regHelper;
  }

  public FtpHelper ftp() {
    if (ftp == null) { ftp = new FtpHelper(this); }
    return ftp;
  }

  public WebDriver getDriver() {
    if (wd == null) {
      if (browser.equals(BrowserType.FIREFOX)) {
        wd = new FirefoxDriver();
      } else if (browser.equals(BrowserType.IE)) {
        wd = new InternetExplorerDriver();
      } else if (browser.equals(BrowserType.CHROME)) {
        wd = new ChromeDriver();
      }

      wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  //60
      wd.get(properties.getProperty("web.baseUrl"));
    }
    return wd;
  }

  public MailHelper mail() {
    if (mailHelper == null) { mailHelper = new MailHelper(this); }
    return (mailHelper);
  }

  public JamesHelper james() {
    if (jamesHelper == null) { jamesHelper = new JamesHelper(this); }
    return (jamesHelper);
  }

  public SoapHelper soap() {
    if (soapHelper == null) { soapHelper = new SoapHelper(this); }
    return (soapHelper);
  }

}
