package javaCollections.mainTask.actionsByTask;


import javaCollections.mainTask.devicesType.DeviceType;

import java.util.ArrayList;
import java.util.List;


public class CreatureDevices  {

    public static List<Device> addDevice ()   {
        List<Device> devices = new ArrayList<>();
        Device kettle = new Device(DeviceType.KETTLE, 1000, true);
        Device tv = new Device(DeviceType.TV, 800, true);
        Device notebook = new Device(DeviceType.NOTEBOOK, 1500, false);
        Device lamp = new Device(DeviceType.LAMP, 600, false);
        Device refrigerator = new Device(DeviceType.REFRIGERATOR, 2000, true);

        devices.add(kettle);
        devices.add(tv);
        devices.add(notebook);
        devices.add(lamp);
        devices.add(refrigerator);

return devices;
    }

}
