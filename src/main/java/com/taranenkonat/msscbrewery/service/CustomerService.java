package com.taranenkonat.msscbrewery.service;

import com.taranenkonat.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}
