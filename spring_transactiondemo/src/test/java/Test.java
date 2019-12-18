import com.baobao.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baobao
 * @create 2019-11-25 0:29
 * @description
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("transaction.xml");
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        System.out.println(accountService);
    }
}
