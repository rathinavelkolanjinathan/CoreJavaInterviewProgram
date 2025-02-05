package org.enumprogram;

import org.concurrencyapi.Declare;

public class EnumValueof {

    public static void main(String[] args) {
        Declare[] d=Declare.values();
       // Declare[] d=Declare.valueOf("EAST");

        for(Declare dd:d)
        System.out.print("enum values "+dd);
    }
}
