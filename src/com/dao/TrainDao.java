package com.dao;

import java.util.List;

import com.domain.Train;

public interface TrainDao {
	Train get(Integer TId);

	void save(Train train);

	void update(Train train);

	void delete(Integer TId);

	List<Train> findAll();
}
