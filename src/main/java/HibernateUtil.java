import model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  Session session;
  Transaction transaction;

  public Session getTransaction() {
    Configuration cfg = new Configuration().configure();
    cfg.addAnnotatedClass(Person.class);
    StandardServiceRegistryBuilder rb = new StandardServiceRegistryBuilder()
        .applySettings(cfg.getProperties());
    SessionFactory sf = cfg.buildSessionFactory(rb.build());
     session= sf.openSession();
     transaction= session.beginTransaction();
    return session;
  }
  public void closeTransaction() {
    transaction.commit();
    session.close();
  }

}
