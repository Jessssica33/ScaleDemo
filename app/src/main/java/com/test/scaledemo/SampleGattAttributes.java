package com.test.scaledemo;

import java.util.HashMap;

/**
 * Created by jessica on 1/22/19.
 */

public class SampleGattAttributes {

    private static HashMap<String, String> attributes = new HashMap();

    public static String BluetoothGattCharacteristic = "2456e1b9-26e2-8f83-e744-f34f01e9d703";
    public static String BluetoothGattDescriptor = "00002902-0000-1000-8000-00805f9b34fb";
    static {
        // Sample Services.
        attributes.put("2456e1b9-26e2-8f83-e744-f34f01e9d701", "Device Information Service");
        // Sample Characteristics.
        attributes.put("2456e1b9-26e2-8f83-e744-f34f01e9d703", "characteristics");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
