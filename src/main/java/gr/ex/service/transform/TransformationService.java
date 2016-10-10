package gr.ex.service.transform;

import java.util.List;

public interface TransformationService<T, D> {
	T transformToEntity(D entity);

	List<T> transformToEntity(List<D> entities);

	D transformToDto(T entity);

	List<D> transformToDto(List<T> entities);
}
