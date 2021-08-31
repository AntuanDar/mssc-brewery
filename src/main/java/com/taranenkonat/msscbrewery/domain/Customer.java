package com.taranenkonat.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by taranenko on 31.08.2021
 * description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private UUID id;

    @NotBlank
    @Size(min = 3, max = 1000)
    private String customerName;
}
