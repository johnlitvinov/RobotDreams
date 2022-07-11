import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    //Напишите тест, который открывает страницу https://demoqa.com/elements, нажимаеи на Buttons,
    //кликнает кнопку Click Me, считает и выводит в консоль текст появившегося сообщения.
    @Test
    public static void firstTest(){
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver","/Users/ivanlitvinau/Desktop/RobotDreams/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/elements");

        WebElement elementButtons = driver.findElement(By.xpath("//*[text()='Buttons']"));
        elementButtons.click();

        WebElement elementClickMeButton = driver.findElement(By.xpath("//*[text()='Click Me']"));
        elementClickMeButton.click();

        WebElement elementToPrint = driver.findElement(By.xpath("//*[@id='dynamicClickMessage']"));

        System.out.println(elementToPrint.getText());

        Assert.assertEquals(elementToPrint.getText(),"You have done a dynamic click");

        driver.quit();
    }


    //Напишите тест, который открывает страницу https://demoqa.com/webtables, нажимает кноку ADD,
    //заполняет форму добавления, проверяет что запись добавилась, редактирует запись через функцию редактирования.
    @Test
    public static void secondTest(){
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver","/Users/ivanlitvinau/Desktop/RobotDreams/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.xpath("//*[text()='Add']"));
        addButton.click();


        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Ivan");


        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Litvinau");


        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys("Litvinau@gmail.com");


        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys("22");


        WebElement salaryField = driver.findElement(By.id("salary"));
        salaryField.sendKeys("1500");


        WebElement departmentField = driver.findElement(By.id("department"));
        departmentField.sendKeys("QA");


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        WebElement editButton = driver.findElement(By.id("edit-record-4"));
        editButton.click();


        WebElement changeFirstNameField = driver.findElement(By.id("firstName"));
        changeFirstNameField.clear();
        changeFirstNameField.sendKeys("Petr");


        WebElement submitButton2 = driver.findElement(By.id("submit"));
        submitButton2.click();


        WebElement checkChangedField = driver.findElement(By.xpath("//*[text()='Petr']"));
        Assert.assertEquals(checkChangedField.getText(),"Petr");

        driver.quit();
    }
}//end class
