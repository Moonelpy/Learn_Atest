package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplictionManager {
  FirefoxDriver wd;


  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;




  public void init() {
    wd = new FirefoxDriver();
    sessionHelper = new SessionHelper(wd);
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    sessionHelper.login("admin", "secret");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);

  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }


  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
