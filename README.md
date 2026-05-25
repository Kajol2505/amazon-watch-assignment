# Amazon Watch Assignment – Playwright Java

## Overview
This project automates Amazon India using Playwright with Java and follows the Page Object Model (POM) design pattern.

The automation performs:
- Open Amazon India
- Search for Wrist Watches
- Apply filters
- Extract product details
- Print values in console

---

## Tech Stack

- Java
- Playwright
- Maven
- JUnit 5
- Page Object Model (POM)

---

## Assignment Steps

1. Open Amazon India
2. Search for:
   - Wrist Watches
3. Apply Filters:
   - Display Type → Analogue
   - Band Material → Leather
   - Brand → Titan
   - Discount → 25% Off or more
   - Price → ₹4000 – ₹8000
4. Retrieve first product details:
   - Price
   - MRP
   - Percentage Discount
5. Print extracted values in console

---

## Project Structure

```plaintext
src
│
├── main
│   └── java
│       ├── base
│       │     └── BaseTest.java
│       │
│       └── pages
│             ├── AmazonHomePage.java
│             └── WatchResultPage.java
│
└── test
    └── java
          └── tests
                └── AmazonWatchTest.java
```

---

## Framework Components

### BaseTest
Responsible for:
- Browser launch
- Browser configuration
- Setup and teardown

### AmazonHomePage
Responsible for:
- Opening Amazon
- Searching Wrist Watches

### WatchResultPage
Responsible for:
- Applying filters
- Extracting product details

### AmazonWatchTest
Responsible for:
- Executing end-to-end scenario

---

## Run Project

Execute:

```bash
mvn test
```

---

## Expected Execution Flow

- Launch Browser
- Open Amazon
- Search Wrist Watches
- Apply Filters
- Extract Product Details
- Print Output
- Close Browser

---

## Sample Console Output

```plaintext
STEP 1 → Launch Browser
STEP 2 → Open Amazon
STEP 3 → Search Wrist Watches
STEP 4 → Apply Filters

Price : <Extracted during execution>
MRP : <Extracted during execution>
Discount : <Calculated during execution>
(Note: Values change dynamically based on Amazon search results.)
```