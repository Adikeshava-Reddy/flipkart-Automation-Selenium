package Flipkartautomation;



public class TestRun extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        BaseTest base = new BaseTest();

        try {

            base.setup();

            HomePage home = new HomePage(driver);
            SearchPage search = new SearchPage(driver);

            home.closeLoginPopup();
            home.searchProduct("Bluetooth Speakers");

            Thread.sleep(5000);

            search.applyFilters();
            search.selectFourStarRating();
            search.sortByPrice();

            Thread.sleep(3000);

            search.openFirstProduct();
            search.switchToNewTab();

            Thread.sleep(5000);

            ProductPage productPage = new ProductPage(driver);
            productPage.handleProduct();

           

        } catch (InterruptedException e) {

            System.out.println(e);

        } finally {

            driver.quit();
           
        }
    }
}