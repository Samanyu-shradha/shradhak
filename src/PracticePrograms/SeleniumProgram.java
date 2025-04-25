package PracticePrograms;

public class SeleniumProgram {
    public static void seleniumDriverInstantiate(){
        /* Selenium Program to Right-Click an element
        WebDriver driver = new FirefoxDriver();
        driver.get("https://facebook.com");
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("elementId"));
        action.contextClick(element).perform();
        driver.quit();*/

        /* Selenium Program to hover the mouse over
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://facebook.com");
        WebElement element1 = driver.findElement(By.id("elementId"));
        Actions action1 = new Actions(driver1);
        action1.moveToElement(element1).perform();
        driver.quit();*/

        /* Selenium Program to perform DragAndDrop
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://facebook.com");
        WebElement fromWebElement = driver2.findElement(By.id("elementId"));
        WebElement toWebElement = driver2.findElement(By.id("elementId"));
        Actions builder = new Actions(driver2);
        Action dragAndDrop = builder.clickAndHold(fromWebElement).moveToElement(toWebElement).release(toWebElement).build();
        dragAndDrop.perform();
        driver.quit();*/
    }
    public static void main(String[] args){
        SeleniumProgram.seleniumDriverInstantiate();
    }
}
