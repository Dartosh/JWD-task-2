package by.klintsov.service;

import by.klintsov.bean.Device;
import by.klintsov.service.exception.ServiceException;

public interface IStoreService {
    void addDevice(Device device) throws ServiceException;
    Device findDevice(/*criteria*/) throws ServiceException;
}
