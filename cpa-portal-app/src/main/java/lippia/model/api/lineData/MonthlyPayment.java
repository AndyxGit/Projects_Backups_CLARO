package lippia.model.api.lineData;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class MonthlyPayment {
    private BigDecimal amount;
    private String expiration;
    private BigDecimal available;
    private BigDecimal consumed;
}
