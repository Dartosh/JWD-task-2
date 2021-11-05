package by.klintsov.dao;

import by.klintsov.dao.exception.DAOException;
import by.klintsov.entity.Device;

public interface IDeviceDAO {
    Device findDevice(Criteria criteria) throws DAOException;
    void addDevice(Device device) throws DAOException;
}
