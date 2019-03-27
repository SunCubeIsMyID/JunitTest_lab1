package seleniumpacket;

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

@RunWith(Parameterized.class)
public class OpenWeb {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private String expected;
	  private String id;
	  private String psd;

	  
	  @Parameters
	  public static Collection<Object[]> t(){
			return Arrays.asList(new Object[][] {
				{"3016218051","218051","https://github.com/popboykingdjko"},
				{"3016218052","218052","https://github.com/xiaoxuaoj"},
				{"3016218053","218053","https://github.com/nbdfls"},
				{"3016218054","218054","https://github.com/hyqzz1"},
				{"3016218055","218055",""},
				{"3016218056","218056","https://github.com/FBIbaby"},
				{"3016218057","218057","https://github.com/riginAI/test"},
				{"3016218058","218058","https://github.com/likai3016218058"},
				{"3016218059","218059","https://github.com/forAragaki/Software-Testing.git"},
				{"3016218060","218060","https://github.com/liuchongwei1998"},
				{"3016218061","218061","https://github.com/liuyuesen"},
				{"3016218062","218062","https://github.com/loulin206"},
				{"3016218063","218063","https://github.com/acan777"},
				{"3016218064","218064","https://github.com/Winbeeone/Hello-GitHub"},
				{"3016218065","218065","https://github.com/tangsongTJU"},
				{"3016218066","218066","https://github.com/LITTLEEEEE/st.git"},
				{"3016218067","218067","https://github.com/WangChen0902"},
				{"3016218068","218068","https://github.com/skye0207"},
				{"3016218069","218069","https://github.com/wanglei201810/HHH.git"},
				{"3016218070","218070",""},
				{"3016218072","218072","https://github.com/Panda216"},
				{"3016218073","218073","https://github.com/AQITF/software-testing-course"},
				{"3016218075","218075","https://github.com/Tyrusmacv"},
				{"3016218076","218076","https://github.com/Tyrusmacv"},
				{"3016218077","218077","https://github.com/DanielKZhang"},
				{"3016218078","218078","https://gitee.com/zqfgly"},
				{"3016230028","230028","https://github.com/XiaZiXia"},
				{"3016204130","204130",""},	
				{"3016218079","218079",""},
				{"3016218080","218080","https://github.com/cyytju"},
				{"3016218081","218081",""},
				{"3016218083","218083","https://github.com/HaoFuTju"},
				{"3016218084","218084","https://github.com/Ziyiiii"},
				{"3016218085","218085","https://github.com/guopeiming"},
				{"3016218086","218086",""},
				{"3016218087","218087","https://github.com/brightknight177"},
				{"3016218088","218088","https://github.com/zhijielee"},
				{"3016218089","218089","https://github.com/guguguzi"},
				{"3016218090","218090","https://github.com/EchoLiuYinan"},
				{"3016218091","218091","https://github.com/iiTachi/"},
				{"3016218092","218092",""},	
				{"3016218093","218093","https://github.com/SouperO"},
				{"3016218094","218094","https://github.com/qyhxxx"},
				{"3016218096","218096","https://github.com/SunCubeIsMyID"},
				{"3016218097","218097","https://github.com/passerw"},
				{"3016218098","218098","https://github.com/old-yellow"},
				{"3016218099","218099","https://github.com/yibowang98"},
				{"3016218100","218100","https://github.com/Landy0524"},
				{"3016218101","218101","https://github.com/nkaccounting"},
				{"3016218102","218102","https://github.com/PlatinumYi"},
				{"3016218103","218103","https://github.com/zk990202"},
				{"3016218104","218104","https://github.com/Zwh0508"},
				{"3016218105","218105","https://github.com/newyingyi"},
				{"3016218106","218106","https://github.com/uareagay"},
				{"3016218107","218107","https://github.com/LeilaniZ"},
				{"3016204310","204310","https://github.com/hshsilver/softwaretest"},
				{"3016207516","207516",""},
				{"3016218108","218108","https://github.com/Barbra0613"},
				{"3016218109","218109","https://github.com/Nicole1772"},
				{"3016218110","218110","https://github.com/csl784513390"},
				{"3016218111","218111","https://github.com/czhxbz"},
				{"3016218112","218112","https://github.com/whyNotwh"},
				{"3016218113","218113","https://github.com/tjugwt"},
				{"3016218114","218114","https://github.com/tjugwt"},
				{"3016218115","218115","https://github.com/BoHuyyy"},
				{"3016218116","218116","https://github.com/mangoSteve"},
				{"3016218117","218117","https://github.com/mangoSteve"},
				{"3016218118","218118","https://github.com/AndrewJYS"},
				{"3016218119","218119","https://github.com/liphcpp"},
				{"3016218120","218120","https://github.com/tju-lzg"},
				{"3016218121","218121","https://github.com/Nfboys"},
				{"3016218122","218122","https://github.com/tcklll/software-testing.git"},
				{"3016218123","218123","https://github.com/MHYpony"},
				{"3016218124","218124","https://github.com/FANBoMeng3016218124/swTest.git"},
				{"3016218125","218125","https://github.com/tjwhm"},
				{"3016218126","218126","https://github.com/hnwyx/software-testing"},
				{"3016218127","218127","https://github.com/wwwwangyiting"},
				{"3016218128","218128","https://github.com/HNSHongTian/SoftwareTesting"},
				{"3016218129","218129","https://github.com/linghanxu-tju/software_testing.git"},
				{"3016218130","218130","https://github.com/YWlancer"},
				{"3016218131","218131","https://github.com/oikawamomo/software_test"},
				{"3016218133","218133","https://github.com/ZJ921"},
				{"3016218134","218134","https://github.com/zzzyyyrrr"},
				{"3016218135","218135","https://github.com/tjudoubi"},
				{"3014218120","218120","https://github.com/SoSoSorry"},
				{"3016218136","218136","https://github.com/users/azzr997/projects/1"},
				{"3016218137","218137","https://github.com/SryTo/SoftwareTesting.git"},
				{"3016218138","218138","https://github.com/STHARUKI"},
				{"3016218139","218139","https://github.com/skadoodleR"},
				{"3016218140","218140","https://github.com/Potmon/STT2016.git"},
				{"3016218141","218141","https://github.com/everlastingstars"},
				{"3016218142","218142","https://github.com/Lothric19"},
				{"3016218143","218143","https://github.com/bxsj/"},
				{"3016218144","218144","https://github.com/0-Avalon-0"},
				{"3016218145","218145","https://github.com/mssjliwenxu"},
				{"3016218146","218146","https://github.com/MaoMaoChina"},
				{"3016218147","218147","https://github.com/LiuChunY"},
				{"3016218148","218148","https://github.com/liuzhidemaomao"},
				{"3016218149","218149","https://github.com/Lou11300306?tab=projects"},
				{"3016218150","218150","https://github.com/Horsepower8888"},
				{"3016218151","218151","https://github.com/Skypfx/softwareTesting"},
				{"3016218152","218152","https://github.com/colindying"},
				{"3016218153","218153","https://github.com/htmmd27"},
				{"3016218154","218154","https://github.com/tjuspAIC/Software-Testing"},
				{"3016218155","218155","https://github.com/Vincent-Sun"},
				{"3016218156","218156","https://github.com/980801"},
				{"3016218157","218157","https://github.com/ChenHsing"},
				{"3016218158","218158","https://github.com/yangmeng19980420"},
				{"3016218159","218159","https://github.com/Ives66"},
				{"3016218160","218160","https://github.com/zhuang12/SoftwareTest.git"},
				{"3016218161","218161","https://github.com/michellezyw"},
				{"3016218162","218162","https://github.com/Cyphexl"},
				{"3016218163","218163","https://github.com/lazygirlyu/homework"},
				{"3016218164","218164","https://github.com/GZhuJJ/SoftwareTestingCourse"},
				{"3016207275","207275","https://github.com/Lzhaohui"},
				{"3016214077","214077","https://github.com/ZhaoMingYang-tju"},
				{"3016218165","218165","https://github.com/azhar241892"},
				{"3016218166","218166","https://github.com/husuhusuhusu"},
				{"3016218167","218167","https://github.com/DemonTimor"},
				{"3016218168","218168","https://github.com/JoHnHC"},
				{"3016218169","218169","https://github.com/ritian-hh"},
				{"3016218170","218170","https://github.com/hdm926"},
				{"3016218171","218171","https://github.com/AWenXiong"},
				{"3016218172","218172","https://github.com/SSFDLware/software-testing"},
				{"3016218173","218173","https://github.com/yangyi66"},
				{"3016218174","218174","https://gitee.com/tju_hei/software_test.git"},
				{"3016218175","218175","https://github.com/liuyang806"},
				{"3016218176","218176","mcyatom@gmail.com"},
				{"3016218177","218177","https://github.com/ElegantQiu"},
				{"3016218178","218178","https://github.com/sqq7777"},
				{"3016218179","218179","https://github.com/suimingben"},
				{"3016218180","218180","https://github.com/sqis777?tab=repositories"},
				{"3016218181","218181","https://culturepanda.github.io/SoftwareTesting/"},
				{"3016218182","218182","https://github.com/YourBrotherTT/softwareTesting.git"},
				{"3016218183","218183","https://github.com/guuuuji/Software-test.git"},
				{"3016218184","218184","https://github.com/fallentree"},
				{"3016218186","218186","https://github.com/MarcusNerva"},
				{"3016218187","218187","https://github.com/ilgarrr"},
				{"3016218188","218188","https://github.com/githaub/homework.git"},
				{"3016218189","218189","https://github.com/llmgpty/tjuscsst.git"},
				{"3016218190","218190","https://github.com/ZhonglinZ"},
				{"3016218191","218191","https://github.com/ZHUKAIYUAN0/test"},
				{"3016218192","218192","https://github.com/jianxin-YL"},

			});
		}
		
		public OpenWeb(String id, String psd,String expected) {
			this.expected = expected;
			this.id = id;
			this.psd = psd;
		}
		
	  @Before
	  public void setUp() throws Exception {
		  String driverPath = "D:/school/JavaProject/seleniumdemo/src/seleniumpacket/geckodriver.exe";
		  System.setProperty("webdriver.gecko.driver", driverPath);
		  driver = new FirefoxDriver();
		  baseUrl = "http://121.193.130.195:8800";
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void OpenWeb() throws Exception {
	    assertEquals(expected,new OpenOneWeb().oneweb(driver, baseUrl, id, psd));
	    driver.close();
	    //driver.findElement(By.id("btn_logout")).click();
	    //driver.findElement(By.id("btn_return")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
//	    driver.quit();
//	    String verificationErrorString = verificationErrors.toString();
//	    if (!"".equals(verificationErrorString)) {
//	      fail(verificationErrorString);
//	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
