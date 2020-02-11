package io.partha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.partha.config.beans.IMyJob;

@RestController
public class UserResource {
	@Autowired
	IMyJob job;
	
	@GetMapping("/showBean")
	public String getServiceInfo() {
		return job.showJobType();
	}
}
