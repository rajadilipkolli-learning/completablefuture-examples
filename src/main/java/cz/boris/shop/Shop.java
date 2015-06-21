package cz.boris.shop;

import lombok.Data;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Data
public class Shop {

    private final String name;

    public Future<BigDecimal> getPriceAsync() {
        CompletableFuture<BigDecimal> future = new CompletableFuture<>();
        new Thread(() -> {
            try {
                BigDecimal price = calculatePrice();
                future.complete(price);
            } catch (Exception e) {
                future.completeExceptionally(e);
            }
        }).start();
        return future;
    }

    public BigDecimal getPrice() {
        return calculatePrice();
    }

    public BigDecimal calculatePrice() {
        SlowNetwork.delay(1);
        return BigDecimal.valueOf(Randomizer.random(1000));
    }

}
