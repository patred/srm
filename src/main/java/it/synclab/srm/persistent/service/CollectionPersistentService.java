package it.synclab.srm.persistent.service;

import java.util.List;

public class CollectionPersistentService implements PersistentService {
	
	private static CollectionPersistentService instance;
	
	public static synchronized CollectionPersistentService getInstance() {
		if (instance == null)
			instance = new CollectionPersistentService();
		return instance;
	}
	
	@Override
	public List<Object> selectAll(int maxResult) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void saveOrUpdate(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void save(Object object) {
		// TODO Auto-generated method stub
		
	}
	
}
