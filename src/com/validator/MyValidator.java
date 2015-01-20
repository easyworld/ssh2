package com.validator;

import com.domain.Order;
import com.domain.Train;
import com.domain.User;

public class MyValidator {
	public static boolean isFullOrder(Order o) {
		if (o.getCarriageno() == null)
			return false;
		if (o.getSeatno() == null)
			return false;
		if (o.getTrain() == null || o.getTrain().getTId() == null)
			return false;
		if (o.getUser() == null || o.getUser().getUId() == null)
			return false;
		return true;
	}

	public static boolean isFullTrain(Train o) {
		if (o.getArrive() == null || o.getArrive().isEmpty())
			return false;
		if (o.getDeparture() == null || o.getDeparture().isEmpty())
			return false;
		if (o.getEndtime() == null)
			return false;
		if (o.getStarttime() == null)
			return false;
		if (o.getTrainno() == null || o.getTrainno().isEmpty())
			return false;
		return true;
	}

	public static boolean isFullUser(User o) {
		if (o.getIsadmin() == null)
			return false;
		if (o.getPassword() == null || o.getPassword().isEmpty())
			return false;
		if (o.getUsername() == null || o.getUsername().isEmpty())
			return false;
		return true;
	}
}
