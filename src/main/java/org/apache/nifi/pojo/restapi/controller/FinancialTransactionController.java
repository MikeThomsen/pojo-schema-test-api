package org.apache.nifi.pojo.restapi.controller;

import org.apache.nifi.pojo.complex.FinancialTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class FinancialTransactionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FinancialTransactionController.class);
    @PutMapping("/")
    public boolean create(@RequestBody  FinancialTransaction transaction) {
        LOGGER.info("Transaction object: " + transaction);

        return true;
    }
}
