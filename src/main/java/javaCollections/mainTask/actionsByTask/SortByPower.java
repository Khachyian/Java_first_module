package javaCollections.mainTask.actionsByTask;



import java.util.Comparator;



public class SortByPower  implements Comparator<Device> {
    @Override
    public int compare(Device o1, Device o2) {
        return o1.getPowerOfDevice() - o2.getPowerOfDevice();
    }

}
