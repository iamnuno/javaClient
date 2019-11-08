import Manager.DeviceManager;
import Model.Device;

public class Main {

    public static void main(String[] args) {

        String deviceId = args[0];
        String deviceName = args[1];
        String deviceStatus = args[2];
        Device device = new Device(deviceId, deviceName, deviceStatus);
        DeviceManager deviceManager = new DeviceManager();
        deviceManager.updateDevice(device, Integer.parseInt(deviceId));

//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);

    }
}
