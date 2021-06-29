package com.taranenkonat.msscbrewery.service;

import com.taranenkonat.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
