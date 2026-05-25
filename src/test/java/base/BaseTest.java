//Responsible for: Launch browser ,Create page ,close browser

package base;

import com.microsoft.playwright.*;

public class BaseTest {

public static Playwright playwright;

public static Browser browser;

public static Page page;

public static void setup(){

System.out.println("STEP 1 → Launching Browser");

playwright=Playwright.create();

browser=
playwright.chromium()
.launch(
new BrowserType
.LaunchOptions()
.setHeadless(false)
.setSlowMo(1500) // slows actions
);

page=
browser.newPage();

System.out.println("Browser Opened");

}



public static void tearDown(){

System.out.println("Closing Browser");

browser.close();

playwright.close();

}

}