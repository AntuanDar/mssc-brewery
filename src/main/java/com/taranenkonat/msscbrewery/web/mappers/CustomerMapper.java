package com.taranenkonat.msscbrewery.web.mappers;

import com.taranenkonat.msscbrewery.domain.Customer;
import com.taranenkonat.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by taranenko on 31.08.2021
 * description:
 */

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto dto);
}
