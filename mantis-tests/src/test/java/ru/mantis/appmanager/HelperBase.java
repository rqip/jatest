package ru.mantis.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.subethamail.wiser.Wiser;

import java.io.File;

public class HelperBase {
  protected AppManager app;
  protected WebDriver wd;
  public Wiser wiser;

  public HelperBase(AppManager app) {
    this.app = app; this.wd = app.getDriver();
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By Locator, String text) {
    click(Locator);
    if (text != null) {
      String existingText = wd.findElement(Locator).getAttribute("value");
      if (! text.equals(existingText)) {
        wd.findElement(Locator).clear();
        wd.findElement(Locator).sendKeys(text);
      }
    }
  }

  protected void attach(By Locator, File file) {
    if (file != null) {
        wd.findElement(Locator).sendKeys(file.getAbsolutePath());
    }
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

}
