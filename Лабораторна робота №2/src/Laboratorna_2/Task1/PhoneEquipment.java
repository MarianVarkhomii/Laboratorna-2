package Laboratorna_2.Task1;

public class PhoneEquipment extends Equipment {
    private final Long id;
    private final PhoneType typePhone;
    private static Integer count = 0;


    public PhoneEquipment(final Long id, final String name, final String producer, final double weight, final String color, final PhoneType typePhone) {
        this.setName(name);
        this.setWeight(weight);
        this.setColor(color);
        this.setProducer(producer);
        this.id = id;
        this.typePhone = typePhone;
    }
    public PhoneEquipment(final Long id, final PhoneType typePhone) {
        this.id = id;
        this.typePhone = typePhone;
    }

    public Long getId() {
        return this.id;
    }

    public PhoneType getTypePhone() {
        return this.typePhone;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(final Integer count) {
        PhoneEquipment.count = count;
    }

    public String toString() {
        return "PhoneEquipment{id=" + id + ", typePhone=" + this.typePhone + "} " + super.toString();
    }

}
