package by.klintsov.service;

import by.klintsov.bean.Device;

public interface IStoreService {
    void addNewDevice(Device device);
    Device findDevice(/*criteria*/);
}
