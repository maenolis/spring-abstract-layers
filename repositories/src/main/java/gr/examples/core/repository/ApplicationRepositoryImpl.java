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

}
