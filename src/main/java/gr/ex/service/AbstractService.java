package gr.ex.service;

import java.util.List;

import gr.ex.repository.AbstractRepository;
import gr.ex.service.transform.TransformationService;

public interface AbstractService<T, D, I> {

	List<D> get();

	D get(I id);

	D create(D entity);

	D update(D entity);

	void delete(D entity);

	AbstractRepository<T, I> getRepository();

	TransformationService<T, D> getTransformationService();
}
