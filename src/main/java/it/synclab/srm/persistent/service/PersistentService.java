package it.synclab.srm.persistent.service;

import java.util.List;

public interface PersistentService {
	public List<Object> selectAll(int maxResult);
	
	public int deleteAll();
	
	public void delete(Object object);
	
	public void saveOrUpdate(Object object);
	
	public void update(Object object);
	
	public void save(Object object);
}
