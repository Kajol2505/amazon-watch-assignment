package tests;

import base.BaseTest;

import pages.*;

import org.junit.jupiter.api.*;


public class AmazonWatchTest
extends BaseTest{


@BeforeEach

void start(){

setup();

}



@Test

void runTest(){


AmazonHomePage home =

new AmazonHomePage(
page
);



WatchPage watch =

new WatchPage(
page
);



System.out.println(
"STEP 1 - Open Amazon"
);

home.open();



System.out.println(
"STEP 2 - Search"
);

home.searchWatch();



watch.applyFilters();


watch.openFirstProduct();


}



@AfterEach

void end(){

tearDown();

}

}