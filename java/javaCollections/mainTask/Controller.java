package javaCollections.mainTask;

import javaCollections.mainTask.actionsByTask.CreatureDevices;
import javaCollections.mainTask.actionsByTask.Device;
import javaCollections.mainTask.actionsByTask.SortByPower;

import java.util.Collections;
import java.util.List;


public class Controller  {
    List<Device> devices = CreatureDevices.addDevice();
    public void sortByPower() {

       Collections.sort(devices, new SortByPower());
        for (Device device : devices) {
            System.out.println("Type " + device.getDeviceType() + " Power=" + device.getPowerOfDevice());
        }
    }

    public void totalPowerConsumption(){
        int totalPower=0;
        for (Device device : devices){
            if (device.isOnOff()){
                totalPower= totalPower+device.getPowerOfDevice();
            }
        }
        System.out.println(totalPower);

    }

    public void sortByParameters(){

        for (Device device : devices){
            if (device.getPowerOfDevice()>900 && device.getPowerOfDevice()<1700){
                System.out.println("Type "+device.getDeviceType()+" "+ "Power="+device.getPowerOfDevice());
            }

        }


    }

}
