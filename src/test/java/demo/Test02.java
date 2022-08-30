package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test02 {
    public static void main(String[] args) {
//        System.setProperty ( "webdriver.firefox.bin" , "C:/Program Files/Mozilla Firefox/firefox.exe" );
//        System.setProperty ( "webdriver.gecko.driver" , "D:/webdriver/geckodriver.exe" );
//        System.setProperty("webdriver.firefox.bin");
//        System.setProperty("webdriver.gecko.driver");

        //初始化一个Chrome浏览器实例，实例名叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //get()打开一个站点
        driver.get("https://www.baidu.com");
//        1 在输入框输入 selenium
//        driver.findElement(By.id("kw")).sendKeys("selenium");
//        定位方法一：By.id
//        2 点击百度一下
//        driver.findElement(By.id("su")).click();
//        定位方法二：By.name
//        定位方法三：By.linkText
//        driver.findElement(By.linkText("地图")).click();
//         定位方法四：partialLinkText,
//        driver.findElement(By.partialLinkText("闻")).click();
//        定位方法五：class name
//        driver.findElement(By.className("s_ipt")).sendKeys("HELLO");
//        定位方法5：by,tagName
       List<WebElement> buttons = driver.findElements(By.tagName("input"));
        System.out.println("Button:"+buttons.size());
        for(WebElement webElement:buttons){
            if (webElement.getAttribute("type").equals("text")){
                System.out.println("input text is:"+webElement.getText());
            }

        }

        //getTitle（）获取当前页面title的值
        System.out.println("当前打开页面的标题是："+driver.getTitle());

        //关闭并退出浏览器
//        driver.quit();
        }

    }
