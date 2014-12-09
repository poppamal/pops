package com.test;

import com.test.soap.model.DataObjects;
import com.test.soap.model.ResultObject;

public interface CalculatorService {
	public ResultObject calculate (DataObjects dataObjects);
}
