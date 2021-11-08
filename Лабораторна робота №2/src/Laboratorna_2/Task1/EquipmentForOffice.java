package Laboratorna_2.Task1;

public class EquipmentForOffice extends Equipment {
    private final Long id;
    private final String demand;
    private static Integer count = 0;


    public EquipmentForOffice(final Long id, final String name,
                              final String producer, final double weight,
                              final String color, final String demand) {
        this.setName(name);
        this.setWeight(weight);
        this.setColor(color);
        this.setProducer(producer);
        this.id = id;
        this.demand = demand;
    }

    public EquipmentForOffice(final Long id, final String demand) {
        this.id = id;
        this.demand = demand;
    }

    public static void setCount(final Integer count) {
        EquipmentForOffice.count = count;
    }

    public Long getId() {
        return this.id;
    }
    public String getDemand() {
        return this.demand;
    }


}
