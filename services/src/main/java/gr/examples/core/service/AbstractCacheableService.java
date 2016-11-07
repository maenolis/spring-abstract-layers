package gr.examples.core.service;

import gr.examples.domain.AbstractEntity;

public interface AbstractCacheableService<T extends AbstractEntity<I>, I> extends AbstractService<T, I> {
	String getCacheName();
}
