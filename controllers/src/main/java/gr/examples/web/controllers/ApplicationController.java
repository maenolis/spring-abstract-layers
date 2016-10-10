package gr.examples.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.examples.core.service.AbstractService;
import gr.examples.core.service.ApplicationService;
import gr.examples.domain.Application;
import gr.examples.transport.ApplicationDto;

@RestController
@RequestMapping("/applications")
public class ApplicationController extends AbstractRestController<Application, ApplicationDto, Long> {

	@Autowired
	ApplicationService applicationService;

	@Override protected AbstractService<Application, ApplicationDto, Long> getService() {
		return applicationService;
	}
}
