package gr.ex.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import gr.ex.domain.Application;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository {

	List<Application> APPS = Arrays.asList(new Application[]{new Application(0L, "app0"), new Application(1L, "app1"), new Application(2L, "app2")});

	@Override public List<Application> get() {
		return APPS;
	}

	@Override public Application get(final Long id) {
		Stream<Application> appStream = APPS.stream().filter(application -> id.equals(application.getId()));
		return appStream.findFirst().get();
	}

	@Override public Application create(final Application entity) {
		return null;
	}

	@Override public Application update(final Application entity) {
		return null;
	}

	@Override public void delete(final Application entity) {

	}
}
