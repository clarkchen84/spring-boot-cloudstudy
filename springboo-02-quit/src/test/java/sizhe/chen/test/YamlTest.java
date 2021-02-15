package sizhe.chen.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sizhe.chen.bean.Person;

/**
 * @Author: sizhe.chen
 * @Date: Create in 8:27 下午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class YamlTest {
    @Autowired
    private Person person;
    @Test
    public void test1(){
        System.out.println(person);
    }
}
