package gr.examples.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.core.repository.ApplicationRepository;
import gr.examples.domain.Application;

@Service
public class ApplicationServiceImpl extends AbstractServiceImpl<Application, Long> implements ApplicationService {

	@Autowired
	ApplicationRepository applicationRepository;

	@Override public AbstractRepository<Application, Long> getRepository() {
		return applicationRepository;
	}
}
