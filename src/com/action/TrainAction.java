package com.action;

import java.util.List;

import com.domain.Train;
import com.opensymphony.xwork2.ActionSupport;
import com.service.TrainService;
import com.validator.MyValidator;

public class TrainAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1359981396849471941L;
	private List<Train> trainList;
	private Train train;
	private Integer trainId;

	private TrainService trainService;

	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public void setTrainService(TrainService trainService) {
		this.trainService = trainService;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String findAllData() {
		this.trainList = trainService.getList();
		return SUCCESS;
	}

	public String addTrain() {
		if (!MyValidator.isFullTrain(train))
			return ERROR;
		trainService.save(train);
		this.trainList = this.trainService.getList();
		return SUCCESS;
	}

	public String addTrainPage() {
		return SUCCESS;
	}

	public String editTrain() {
		if (!MyValidator.isFullTrain(train))
			return ERROR;
		trainService.update(train);
		this.trainList = this.trainService.getList();
		return SUCCESS;
	}

	public String editTrainPage() {
		this.train = this.trainService.get(trainId);
		return SUCCESS;
	}

	public String deleteTrain() {
		trainService.delete(trainId);
		this.trainList = this.trainService.getList();
		return SUCCESS;
	}
}
