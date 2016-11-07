package gr.examples.core.service;

import java.util.List;

import gr.examples.core.repository.AbstractRepository;
import gr.examples.domain.AbstractEntity;

public interface AbstractService<T extends AbstractEntity<I>, I> {

	List<T> get() throws Exception;

	T get(I id) throws InstantiationException;

	T create(T entity);

	T update(T entity) throws Exception;

	void delete(T entity) throws Exception;

	AbstractRepository<T, I> getRepository();
}
