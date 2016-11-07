package gr.examples.core.repository;

import java.util.List;
import java.util.stream.Stream;

import gr.examples.domain.AbstractEntity;

public abstract class AbstractRepositoryImpl<T extends AbstractEntity<I>, I> implements AbstractRepository<T, I> {
	@Override public List<T> get() {
		return getObjects();
	}

	@Override public T get(final I id) {
		Stream<T> stream = getObjects().stream().filter(value -> id.equals(value.getId()));
		return stream.findFirst().get();
	}

	@Override public T create(final T entity) {
		getObjects().add(entity);
		return entity;
	}

	@Override public T update(final T entity) throws Exception {
		if (!getObjects().remove(entity)) {
			throw new Exception(String.format("Entity with id [%d] not found", entity.getId()));
		}
		getObjects().add(entity);
		return entity;
	}

	@Override public void delete(final T entity) throws Exception {
		if (!getObjects().remove(entity)) {
			throw new Exception(String.format("Entity with id [%d] not found", entity.getId()));
		}
	}

	protected abstract List<T> getObjects();
}
