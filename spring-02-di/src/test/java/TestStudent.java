import com.edityj.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

  @Test
  public void Student() {
    final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    final Student student = (Student) context.getBean("student");
    System.out.println(student);
  }
}
