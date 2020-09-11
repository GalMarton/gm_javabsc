package hu.training360.javase.task1;

import java.math.BigDecimal;
import java.math.MathContext;

public class PacketProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PacketProduct(String name, BigDecimal unitWeight, int numberOfDecimal, int packingUnit, BigDecimal weightOfBox) {

        super(name, unitWeight, numberOfDecimal);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public BigDecimal totalWeight(int pieces) {
        MathContext mc = new MathContext(super.getNumberOfDecimal());
        int piecesPacking = pieces * packingUnit;
        return BigDecimal.valueOf(piecesPacking).multiply(weightOfBox).round(mc);
    }
}
