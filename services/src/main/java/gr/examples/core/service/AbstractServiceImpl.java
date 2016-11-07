package gr.examples.core.service;

import java.util.List;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.domain.AbstractEntity;

public abstract class AbstractServiceImpl<T extends AbstractEntity<I>, I> implements AbstractService<T, I> {

	@Override public List<T> get() throws Exception {
		return getRepository().get();
	}

	@Override
	public T get(final I id) throws InstantiationException {
		T entity = getRepository().get(id);
		if (entity == null) {
			throw new InstantiationException(String.format("Entity with id [%s] was not found.", id.toString()));
		}
		return entity;
	}

	@Override public T create(final T entity) {
		return getRepository().create(entity);
	}

	@Override public T update(final T entity) throws Exception {
		return getRepository().update(entity);
	}

	@Override public void delete(final T entity) throws Exception {
		getRepository().delete(entity);
	}

	@Override public abstract AbstractRepository<T, I> getRepository();
}
