import model.Person;

public class Main {

  public static void main(String [] args) {
    Person person = Person.builder()
        .age(13)
        .name("Sonya")
        .email("dfg@qwe.rt")
        .build();

    HibernateUtil hibernate = new HibernateUtil();

    //hibernate.getTransaction().save(person);
    //hibernate.closeTransaction();

    hibernate.getTransaction().createSQLQuery("select * from persons").addEntity(Person.class)
        .list().forEach(s->System.out.println(s.toString()));
    hibernate.closeTransaction();
  }

}
