package gr.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.ex.domain.Application;
import gr.ex.service.AbstractService;
import gr.ex.service.ApplicationService;
import gr.ex.transport.ApplicationDto;

@RestController
@RequestMapping("/applications")
public class ApplicationController extends AbstractRestController<Application, ApplicationDto, Long> {

	@Autowired
	ApplicationService applicationService;

	@Override protected AbstractService<Application, ApplicationDto, Long> getService() {
		return applicationService;
	}
}
