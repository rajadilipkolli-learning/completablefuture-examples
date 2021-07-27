package cz.boris.shop;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceRecord {

    private Discount.Code code;
    private BigDecimal price;

    public PriceRecord(Discount.Code code, BigDecimal price) {
        this.code = code;
        this.price = price;
    }
}
