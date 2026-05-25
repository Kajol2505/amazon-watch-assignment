//Responsible for:Open Amazon ,Search Wrist Watches
package pages;

import com.microsoft.playwright.Page;

public class AmazonHomePage {

Page page;

public AmazonHomePage(Page page){

this.page=page;

}



public void open(){

System.out.println(
"STEP 2 → Opening Amazon"
);

page.navigate(
"https://amazon.in"
);

page.waitForTimeout(3000);

}



public void searchWatch(){

System.out.println(
"STEP 3 → Searching Wrist Watches"
);

page.locator(
"#twotabsearchtextbox"
)
.fill(
"Wrist Watches"
);

page.waitForTimeout(2000);

page.keyboard()
.press(
"Enter"
);

page.waitForTimeout(5000);

System.out.println(
"Search Completed"
);

}

}