package gr.examples.core.service;

public interface AbstractCacheableService<T, I> extends AbstractService<T, I> {
	String getCacheName();
}
