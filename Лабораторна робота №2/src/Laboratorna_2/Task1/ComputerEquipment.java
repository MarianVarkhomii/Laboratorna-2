package Laboratorna_2.Task1;

public class ComputerEquipment extends Equipment {
    private final Long id;
    private final TypeOfMaterial typeOfMaterial;
    private static Integer count = 0;

    public ComputerEquipment(final Long id, final String name, final String producer,
                             final double weight, final String color, final TypeOfMaterial typeOfMaterial) {
        this.setName(name);
        this.setWeight(weight);
        this.setColor(color);
        this.setProducer(producer);
        this.id = id;
        this.typeOfMaterial = typeOfMaterial;
    }

    public Long getId() {
        return this.id;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(final Integer count) {
        ComputerEquipment.count = count;
    }

    public String toString() {
        return "ComputerEquipment{id=" + id + ", typeOfMaterial=" + this.typeOfMaterial + "}" + super.toString();
    }
}
