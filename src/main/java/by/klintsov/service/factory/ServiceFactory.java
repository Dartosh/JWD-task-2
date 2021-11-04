package by.klintsov.service.factory;

import by.klintsov.service.IStoreService;
import by.klintsov.service.impl.StoreServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final IStoreService storeService = new StoreServiceImpl();

    private ServiceFactory() {
        //realization
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public IStoreService getStoreService() {
        return storeService;
    }
}
