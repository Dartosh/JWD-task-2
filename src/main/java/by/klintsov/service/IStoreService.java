package by.klintsov.service;

import by.klintsov.entity.Device;
import by.klintsov.service.exception.ServiceException;

public interface IStoreService {
    void addDevice(Device device) throws ServiceException;
    Device findDevice(Criteria criteria) throws ServiceException;
}
