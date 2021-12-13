package groupProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatabaseTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//initialize the web driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\IT\\Bright Path Technology\\Selenium Folder\\Browsers\\Chrome 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reporter.nih.gov/");
		
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		String path = "C:\\Users\\User\\Desktop\\IT\\Bright Path Technology\\Project\\Data.xlsx";
		//count number of rows
		int row = XLUtil.getRowCount(path, "Sheet1");
		System.out.println(row);
		//for loop to extract and input data from xls file
		
		
		for (int r = 1; r <= row; r++) {

			// get data from first cell all down to the last row as for loop repeats
			String serial = XLUtil.getCellData(path, "Sheet1", r, 0);
			String year = XLUtil.getCellData(path, "Sheet1", r, 1);
			// String princ = XLUtil.getCellData(path, "Sheet1", r, 2);
			String org = XLUtil.getCellData(path, "Sheet1", r, 3);
			String amount = XLUtil.getCellData(path, "Sheet1", r, 4);
			//input box (project serial number) in the web application
			WebElement prjectS = driver.findElement(By.xpath("//textarea[@id='field-project_nums__field_text']"));
			WebElement search = driver.findElement(By.xpath(
					"//div[@class='col-lg-4 col-md-6 col-sm-12 search-buttons']//button[@class='btn btn-lg btn-primary btn-search']"));
			//type serial stored from excel into the search box
			prjectS.sendKeys(serial);
			System.out.println(serial);
			//wait until element is visible to click search button
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" +serial+ "')]")));
			//click search button using ENTER
			search.sendKeys(Keys.ENTER);
			//wait for a new page elements to be loaded
			String amountA = wait
					.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//tbody/tr/td[11]/span[1]/span[1]/div[1]")))
					.getText();
			//store data of the results to a Sting variazble
			String yearA = driver.findElement(By.xpath("//td[@data-label='Fiscal Year']//span/span")).getText();
			String OrgA = driver.findElement(By.xpath("//td[@data-label='Organization']//span/span")).getText();
			//compare expected and actual test data
			if (OrgA.equals(org) && yearA.equals(year) && amountA.equals(amount))

			{//if te data is matching put pass and color cell as a green color
				XLUtil.setCellData(path, "Sheet1", r, 6, "Pass");
				XLUtil.fillGreenColor(path, "Sheet1", r, 6);
			} else {//if the data is not matching put fail and color cell as a red color

				XLUtil.setCellData(path, "Sheet1", r, 6, "Fail");
				XLUtil.fillRedColor(path, "Sheet1", r, 6);
			}
			// go back to the search page
			driver.navigate().back();
		}
		//close the webbrowser
		driver.quit();
	}
}
