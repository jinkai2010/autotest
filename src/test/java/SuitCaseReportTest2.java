import com.autotest.controller.SuitCaseReportController;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = com.autotest.Application.class)

//@SpringApplicationConfiguration(classes = com.autotest.Application.class )
public class SuitCaseReportTest2 {

//    @Autowired
//    SuitCaseReportController service;
    @org.junit.Test
    public void test(){

    }

    @org.junit.Test
    public void test2(){
        Assert.assertArrayEquals("测试失败",new Integer[]{1},new Integer[]{2});
//        System.out.println(service.getSuitCaseBuildReport(1));
    }
}
