package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class WatchResultPage {

Page page;

public WatchResultPage(Page page){
this.page = page;
}

public void applyFilters(){

System.out.println("STEP 4 → Apply Analogue");

page.getByText("Analogue")
.first()
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

Locator firstProduct =
page.locator(
"[data-component-type='s-search-result']"
)
.first();

String price =
firstProduct
.locator(".a-price-whole")
.first()
.innerText();

String mrp =
firstProduct
.locator(".a-text-price .a-offscreen")
.first()
.innerText();

String discount =
firstProduct
.locator("text=% off")
.first()
.innerText();

System.out.println("==============");

System.out.println("PRICE : " + price);

System.out.println("MRP : " + mrp);

System.out.println("DISCOUNT : " + discount);

System.out.println("==============");

}

}