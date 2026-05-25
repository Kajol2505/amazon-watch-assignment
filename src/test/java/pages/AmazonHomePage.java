package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class AmazonHomePage {

Page page;

public AmazonHomePage(Page page){
this.page=page;
}


public void open(){

page.navigate(
"https://www.amazon.in/"
);

}



public void searchWatch(){

page.getByRole(
AriaRole.SEARCHBOX,
new Page.GetByRoleOptions()
.setName(
"Search Amazon.in"
)
)
.fill(
"WRIST WATCH"
);

page.getByRole(
AriaRole.BUTTON,
new Page.GetByRoleOptions()
.setName("Go")
.setExact(true)
)
.click();

}

}