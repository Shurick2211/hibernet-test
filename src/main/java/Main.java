import model.Person;

public class Main {

  public static void main(String [] args) {
    Person vasya = new Person();
    vasya.setName("Sanya");
    vasya.setAge(25);
    vasya.setEmail("fwdwf@www.eпe");

    HibernateUtil hibernate = new HibernateUtil();

    //hibernate.getTransaction().save(vasya);
    //hibernate.closeTransaction();

    hibernate.getTransaction().createSQLQuery("select * from persons").addEntity(Person.class)
        .list().forEach(s->System.out.println(s.toString()));
    hibernate.closeTransaction();
  }

}
