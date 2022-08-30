//// 创建第二个用例实现类文件
//package demo.stepdefs;
//import com.zhiqi.futures.FuturesApplication;
//import com.zhiqi.futures.service.AlgorithmBaseOfOrderService;
//import cucumber.api.java8.Zh_cn;//将feature中用例描述关键字转为中文的支持
//import javafx.beans.binding.When;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.util.Map;
//
//@SpringBootTest(classes = FuturesApplication.class) //注意：FuturesApplication引入的是springboot中的启动入口文件，此处为cucumber整合springBoot的关键所在。
////其中SpringBootTest注解即可表示 测试的springBoot项目
//public class MyStepdefs2 implements Zh_cn {
//
//    //通过 Autowired注解 注入springBoot中的service层，从而实现在cucumber用例中调用被测项目的service层进行测试
//    @Autowired
//    AlgorithmBaseOfOrderService algorithmBaseOfOrderService;
//
//    public MyStepdefs2() {
//
//        /*
//         *	其中 假设 当 那么 这样的方法是由 feature文件中自动生成的。
//         */
//        Given("^today is Sunday$", () -> {
//            System.out.println("1");
//        });
//
//        When("^I ask whether it's Friday yet$", () -> {
//            System.out.println("2");
//        });
//
//        Then("^I should be told \"Nop$", () -> {
//            System.out.println("3");
//            //在用例文件中调用被测项目的service层进行测试
//            Map<Integer,Double> map = algorithmBaseOfOrderService.calculationEveryStepMinPriceOrder("8d018b2027b711ea9a3100163e00a5d2");
//            System.out.println("在第2个feature文件中调用springBoot中的service层:" + map);
//            assert true;// 用例返回通过，如果false表示用例执行失败
//        });
//    }
//}