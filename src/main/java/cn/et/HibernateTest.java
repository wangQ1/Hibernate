package cn.et;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.et.dao.Article;

public class HibernateTest {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Article art = new Article();
		art.setATitle("akljsd");
		art.setAContent("khaksjd");
		Transaction tran = session.getTransaction();//获取一个事务
		tran.begin();//开始事务
		session.save(art);
		tran.commit();//提交事务
	}
}
