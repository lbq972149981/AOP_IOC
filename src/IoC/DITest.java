package IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class DITest {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextIOCDI.xml");
      PersonDI personDI = (PersonDI) context.getBean("personDI");
      System.out.println(personDI.getPid());
      System.out.println(personDI.getPname());
      System.out.println(personDI.getLists().get(0));
      personDI.getPerson().person();
      Iterator<Object> it = personDI.getSets().iterator();
      while (it.hasNext()){
         System.out.println(it.next());
      }
   }
}
