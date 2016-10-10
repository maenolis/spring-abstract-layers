package gr.examples.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import gr.examples.core.service.AbstractService;

public abstract class AbstractRestController<T, D, I> {

	@GetMapping
	public List<D> get() {
		return getService().get();
	}

	@GetMapping("/{id}")
	public D getById(@PathVariable I id) {
		return getService().get(id);
	}

	@PostMapping
	public D create(@RequestBody D entity) {
		return getService().create(entity);
	}

	@PutMapping
	public D update(@RequestBody D entity) {
		return getService().update(entity);
	}

	@DeleteMapping
	public void delete(@RequestBody D entity) {
		getService().delete(entity);
	}

	protected abstract AbstractService<T, D, I> getService();
}
