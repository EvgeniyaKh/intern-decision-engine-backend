package ee.taltech.inbankbackend.endpoint;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Holds the request data of the REST endpoint
 */
@Getter
@AllArgsConstructor
public class DecisionRequest {
    private String userCountry;
    private String personalCode;
    private Long loanAmount;
    private int loanPeriod;
}
