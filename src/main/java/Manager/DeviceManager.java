package Manager;

import Model.Device;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class DeviceManager {

    private String base;
    private Client client;

    public DeviceManager() {
        client = ClientBuilder.newClient();
        base = "http://172.20.10.4:8080/SmartHouseApi/devices/";
    }

    public void updateDevice(Device device, long deviceId) {
        WebTarget target = client.target(base).path("{deviceId}");
        target.resolveTemplate("deviceId", deviceId)
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.json(device), Device.class);
    }
}
