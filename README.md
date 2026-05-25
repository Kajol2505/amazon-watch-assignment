# Amazon Watch Assignment – Playwright Java (POM)

## Overview

This project automates Amazon India using **Playwright with Java** and follows the **Page Object Model (POM)** design pattern.

The automation performs:

- Open Amazon India
- Search for Wrist Watches
- Apply required filters
- Open first product
- Extract:
  - Price
  - MRP
  - Percentage Discount
- Print extracted values in console

---

## Tech Stack

- Java
- Playwright
- Maven
- JUnit 5
- Page Object Model (POM)

---

## Assignment Steps

### 1. Open Amazon India

Navigate to:

```plaintext
https://amazon.in
```

---

### 2. Search Product

Search for:

```plaintext
Wrist Watches
```

---

### 3. Apply Filters

Applied filters:

- Brand → Titan
- Discount → 25% Off or more
- Price Range → ₹4000 – ₹8000

---

### 4. Retrieve Product Details

From first product extract:

- Price
- MRP
- Percentage Discount

---

### 5. Print Output

Display values in console.

---

## Project Structure

```plaintext
src
│
├── main
│
│── java
│     └── base
│           └── BaseTest.java
│
└── test
     └── java
           ├── pages
           │      ├── AmazonHomePage.java
           │      └── WatchPage.java
           │
           └── tests
                  └── AmazonWatchTest.java
```

---

# Framework Components

## BaseTest.java

Purpose:

Responsible for common browser setup.

Methods:

### setup()

- Launch Playwright
- Launch Browser
- Create Page object

### tearDown()

- Close browser
- Close Playwright

---

## AmazonHomePage.java

Purpose:

Responsible for actions on Amazon home page.

Methods:

### open()

What it does:

- Opens Amazon India

### searchWatch()

What it does:

- Locate search bar
- Enter Wrist Watch
- Click Search button

---

## WatchPage.java

Purpose:

Responsible for search result page actions.

Methods:

### applyFilters()

What it does:

- Apply Titan filter
- Apply 25% Off filter
- Apply Price range

---

### openFirstProduct()

What it does:

- Open first matching product

---

### extractData()

What it does:

- Extract Price
- Extract MRP
- Extract Discount
- Print values

---

## AmazonWatchTest.java

Purpose:

Execute complete test flow.

Methods:

### runTest()

Execution flow:

```plaintext
Open Browser
↓
Open Amazon
↓
Search Wrist Watch
↓
Apply Filters
↓
Open Product
↓
Extract Data
↓
Print Output
```

---

## Run Project

Execute:

```bash
mvn clean test
```

---

## Expected Console Output

```plaintext
STEP 1 - Open Amazon

STEP 2 - Search

STEP 3 - Titan

STEP 4 - Discount

STEP 5 - Price

STEP 6 - Open Product


====================

PRICE : 5999

MRP : ₹13995

DISCOUNT : -57%

====================
```

Note:

Values are dynamic and may change depending on Amazon search results.

---

## Author

Kajol Patil