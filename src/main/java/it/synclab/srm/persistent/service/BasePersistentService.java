package it.synclab.srm.persistent.service;

import java.util.List;
import java.util.logging.Logger;

public class BasePersistentService<T> {
	
	protected Logger logger = Logger.getGlobal();
	protected PersistentService persistentService;
	
	public BasePersistentService() {
		if (persistentService == null)
			persistentService = PersistentServiceFactory.getColleactionPersistentService();
	}
	
	public List<T> getAll() {
		return getAll(Integer.MAX_VALUE);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(Integer maxResult) {
		return (List<T>) persistentService.selectAll(maxResult);
	}
	
	public void deleteAll() {
		persistentService.deleteAll();
	}
	
	public void delete(T object) {
		persistentService.delete(object);
	}
	
	public void saveOrUpdate(T object) {
		persistentService.saveOrUpdate(object);
	}
	
	public void save(T object) {
		persistentService.save(object);
	}
	
	public void update(T object) {
		persistentService.update(object);
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
}