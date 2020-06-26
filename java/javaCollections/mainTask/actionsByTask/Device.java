package javaCollections.mainTask.actionsByTask;

import javaCollections.mainTask.devicesType.DeviceType;

public class Device  {
 private DeviceType deviceType;
 private int powerOfDevice;
 private boolean onOff;

    public Device(DeviceType deviceType, int powerOfDevice, boolean onOff) {
        this.deviceType = deviceType;
        this.powerOfDevice = powerOfDevice;
        this.onOff = onOff;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public int getPowerOfDevice() {
        return powerOfDevice;
    }

    public void setPowerOfDevice(int powerOfDevice) {
        this.powerOfDevice = powerOfDevice;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
}
