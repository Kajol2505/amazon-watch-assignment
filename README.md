# Amazon Watch Assignment – Playwright Java

## Tech Stack
- Java
- Playwright
- Maven
- JUnit
- Page Object Model

## Assignment Covered

Open Amazon India

Search:
Wrist Watches

Apply Filters:
- Display Type → Analogue
- Band Material → Leather
- Brand → Titan
- Discount → 25% Off or more
- Price → ₹4000–₹8000

Extract:
- Price
- MRP
- Discount

## Run

```bash
mvn test
```

## Framework

BaseTest
→ Browser setup

AmazonHomePage
→ Search operation

WatchResultPage
→ Filters + extraction

AmazonWatchTest
→ Execution