package com.service.impl;

import java.util.List;

import com.dao.TrainDao;
import com.domain.Train;
import com.service.TrainService;

public class TrainServiceImpl implements TrainService {

	private TrainDao trainDao;

	public TrainDao getTrainDao() {
		return trainDao;
	}

	public void setTrainDao(TrainDao trainDao) {
		this.trainDao = trainDao;
	}

	@Override
	public List<Train> getList() {
		return trainDao.findAll();
	}

	@Override
	public Train get(Integer TId) {
		return trainDao.get(TId);
	}

	@Override
	public void save(Train train) {
		trainDao.save(train);
	}

	@Override
	public void update(Train train) {
		trainDao.update(train);
	}

	@Override
	public void delete(Integer TId) {
		trainDao.delete(TId);
	}

}
