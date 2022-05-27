package com.cotation.controller;

import com.cotation.dto.CurrencyDTO;
import com.cotation.model.Currency;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CurrencyController {

	private final RestTemplate restTemplate = new RestTemplate();
	private static final String url = "https://economia.awesomeapi.com.br/json/all";
	
	@GetMapping("/call-cotation-coin")
	public ResponseEntity<List<CurrencyDTO>> getCurrencies() {

		Currency currency = restTemplate.getForObject(url, Currency.class);

		if(currency != null){
			List<CurrencyDTO> result = Arrays.asList(
					new CurrencyDTO(currency.getUsd().getName(), currency.getUsd().getBid()),
					new CurrencyDTO(currency.getEur().getName(), currency.getEur().getBid()),
					new CurrencyDTO(currency.getBtc().getName(), currency.getBtc().getBid())
			);

			return ResponseEntity.ok(result);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}