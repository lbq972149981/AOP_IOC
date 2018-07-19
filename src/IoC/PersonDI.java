package IoC;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonDI {
   private Long pid;

   private String pname;

   private Person person;

   private List lists;

   private Set sets;

   private Map map;

   private Properties properties;

   public Long getPid() {
      return pid;
   }

   public void setPid(Long pid) {
      this.pid = pid;
   }

   public String getPname() {
      return pname;
   }

   public void setPname(String pname) {
      this.pname = pname;
   }

   public Person getPerson() {
      return person;
   }

   public void setPerson(Person person) {
      this.person = person;
   }

   public List getLists() {
      return lists;
   }

   public void setLists(List lists) {
      this.lists = lists;
   }

   public Set getSets() {
      return sets;
   }

   public void setSets(Set sets) {
      this.sets = sets;
   }

   public Map getMap() {
      return map;
   }

   public void setMap(Map map) {
      this.map = map;
   }

   public Properties getProperties() {
      return properties;
   }

   public void setProperties(Properties properties) {
      this.properties = properties;
   }
}
