package gr.examples.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;

public abstract class AbstractCacheableServiceImpl<T, I> extends AbstractServiceImpl<T, I> implements AbstractCacheableService<T, I> {

	@Autowired
	CacheManager cacheManager;

	@Override public List<T> get() throws Exception {
		List<T> cached = (List<T>) getFromCache(getCacheName() + "_all");
		if (cached == null) {
			List<T> fetched = super.get();
			putOrUpdateInCache(getCacheName() + "_all", fetched);
			return fetched;
		} else {
			return cached;
		}
	}

	@Override public T get(final I id) throws InstantiationException {
		T cached = (T) getFromCache(id);
		if (cached == null) {
			T fetched = super.get(id);
			putOrUpdateInCache(id, fetched);
			return fetched;
		} else {
			return cached;
		}
	}

	@Override public T create(final T entity) {
		return super.create(entity);
	}

	@Override public T update(final T entity) throws Exception {
		return super.update(entity);
	}

	@Override public void delete(final T entity) throws Exception {
		super.delete(entity);
	}

	private Object getFromCache(final Object key) {
		return cacheManager.getCache(getCacheName()).get(key);
	}

	private void putOrUpdateInCache(final Object key, final Object obj) {
		cacheManager.getCache(getCacheName()).put(key, obj);
	}

	private void removeFromCache(final Object key) {
		cacheManager.getCache(getCacheName()).evict(key);
	}

	private boolean existsInCache(final Object key) {
		return getFromCache(key) != null;
	}
}
