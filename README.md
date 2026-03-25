
** Flipkart Automation Assignment – Selenium (Java)**

This project automates a user scenario on Flipkart using Selenium WebDriver with Java.

** Objective**

Automate the following steps:

* Go to Flipkart India.
* Close the login popup if it appears.
* In the search bar, enter "Bluetooth Speakers" and search.
* Apply filters:
  Brand → boAt
  Customer Ratings → 4★ \& above
  Sort results by Price — Low to High.
* From the 1st product on the search results page:
* Open the product in a new tab.
* On the product page, check if the “Available offers” section exists.
    If yes → print the number of offers in the console.

    **SCENARIO 1: Product is Available**

        If the product has an “Add to Cart” button:
              Click Add to Cart
              Navigate to the cart page
              Take a screenshot and save it as cart\_result.png and share with us screenshot and whole project



    **SCENARIO 2: Product is NOT Available**

            If any of these occur: “Add to Cart” button is missing
        		“Add to Cart” button is disabled
            “Out of Stock” is displayed

Then:
Do NOT click anything
Print: “Product unavailable — could not be added to cart.”
Still take a screenshot of the product page.
Save screenshot as result.png and share with us screenshot and whole project
Product unavailable — could not be added to cart.

\- Take a screenshot of the product page

\- Save screenshot as result.png

**# Technologies Used**

**- Java**

**- Selenium WebDriver**

**- Maven**

**- ChromeDriver**

**- NetBeans IDE**

 **Project Structure**


Flipkart-Automation  

│  

├── src/main/java  

│  

├── flipkartautomation
│   └── BaseTest.java    

│   ├── HomePage.java  

│   ├── SearchPage.java  

│   └── ProductPage.java  

│   └── TestRun.java    

│   └── ScreenshotUtil.java   

└── ScreenShots



** How to Run the Project**



Step 1: Clone the Repository



git clone 
https://github.com/Adikeshava-Reddy/flipkart-Automation-Selenium.git


Step 2: Open the Project

Open the project in NetBeans / IntelliJ / Eclipse.

 Step 3: Install Dependencies

Run the following Maven command:

mvn clean install


 Step 4: Run the Automation Test

Run the following Java file:
TestRun.java

This will start the automation and execute the full scenario.


Screenshots


All screenshots will be saved in the ScreenShots folder inside the project.
