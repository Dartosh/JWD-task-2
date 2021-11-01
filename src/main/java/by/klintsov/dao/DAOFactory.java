package by.klintsov.dao;

import by.klintsov.dao.IDeviceDAO;
import by.klintsov.dao.impl.XMLDeviceDAO;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final IDeviceDAO xmlDeviceImpl = new XMLDeviceDAO();

    private DAOFactory() {
        //realization
    }

    public IDeviceDAO getDeviceDAO() {
        return xmlDeviceImpl;
    }
}
