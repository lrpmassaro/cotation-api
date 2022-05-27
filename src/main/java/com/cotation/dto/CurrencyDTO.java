package com.cotation.dto;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CurrencyDTO {
    private String name;
    private String bid;
}
