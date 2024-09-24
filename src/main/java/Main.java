import enums.Type;
import models.Car;
import models.DriveLicense;
import models.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
         StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                         .configure("hibernate.cfg.xml")
                         .build();
         
                 Metadata metadata = new MetadataSources(serviceRegistry)
                         .addAnnotatedClass(Car.class)
                         .addAnnotatedClass(DriveLicense.class)
                         .addAnnotatedClass(Owner.class)
                         .getMetadataBuilder()
                         .build();
         
                 try (
                         SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                         Session session = sessionFactory.openSession()
                 ) {
                     Transaction transaction = session.beginTransaction();
//                     Owner owner = new Owner("Kira", new DriveLicense("B"));
//                     session.persist(owner);
                     Owner owner = session.find(Owner.class, 1);
//                     Car car = new Car("AUDI", Type.HATCHBACK, 200, 15000, 2000, owner);
//                     session.persist(car);
                     System.out.println(owner);
                     transaction.commit();
                 }
    }
}
