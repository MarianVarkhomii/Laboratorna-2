package Laboratorna_2.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Equipment office = new EquipmentForOffice(1L, "Computer desk", "Intarsio Tech", 1.1D, "black", "Office");
        final Equipment phone = new PhoneEquipment(2L, "Phone", "Samsung", 0.5D, "grey", PhoneType.SENSOR);
        final Equipment computerEquipment = new ComputerEquipment(4L, "Laptop", "Hewlett Packard", 1.3D, "black", TypeOfMaterial.METAL);
        final int n = 3;
        final List<Equipment> equipmentList = new ArrayList();
        equipmentList.add(office);
        equipmentList.add(phone);
        equipmentList.add(computerEquipment);
        System.out.println(equipmentList);
    }
}
