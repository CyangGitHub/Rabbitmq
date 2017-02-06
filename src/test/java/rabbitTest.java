import com.zhx.service.RabbitmqService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vcy on 2017/2/6.
 */
//@RunWith()
public class rabbitTest {
    @Autowired
    RabbitmqService rabbitmqService;
    @Test
    public void test(){
        rabbitmqService.sendMessage();
    }

}
