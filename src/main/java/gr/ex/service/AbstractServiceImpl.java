package gr.ex.service;

import java.util.List;

import gr.ex.repository.AbstractRepository;
import gr.ex.service.transform.TransformationService;

public abstract class AbstractServiceImpl<T, D, I> implements AbstractService<T, D, I> {

	@Override public List<D> get() {
		return getTransformationService().transformToDto(getRepository().get());
	}

	@Override public D get(final I id) {
		return getTransformationService().transformToDto(getRepository().get(id));
	}

	@Override public D create(final D entity) {
		return getTransformationService().transformToDto(getRepository().create(null));
	}

	@Override public D update(final D entity) {
		return getTransformationService().transformToDto(getRepository().update(null));
	}

	@Override public void delete(final D entity) {
		getRepository().delete(null);
	}

	@Override public abstract AbstractRepository<T, I> getRepository();

	@Override public abstract TransformationService<T, D> getTransformationService();
}
