package io.partha.config.beans;

import lombok.extern.java.Log;

@Log
public class MyJobB implements IMyJob {

	@Override
	public String showJobType() {
		log.info("The Service B is being used");
		return "service B";
	}

}
