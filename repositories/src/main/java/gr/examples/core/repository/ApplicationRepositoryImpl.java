package gr.examples.core.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import gr.examples.domain.Application;

@Repository
public class ApplicationRepositoryImpl extends AbstractRepositoryImpl<Application, Long> implements ApplicationRepository {

	List<Application> APPS = Arrays.asList(new Application[]{new Application(0L, "app0"), new Application(1L, "app1"), new Application(2L, "app2")});

	@Override protected List<Application> getObjects() {
		return APPS;
	}

//	@Override public List<Application> get() {
//		return APPS;
//	}
//
//	@Override public Application get(final Long id) {
//		Stream<Application> appStream = APPS.stream().filter(application -> id.equals(application.getId()));
//		return appStream.findFirst().get();
//	}
//
//	@Override public Application create(final Application entity) {
//		APPS.add(entity);
//		return entity;
//	}
//
//	@Override public Application update(final Application entity) throws Exception {
//		if (!APPS.remove(entity)) {
//			throw new Exception(String.format("Application with id [%d] not found", entity.getId()));
//		}
//		APPS.add(entity);
//		return entity;
//	}
//
//	@Override public void delete(final Application entity) throws Exception {
//		if (!APPS.remove(entity)) {
//			throw new Exception(String.format("Application with id [%d] not found", entity.getId()));
//		}
//	}


}
