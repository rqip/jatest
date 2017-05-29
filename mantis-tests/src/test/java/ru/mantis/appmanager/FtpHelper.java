package ru.mantis.appmanager;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FtpHelper {
  private final AppManager app;
  private FTPClient ftp;

  public FtpHelper(AppManager app) {
    this.app = app;
    ftp = new FTPClient();
  }

  public void upload(File file, String target, String bkup) throws IOException {

    ftp.connect(app.getProperty("ftp.host"));
    ftp.login(app.getProperty("ftp.login"), app.getProperty("ftp.password"));
    //ftp.deleteFile(bkup);
    //ftp.rename(target, bkup);
    ftp.enterLocalPassiveMode();

    //ftp.storeFile(target, new FileInputStream(file));
    ftp.disconnect();
  }

  public void restore(String bkup, String target) throws IOException {
    ftp.connect(app.getProperty("ftp.host"));
    ftp.login(app.getProperty("ftp.login"), app.getProperty("ftp.password"));
    //ftp.deleteFile(target);
    //ftp.rename(bkup, target);
    ftp.disconnect();
  }

}
