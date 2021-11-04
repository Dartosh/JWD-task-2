package by.klintsov.dao.factory;

import by.klintsov.dao.IDeviceDAO;
import by.klintsov.dao.impl.XMLDeviceDAO;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final IDeviceDAO xmlDeviceImpl = new XMLDeviceDAO();

    private DAOFactory() {
        //realization
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public IDeviceDAO getDeviceDAO() {
        return xmlDeviceImpl;
    }


}
