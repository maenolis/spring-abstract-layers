package gr.ex.repository;

import java.util.List;

public interface AbstractRepository<T, I> {
	List<T> get();

	T get(I id);

	T create(T entity);

	T update(T entity);

	void delete(T entity);
}
