package dao.impl;

import java.util.List;

import common.dao.impl.BaseDaoHibernate4;
import dao.GuitarDao;
import domain.Guitar;

public class GuitarDaoHibernate4 extends BaseDaoHibernate4<Guitar>
	implements GuitarDao
{

	@SuppressWarnings("unchecked")
	@Override
	//search方法的实现
	public List<Guitar> searchGuitar(String model) {
		String hql="from Guitar as p where p.model="+"'"+ model+ "'";
		return (List<Guitar>)getSessionFactory().getCurrentSession()
				.createQuery(hql)
				.list();
		
	}
}
