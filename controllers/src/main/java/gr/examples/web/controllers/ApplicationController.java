package gr.examples.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.examples.core.service.AbstractService;
import gr.examples.core.service.ApplicationService;
import gr.examples.domain.Application;
import gr.examples.transformation.service.ApplicationTransformationService;
import gr.examples.transformation.service.TransformationService;
import gr.examples.transport.dto.ApplicationDto;

@RestController
@RequestMapping("/applications")
public class ApplicationController extends AbstractRestController<Application, ApplicationDto, Long> {

	@Autowired
	ApplicationService applicationService;

	@Autowired
	ApplicationTransformationService applicationTransformationService;

	@Override protected AbstractService<Application, Long> getService() {
		return applicationService;
	}

	@Override protected TransformationService<Application, ApplicationDto> getTransformationService() {
		return applicationTransformationService;
	}
}
