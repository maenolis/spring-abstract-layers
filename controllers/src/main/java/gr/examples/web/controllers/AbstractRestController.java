package gr.examples.web.controllers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.examples.core.service.AbstractService;
import gr.examples.transformation.service.TransformationService;
import gr.examples.transport.dto.AbstractDto;

@RestController
@RequestMapping("/rest")
public abstract class AbstractRestController<T, D extends AbstractDto<I>, I> {

	@GetMapping
	public ResponseEntity<List<D>> get() throws Exception {
		List<T> entities = getService().get();
		return new ResponseEntity<>(getTransformationService().transformToDto(entities), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<D> getById(@PathVariable I id) {
		T entity = getService().get(id);
		return new ResponseEntity<>(getTransformationService().transformToDto(entity), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<D> create(@RequestBody @Valid D entity) throws Exception {
		T transformedEntity = getTransformationService().transformToEntity(entity);
		T createdEntity = getService().create(transformedEntity);
		return new ResponseEntity<>(getTransformationService().transformToDto(createdEntity), HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<D> update(@RequestBody @Valid D entity) {
		T transformedEnity = getTransformationService().transformToEntity(entity);
		T updatedEntity = getService().update(transformedEnity);
		return new ResponseEntity<>(getTransformationService().transformToDto(updatedEntity), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Void> delete(@RequestBody @Valid D entity) {
		T transformedEnity = getTransformationService().transformToEntity(entity);
		getService().delete(transformedEnity);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	protected abstract AbstractService<T, I> getService();

	protected abstract TransformationService<T, D> getTransformationService();

	protected <T> void handleValidation(Set<ConstraintViolation<T>> errors) throws ValidationException {
		String aggregated = errors.stream().map(constraintViolation -> constraintViolation.getMessage()).collect(Collectors.joining());
		if (!StringUtils.isEmpty(aggregated)) {
			throw new ValidationException(aggregated);
		}
	}

}
