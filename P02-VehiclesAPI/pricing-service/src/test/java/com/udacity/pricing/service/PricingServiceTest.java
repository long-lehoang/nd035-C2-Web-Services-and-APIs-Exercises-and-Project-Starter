package com.udacity.pricing.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PricingServiceTest {

    @Test
    public void getPrice() throws PriceException {
        assertNotNull(PricingService.getPrice(1L));
        assertThrows(PriceException.class, () -> {
            PricingService.getPrice(22L);
        });
    }
}