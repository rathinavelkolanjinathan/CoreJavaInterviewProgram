package org.dataStructure.stringprogram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomImmutable {

    private final String name;
    private final int id;
    private final List<String> mobile;

    public CustomImmutable(String name, int id, List<String> mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public static void main(String[] args) {
        Date date = new Date();
        List<String> list = new ArrayList();
        list.add("25");
        CustomImmutable cust = new CustomImmutable("hi", 20, Arrays.stream(new String[]{"123", "452"}).collect(Collectors.toList()));

        // cust.name="kolanji";
        cust.getMobile().add("950");
        System.out.println("Immutable"+cust.toString());
    }

}
