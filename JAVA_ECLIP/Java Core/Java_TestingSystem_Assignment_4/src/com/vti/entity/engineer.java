package com.vti.entity;

public class engineer extends CanBo{
	private String trainingIndustry;

public String getTrainingIndustry() {
	return trainingIndustry;
}

public void setTrainingIndustry(String trainingIndustry) {
	this.trainingIndustry = trainingIndustry;
}

@Override
public void doing() {
	System.out.println("ky su dcct");
	
}

}
