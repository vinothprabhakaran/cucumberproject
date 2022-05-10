package com.adactin.baseclass;             
	




	import java.awt.AWTException;



	import java.awt.List;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

//	import org.apache.commons.io.FileUtils;
//	import org.apache.poi.ss.usermodel.Cell;
//	import org.apache.poi.ss.usermodel.CellType;
//	import org.apache.poi.ss.usermodel.Row;
//	import org.apache.poi.ss.usermodel.Sheet;
//	import org.apache.poi.ss.usermodel.Workbook;
	//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class base_class {

	public static WebDriver vinoth;

	// 1 .BROWSER LAUNCH
	public static WebDriver setbrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\eclipse-workspace\\maven4\\chrome\\chromedriver_win32\\chromedriver.exe");
			vinoth = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Chrome\\chromedriver_win32\\geckodriver.exe");
			vinoth = new FirefoxDriver();
		}
		return vinoth;

	}

	// 2 .CLOSE
	public static WebDriver  close1() {
		vinoth.close();
		return vinoth;
		
	}

	// 3 .QUIT
	public static void quit1() {
		vinoth.quit();
	}

	// 4 .NAVIGATE TO
	public static void navito(String url) {
		vinoth.navigate().to(url);
	}

	// 5 .NAVIGATE BACK
	public static void naviback() {
		vinoth.navigate().back();
	}

	// 6 .NAVIGATE FORWARD
	public static void naviforward() {
		vinoth.navigate().forward();
	}

	// 7 .NAVIGATE REFRESH
	public static void navirefresh() {
		vinoth.navigate().refresh();
	}

	// 8 .GET URL
	public static void getUrl(String url) {
		vinoth.get(url);
	}

	// 9 .ALERT

	// Simple Alert
	public static void simplealert() {
		vinoth.switchTo().alert().accept();
	}

	// Confirm Alert
	public static void confirmAlert(String c_alert) {
		if (c_alert.equalsIgnoreCase("accept")) {
			vinoth.switchTo().alert().accept();
		} else if (c_alert.equalsIgnoreCase("dismiss")) {
			vinoth.switchTo().alert().dismiss();
		}
	}

	public static void alertText(WebElement element) {
		String text = element.getText();
		System.out.println("PRINT THE ALERT TEXT -" + text);
	}

	// Prompt Alert
	public static void promptAlert(String key, String p_alert) {
		vinoth.switchTo().alert().sendKeys(key);
		Alert text = vinoth.switchTo().alert();
		System.out.println("Print the Alert Text" + " " + text.getText());
		if (p_alert.equalsIgnoreCase("accept")) {
			vinoth.switchTo().alert().accept();
		} else if (p_alert.equalsIgnoreCase("dismiss")) {
			vinoth.switchTo().alert().dismiss();
		}
	}

	// 10 .ACTION
	public static void actionfunc(WebElement element, String function, WebElement source, WebElement target) {
		Actions a = new Actions(vinoth);
		if (function.equalsIgnoreCase("click")) {
			a.click(element).perform();
		} else if (function.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).perform();
		} else if (function.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).perform();
		} else if (function.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).perform();
		} else if (function.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(source, target).perform();
		}
	}

	// 11 .FRAMES
	public static void frames(String type, WebElement element, String a) {
		if (type.equalsIgnoreCase("byid")) {
			vinoth.switchTo().frame(a);
		} else if (type.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(a);
			vinoth.switchTo().frame(parseInt);
		} else if (type.equalsIgnoreCase("byelement")) {
			vinoth.switchTo().frame(element);
		}
	}

	// 12 .ROBOT
	          // ROBOT DOWN
	public static void robodown() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
	}
	         // ROBOT ENTER
	public static void roboenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 13 .WINDOW HANDLE
	public static void winhandles() {
		Set<String> windowHandles = vinoth.getWindowHandles();
		for (String string1 : windowHandles) {
			System.out.println(vinoth.switchTo().window(string1).getTitle());
		}
	}

	public static void winhandles1(String a) {
		Set<String> windowHandles = vinoth.getWindowHandles();
		String s = "a";
		for (String string : windowHandles) {
			System.out.println(vinoth.switchTo().window(string).getTitle().equalsIgnoreCase(s));
		}
	}

	// 14 .DROPDOWN
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
	}

	// 15 .CHECK BOX
	public static void checkbox1(WebElement element) {
		element.click();
	}

	// 16 .IS ENABLE
	public static void enable(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println("print is  enabled" + b);
	}

	// 17 .IS DISPLAYED
	public static void displayed(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println("print is  enabled" + b);
	}

	// 18 .IS SELECTED
	public static void selected(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println("print is  enabled" + b);
	}

	// 19 .GET OPTIONS
	public static void getoption(WebElement a2) {
		Select s = new Select(a2);
		List<WebElement> options = s.getOptions();
		for (WebElement a : options) {
			System.out.println("Get all options -" + " " + a.getText());
		}
	}

	// 20 .GET TITLE
	public static void gettitle() {
		Set<String> handles = vinoth.getWindowHandles();
		for (String b : handles) {
			System.out.println(vinoth.switchTo().window(b).getTitle());
		}
	}

	// 21 .GET CURRENT URL

	public static void currenturl() {
		String currentUrl = vinoth.getCurrentUrl();
		System.out.println("print current url -" + " " + currentUrl);
	}

	// 22 .GET TEXT

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println("Print text -" + " " + text);
	}

	// 23 .GET ATTRIBUTE

	public static void getattribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println("Attribute value - " + attribute);
	}

	// 24 .WAIT

	public static void wait1(int x) {
		vinoth.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
	}

	// 25 .TAKE SCREENSHOT
	public static void takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) vinoth;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\maven4\\screenshot" + path);
		FileUtils.copyFile(source, destination);
	}

	// 26 .SCROLLUP AND DOWN
	public static void scroll(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) vinoth;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	// 27 .SENDKEYS
	public static void sendInput(WebElement element, String input) {
		element.sendKeys(input);
	}

	// 28 .GET FIRST SELECTED OPTION
	public static void firstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstoption = s.getFirstSelectedOption();
		System.out.println("print first option" + firstoption.getText());
	}

	// 29 .GET ALL SELECTED OPTION
	public static void getAllSelectedOption(WebElement a1) {
		Select s = new Select(a1);
		list<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement a2 : allSelectedOptions) {
			System.out.println("print all selected options -" + " " + a2.getText());
		}
	}

	// 30 .IS MULTIPLE

	public static void multiple(WebElement a3) {
		Select s = new Select(a3);
		boolean multiple = s.isMultiple();
		System.out.println("is multiple -" + " " + multiple);
	}

	// 31 .CLICK
	public static void clickOn(WebElement element) {
		element.click();
	}

	// 32 .RADIO BUTTON
	public static void radioButton(WebElement element) {
		element.click();
	}
		
		
		
		public static void movetoelement(WebElement actions) {
			
			Actions rc = new Actions(vinoth);
			rc.moveToElement(actions).perform();
		}
		
//		public static void  readparticulardata(String path,int rowindex,int cellindex) throws IOException {
//			File f = new File(path);
//			
//			FileInputStream fis = new FileInputStream(f);
//			
//			Workbook wb = new XSSFWorkbook(fis);
//			
//			Sheet sheet = wb.getSheetAt(0);
//			
//			Row row = sheet.getRow(rowindex);
//			
//			Cell cell = row.getCell(cellindex);
//			
//			CellType celltype = cell.getCellType();
//			
//		if (celltype.equals(celltype.STRING)) {
//			String Value = cell.getStringCellValue();
//		}
//		else if (celltype.equals(celltype.NUMERIC)) {
//			double numericvalue = cell.getNumericCellValue();
//			
//			int data = (int)numericvalue;
//			String value = String.valueOf(data);
			{
			//	return value;
			}
		

		
		

		}
	







