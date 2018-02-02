package ankermaker.top.Test;
import org.hibernate.Session;
import org.hibernate.Transaction;
import DatabaseUtils.DB_Util;
import ankermaker.Users;
/**
 * @author Ankermaker
 *
 * Feb 2, 2018
 */
public class Main_Method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Users user0 = new Users(0, "zhangjing", "girl", "100000");
//
		Session session = DB_Util.getLocalThreadSession();
//
//		Transaction tx = session.beginTransaction();
		Users user01 = (Users) session.get(Users.class, 1);
		
//		tx.commit();
		

		System.out.println("数据存入成功！");
		
		System.out.println("获取数据成功："+user01);
		
		Transaction tx = session.beginTransaction();
		session.delete(user01);
		tx.commit();
		System.out.println("删除数据成功：");
		DB_Util.closeSession();

	}

}
