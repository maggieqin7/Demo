//package demo.stepdefs;
//// 创建第一个用例实现文件
////import com.zhiqi.futures.service.AlgorithmBaseOfOrderService;
////import org.springframework.beans.factory.annotation.Autowired;
////import cucumber.api.java8.Zh_cn;
//import java.util.Map;
//
///*
// * 注意：在这个用例实现文件中可以不用导入 springBoot的启动入口文件，也就是不管
// * 有多少个用例文件时，只需要保证有一个用例文件导入了 springBoot的启动入口文件即可，比如我这就只
// * 在 MyStepdefs2.java 进行了 导入：@SpringBootTest(classes = FuturesApplication.class)
// */
//public class MyStepdefs1 implements Zh_cn {
//    String name;
//    @Autowired
//    AlgorithmBaseOfOrderService algorithmBaseOfOrderService;
//    public MyStepdefs1() {
//        When("^the client calls \\/greeting", () -> {
//            System.out.println("-----Cucumber框架 即将调用spring boot框架 中的代码----");
//
//            //此处为调用 springBoot中service层代码，从而得到返回数据可进行被测项目的测试
//            Map<Integer,Double> map = algorithmBaseOfOrderService.calculationEveryStepMinPriceOrder("8d018b2027b711ea9a3100163e00a5d2");
//            System.out.println("map:" + map);
//        });
//
//        Given("name is {string}", (String name) -> {
//            this.name = name;
//        });
//
//        Then("the client receives status code of {int}", (Integer statusCode) -> {
//            assert true;
//        });
//
//        And("the client receives content {string}", (String greeting) -> {
//            assert true;
//        });
//    }
//}
