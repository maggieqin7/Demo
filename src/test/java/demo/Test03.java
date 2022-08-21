package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // 2.打开12306
        driver.get("https://kyfw.12306.cn/otn/leftTicket/init");

//        driver.findElement(By.id("fromStationText")).clear();
////        输入城市
//        driver.findElement(By.id("fromStationText")).sendKeys("上海\n");

        /**
         * <select class="select-small" id="cc_start_time" aria-label="共5项,按上下键进行选择,按回车键确认"><option value="00002400">00:00--24:00</option>
         * <option value="00000600">00:00--06:00</option>
         * <option value="06001200">06:00--12:00</option>
         * <option value="12001800">12:00--18:00</option>
         * <option value="18002400">18:00--24:00</option>
         * </select>
         */
//        定义一个下拉框实例
        Select selectBox = new Select(driver.findElement(By.id("cc_start_time")));
        selectBox.selectByValue("12001800");

//        点击单选按钮
        driver.findElement(By.id("wf")).click();
        Thread.sleep(2000);//强制等待2秒
        System.out.println(driver.findElement(By.id("wf")).isSelected());//true
        System.out.println(driver.findElement(By.id("dc")).isSelected());//



    }
}
