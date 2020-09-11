package hu.training360.javase.task1;

import java.math.BigDecimal;
import java.math.MathContext;

public class Product {

    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimal;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimal) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimal = numberOfDecimal;
    }

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimal = 2;
    }

    public BigDecimal totalWeight(int pieces) {
        MathContext mc = new MathContext(numberOfDecimal);
        return BigDecimal.valueOf(pieces).multiply(unitWeight).round(mc);
    }

    public int getNumberOfDecimal() {
        return numberOfDecimal;
    }
}
