package ankermaker.top.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import ankermaker.Users;
public class AppText {
	
	 @Test
	  public void testAdd(){   
	      Users stu=new Users(001,"yong.hu","man","1000");
	      //咱们要想打通和db通道
	      Configuration cf=new Configuration().configure();
	      SessionFactory factory = cf.buildSessionFactory();
	      Session session = factory.openSession();
	      Transaction tx = session.beginTransaction();
	      //1.3保存   
	      session.save(stu);
	      tx.commit();
	      session.close();
	  }
     
}
