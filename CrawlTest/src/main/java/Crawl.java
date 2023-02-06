
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sist.dao.LocationVO;
import com.sist.dao.LocationDAO;
public class Crawl {
	private WebDriver driver;
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\Users\\myg17\\Desktop\\chromedriver.exe";
	
	public void process() {
		//크롬 드라이버 셋팅
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		ChromeOptions options=new ChromeOptions();
		//브라우저를 생성해서 띄우지않고 내부적으로 돌리는 옵션
		options.addArguments("headless");
					
		//위에 설정한 옵션을 담은 드라이버 객체 생성
		driver=new ChromeDriver(options);
		
		try {
			//데이터 수집 함수 ( 함부로 실행하면 데이터 중복됨!!! )
//			locationData();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
	}
	/*
	 * 	NO      NOT NULL NUMBER         
		TITLE   NOT NULL VARCHAR2(100)  
		ADDRESS NOT NULL VARCHAR2(500)  
		TEL              VARCHAR2(15)   
		PAGE             VARCHAR2(1000) 
		IMAGE            VARCHAR2(500)  
		INFO             VARCHAR2(4000) 
		DETAIL           VARCHAR2(4000) 
		TIME             VARCHAR2(1000) 
		PRICE            VARCHAR2(1000) 
		INOUT            VARCHAR2(100)  
		DOING            VARCHAR2(500)  
		DOTIME           VARCHAR2(500)  
		FACIL            VARCHAR2(1000) 
		ETC              VARCHAR2(1000)
	 */
	public void locationData() {
		LocationDAO dao=new LocationDAO();
		try
		{
			
		}catch(Exception ex)
		{
			
		}
	}
	
}
