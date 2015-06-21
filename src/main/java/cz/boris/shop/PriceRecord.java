package cz.boris.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PriceRecord {
    private Discount.Code code;
    private BigDecimal price;
}
