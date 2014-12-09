package com.test.soap;

import com.test.CalculatorService;
import com.test.soap.model.DataObjects;
import com.test.soap.model.ResultObject;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public ResultObject calculate(DataObjects dataObjects) {
		// TODO Auto-generated method stub		
		ResultObject resultObject = new ResultObject ();
		double resultData;
		if (dataObjects.getOpertaion().equals("+")) {
			resultData = dataObjects.getData1()+dataObjects.getData2();
			resultObject.setResultValue(resultData);
			resultObject.setMessage("two data get added successfully");
		}
		return resultObject ;
	}

	
}
