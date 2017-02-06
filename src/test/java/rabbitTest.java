import com.zhx.service.RabbitmqService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Vcy on 2017/2/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springContext.xml")
public class rabbitTest {
    @Autowired
    RabbitmqService rabbitmqService;
    @Test
    public void test(){
        rabbitmqService.sendMessage();
    }

}
