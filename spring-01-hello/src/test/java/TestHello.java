import com.edityj.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

  @Test
  public void Hello() {
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Hello hello = (Hello) context.getBean("hello");
    System.out.println(hello.getStr());
  }
}
