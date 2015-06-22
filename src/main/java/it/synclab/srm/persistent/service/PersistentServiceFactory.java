package it.synclab.srm.persistent.service;

public class PersistentServiceFactory {
	public static PersistentService getDBPersistentService() {
		/* TODO */
		return null;
	}
	
	public static PersistentService getFilePersistentService() {
		/* TODO */
		return null;
	}
	
	public static PersistentService getColleactionPersistentService() {
		return CollectionPersistentService.getInstance();
	}
}
