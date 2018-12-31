package pageClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {

	public void captureScreen(WebDriver driver) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("C:\\Users\\Admin\\workspace-for-interview-question\\Practice_Hard\\Screenshot\\scree2.pdf"));

	}
	
}
