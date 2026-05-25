//Purpose: Actual test execution
package tests;

import base.BaseTest;

import pages.*;

import org.junit.jupiter.api.*;

public class AmazonWatchTest
extends BaseTest{

@BeforeEach

public void start(){

setup();

}



@Test

public void runTest(){

System.out.println(
"START EXECUTION"
);

AmazonHomePage home=
new AmazonHomePage(page);

WatchResultPage watch=
new WatchResultPage(page);

home.open();

home.searchWatch();

watch.applyFilters();

watch.printDetails();

}



@AfterEach

public void end(){

tearDown();

}

}