package pages;

import com.microsoft.playwright.*;

import com.microsoft.playwright.options.AriaRole;

public class WatchPage {

Page page;

public WatchPage(
Page page
){

this.page=
page;

}



public void applyFilters(){


System.out.println(
"STEP 3 - Titan"
);

page.getByRole(
AriaRole.LINK,

new Page
.GetByRoleOptions()

.setName(
"Apply the filter Titan to"
)

)

.click();



System.out.println(
"STEP 4 - Discount"
);

page.getByRole(
AriaRole.LINK,

new Page
.GetByRoleOptions()

.setName(
"25% Off or more"
)

)

.click();



System.out.println(
"STEP 5 - Price"
);


page.getByRole(
AriaRole.SLIDER,

new Page
.GetByRoleOptions()

.setName(
"Minimum price"
)

)

.fill(
"31"
);



page.getByRole(
AriaRole.SLIDER,

new Page
.GetByRoleOptions()

.setName(
"Maximum price"
)

)

.fill(
"70"
);


page.waitForTimeout(
5000
);

}



public void openFirstProduct(){


System.out.println(
"STEP 6 - Open Product"
);


Page popup =

page.waitForPopup(
()->{

page.locator(
".a-link-normal"
)

.first()

.click();

}

);


extractData(
popup
);

}



public void extractData(
Page popup
){

popup.waitForLoadState();



String price =

popup.locator(
".a-price-whole"
)

.first()

.innerText();



String mrp =

popup.locator(
".a-price.a-text-price span"
)

.first()

.innerText();



String discount =

popup.locator(
".savingsPercentage"
)

.first()

.innerText();



System.out.println();

System.out.println(
"===================="
);

System.out.println(
"PRICE : "
+price
);

System.out.println(
"MRP : "
+mrp
);

System.out.println(
"DISCOUNT : "
+discount
);

System.out.println(
"===================="
);

}

}