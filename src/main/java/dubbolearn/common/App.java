package dubbolearn.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by parker on 2017/3/17.
 */
public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:applicationContext.xml");
        context.start();

//        logger.info("dubbo service begin to start");
        System.out.println("dubbo service begin to star");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
