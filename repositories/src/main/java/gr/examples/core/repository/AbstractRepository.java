package gr.examples.core.repository;

import java.util.List;

import gr.examples.domain.AbstractEntity;

public interface AbstractRepository<T extends AbstractEntity<I>, I> {
	List<T> get();

	T get(I id);

	T create(T entity);

	T update(T entity) throws Exception;

	void delete(T entity) throws Exception;
}
