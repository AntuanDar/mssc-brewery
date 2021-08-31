package com.taranenkonat.msscbrewery.web.mappers;

import com.taranenkonat.msscbrewery.domain.Beer;
import com.taranenkonat.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by taranenko on 31.08.2021
 * description:
 */

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
