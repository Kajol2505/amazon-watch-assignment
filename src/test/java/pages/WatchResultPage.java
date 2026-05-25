//Responsible for: Apply Filters ,Extract Details


package pages;

import com.microsoft.playwright.Page;

public class WatchResultPage {

Page page;

public WatchResultPage(Page page){

this.page=page;

}



public void applyFilters(){

System.out.println("STEP 4 → Apply Analogue");

page.getByRole(
com.microsoft.playwright.options.AriaRole.LINK,
new Page.GetByRoleOptions()
.setName("Apply the filter Analogue to narrow results")
)
.click();

page.waitForTimeout(3000);



System.out.println("STEP 5 → Apply Leather");

page.getByText("Leather")
.first()
.click();

page.waitForTimeout(3000);



System.out.println("STEP 6 → Apply Titan");

page.getByText("Titan")
.first()
.click();

page.waitForTimeout(3000);



System.out.println("STEP 7 → Apply Discount");

page.getByText("25% Off or more")
.first()
.click();

page.waitForTimeout(5000);

}



public void printDetails(){

System.out.println("STEP 8 → Extract Product");

String price=
page.locator(
".a-price-whole"
)
.first()
.innerText();

String mrp=
page.locator(
".a-text-price"
)
.first()
.innerText();

System.out.println("==============");

System.out.println("PRICE : "+price);

System.out.println("MRP : "+mrp);

System.out.println("==============");

}

}