package seleniumpacket;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBaidu {

public static void main(String args[]) throws InterruptedException {
		
		//ָ����������ĵ�ַ
		System.setProperty("webdriver.gecko.driver","D:\\school\\JavaProject\\seleniumdemo\\src\\seleniumpacket\\geckodriver.exe");
		
		//ʵ����һ��WebDriver�Ķ��󣬴�ʱ��������������
		WebDriver driver = new FirefoxDriver();
		
		//������������
		driver.manage().window().maximize();
		
		//�򿪰ٶ���ҳ
		driver.get("https://www.baidu.com/");
		
		//���������������ѯ���ݣ�Yoyo���Ծ�Ʒ�γ�
		driver.findElement(By.id("kw")).sendKeys("�Զ�������");
		
		//ǿ�Ƶȴ�3��
		Thread.sleep(3000);
		
		//������ٶ�һ�¡� ִ������
		driver.findElement(By.id("su")).click();
		
		//ǿ�Ƶȴ�3��
		Thread.sleep(3000);
		
		//�رջ�������
		driver.quit();
		
	}

}
