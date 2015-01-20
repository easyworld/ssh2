package com.service;

import java.util.List;

import com.domain.Train;

public interface TrainService {
	List<Train> getList();
	
	void save(Train train);
	
	void update(Train train);
	
	void delete(Integer TId);
	
	Train get(Integer TId);
}
