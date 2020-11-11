import com.wxx.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date: 2020/11/11 22:02
 * Content:
 */
public class MyTest {

    public static void main(String[] args) {

        // 获取Spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 我们的对象现在都在 Spring 中管理了，我们要使用，直接去里面取出来就可以!
        Hello hello = context.getBean("hello", Hello.class);

        System.out.println(hello.toString());
    }
}
