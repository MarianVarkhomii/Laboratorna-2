package Laboratorna_2.Task1;

import java.io.PrintStream;

public class Equipment {
    private Long id;
    private String name;
    private String producer;
    private double weight;
    private String color;
    private static int count = 0;

    public Equipment(final Long id, final String name, final String producer,
                     final double weight, final String color) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.weight = weight;
        this.color = color;
    }

    public Equipment() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(final String producer) {
        this.producer = producer;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(final int count) {
        Equipment.count = count;
    }

    public String toString() {
        return "Equipment{id="
                + this.id + ", name='" + this.name + "', producer='"
                + this.producer + "', weight='" +
                this.weight + "', color='" + this.color + "'}";
    }

}
