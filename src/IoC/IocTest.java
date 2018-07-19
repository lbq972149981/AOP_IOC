package IoC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
   public static void main(String[] args) {

      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextIOCDI.xml");
      //默认的情况下是调用该类默认的无参构造函数来创建类的对象
      Person person = (Person) applicationContext.getBean("person");
      person.setName("liubaoqing");
      System.out.println(person.getName());
      //Spring容器利用静态工厂方法创建类对象
      Person person1 = (Person)applicationContext.getBean("personFactory");
      person1.setAge(19);
      System.out.println(person1.getAge());
      //起别名
      Person person2 = (Person) applicationContext.getBean("per");
      person2.setName("555555555555");
      System.out.println(person2.getName());
   }
}
