package by.klintsov.dao;

import by.klintsov.bean.Device;
import by.klintsov.dao.exception.DAOException;

public interface IDeviceDAO {
    Device findDevice(/*criteria*/) throws DAOException;
    void addDevice(Device other) throws  DAOException;
}
