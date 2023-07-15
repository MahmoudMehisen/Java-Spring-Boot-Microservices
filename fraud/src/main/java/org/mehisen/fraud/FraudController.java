package org.mehisen.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudController {
    private final FraudCheckService fraudCheckService;
    @GetMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
