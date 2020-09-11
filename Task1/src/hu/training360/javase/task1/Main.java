package hu.training360.javase.task1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PacketProduct packetProduct = new PacketProduct("Orange", BigDecimal.valueOf(10),
                2, 1, BigDecimal.valueOf(6));

        BigDecimal tw = packetProduct.totalWeight(1);

        System.out.println("Total: " + tw);
    }
}
