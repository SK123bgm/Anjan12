package Generic1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_scrnshot {

	public static void getPhoto(WebDriver driver) throws IOException 
	{
	 String Photo="./Photos";
	 Date d = new Date();
	 String d1 = d.toString();
	 String d2 = d1.replaceAll(":","-");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dst = new File(Photo+d2+".jpeg");
	 FileUtils.copyFile(src, dst);
	 
	 
	}

}
