package org.mad.money.oo;

import java.math.BigDecimal;

public interface Discount {
    BigDecimal applyDiscount(BigDecimal amount);
}
