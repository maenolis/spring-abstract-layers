package gr.examples.core.service.transform;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import gr.examples.domain.Application;
import gr.examples.transport.ApplicationDto;

@Service
public class ApplicationTransformationServiceImpl implements ApplicationTransformationService {
	@Override public Application transformToEntity(final ApplicationDto entity) {
		return new Application(entity.getId(), entity.getName());
	}

	@Override public List<Application> transformToEntity(final List<ApplicationDto> entities) {
		return entities.stream().map(applicationDto -> transformToEntity(applicationDto)).collect(Collectors.toList());
	}

	@Override public ApplicationDto transformToDto(final Application entity) {
		return new ApplicationDto(entity.getId(), entity.getName());
	}

	@Override public List<ApplicationDto> transformToDto(final List<Application> entities) {
		return entities.stream().map(application -> transformToDto(application)).collect(Collectors.toList());
	}
}
