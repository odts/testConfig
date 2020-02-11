package io.partha.config.beans;

import lombok.extern.java.Log;

@Log
public class MyJobA implements IMyJob {

	@Override
	public String showJobType() {
		log.info("The Service A is being used");
		return "from Service A";
	}

}
