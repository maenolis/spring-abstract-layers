package gr.examples.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.core.repository.ApplicationRepository;
import gr.examples.core.service.transform.ApplicationTransformationService;
import gr.examples.core.service.transform.TransformationService;
import gr.examples.domain.Application;
import gr.examples.transport.ApplicationDto;

@Service
public class ApplicationServiceImpl extends AbstractServiceImpl<Application, ApplicationDto, Long> implements ApplicationService {

	@Autowired
	ApplicationRepository applicationRepository;

	@Autowired
	ApplicationTransformationService applicationTransformationService;

	@Override public AbstractRepository<Application, Long> getRepository() {
		return applicationRepository;
	}

	@Override public TransformationService<Application, ApplicationDto> getTransformationService() {
		return applicationTransformationService;
	}
}
