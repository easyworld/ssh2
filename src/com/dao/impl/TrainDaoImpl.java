package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.TrainDao;
import com.domain.Train;

public class TrainDaoImpl extends HibernateDaoSupport implements TrainDao {

	@Override
	public Train get(Integer TId) {
		return getHibernateTemplate().get(Train.class, TId);
	}

	@Override
	public void save(Train train) {
		getHibernateTemplate().save(train);
	}

	@Override
	public void update(Train train) {
		getHibernateTemplate().saveOrUpdate(train);
	}

	@Override
	public void delete(Integer TId) {
		getHibernateTemplate().delete(get(TId));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Train> findAll() {
		return getHibernateTemplate().find("from Train order by TId");
	}

}
