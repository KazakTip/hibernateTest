import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import tstHB2Pck.StudentsEntity;

/**
 * @author sbt-kazakov-no
 * @ created 13.02.2017
 * @ $Author$
 * @ $Revision$
 */
public class Main
{
  /*private static final SessionFactory ourSessionFactory;
  private static final ServiceRegistry serviceRegistry;*/
  
  static
  {
    try
    {
      
      
      /*Configuration configuration = new Configuration();
      configuration.configure();
      
      serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
      ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);*/
    } catch(Throwable ex)
    {
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  /*public static Session getSession() throws HibernateException
  {
    return ourSessionFactory.openSession();
  }*/
  
  public static void main(final String[] args) throws Exception
  {
    SessionFactory sessions = new Configuration().configure().buildSessionFactory();
    Session session = sessions.openSession();
    
    //final Session session = getSession();
    try
    {
  
      
  
      session.beginTransaction();
      StudentsEntity studEnt = new StudentsEntity();
      studEnt.setId(374);
      studEnt.setName("Vasya");
      session.save(studEnt);
  
      //List list = session.createQuery("from StudentsEntity").list();
  
      session.getTransaction().commit();
      session.close();
      /*
      System.out.println("querying all the managed entities...");
      final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
      for(Object key : metadataMap.keySet())
      {
        final ClassMetadata classMetadata = (ClassMetadata)metadataMap.get(key);
        final String entityName = classMetadata.getEntityName();
        final Query query = session.createQuery("from " + entityName);
        System.out.println("executing: " + query.getQueryString());
        for(Object o : query.list())
        {
          System.out.println("  " + o);
        }
      } */
    } finally
    {
      session.close();
    }
  }
}