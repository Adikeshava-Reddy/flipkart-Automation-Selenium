\# Flipkart Automation Assignment – Selenium (Java)



This project automates a user scenario on Flipkart using Selenium WebDriver with Java.



\## Objective



Automate the following steps:

* Go to Flipkart India.



* Close the login popup if it appears.



* In the search bar, enter "Bluetooth Speakers" and search.



* Apply filters:



&#x20;    Brand → boAt



&#x20;    Customer Ratings → 4★ \& above



&#x20;    Sort results by Price — Low to High.



* From the 1st product on the search results page:



* Open the product in a new tab.



* On the product page, check if the “Available offers” section exists.



&#x20;     If yes → print the number of offers in the console.



&#x20;  **SCENARIO 1: Product is Available**



&#x09;If the product has an “Add to Cart” button:



&#x09;Click Add to Cart



&#x09;Navigate to the cart page



&#x09;Take a screenshot and save it as cart\_result.png and share with us screenshot and whole project



&#x20;**SCENARIO 2: Product is NOT Available**



&#x09;If any of these occur: “Add to Cart” button is missing



&#x09;			“Add to Cart” button is disabled



&#x09;			“Out of Stock” is displayed



Then:



Do NOT click anything



Print: “Product unavailable — could not be added to cart.”



Still take a screenshot of the product page.



Save screenshot as result.png and share with us screenshot and whole project



Product unavailable — could not be added to cart.



\- Take a screenshot of the product page

\- Save screenshot as result.png



\---



**# Technologies Used**



**- Java**

**- Selenium WebDriver**

**- Maven**

**- ChromeDriver**

**- NetBeans IDE**



\---



\# Project Structure



Flipkart-Automation  

│  

├── src/main/java  

│  

├── base  

│   └── BaseTest.java  

│  

├── pages  

│   ├── HomePage.java  

│   ├── SearchPage.java  

│   └── ProductPage.java  

│  

├── tests  

│   └── TestRun.java  

│  

├── utils  

│   └── ScreenshotUtil.java  

│  

└── ScreenShots

\---



\# How to Run the Project



\### Step 1: Clone the Repository



git clone https://github.com/Adikeshava-Reddy/flipkart-automation

\---



\### Step 2: Open the Project



Open the project in NetBeans / IntelliJ / Eclipse.



\---



\### Step 3: Install Dependencies



Run the following Maven command:



mvn clean install



\---



\### Step 4: Run the Automation Test



Run the following Java file:



TestRun.java



This will start the automation and execute the full scenario.



\---



\## Screenshots



All screenshots will be saved in the ScreenShots folder inside the project.





