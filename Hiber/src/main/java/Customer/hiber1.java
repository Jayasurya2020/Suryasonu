package Customer;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hiber1 
{
	

		public static void main(String[] args) 
		{
	Configuration cfg = new Configuration();
			
			cfg.configure("hiber.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session session = sf.openSession();
			
			Transaction ts = session.beginTransaction();
			
			Employee cobj = new Employee();
			
			cobj.setOrdername("Surya");
			cobj.setLoction("TPT");
			
			session.persist(cobj);
			
			ts.commit();
			
			session.close();
			
			System.out.println("Done.");
		}
}