package gr.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.ex.domain.Application;
import gr.ex.repository.AbstractRepository;
import gr.ex.repository.ApplicationRepository;
import gr.ex.service.transform.ApplicationTransformationService;
import gr.ex.service.transform.TransformationService;
import gr.ex.transport.ApplicationDto;

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
