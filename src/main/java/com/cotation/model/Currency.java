package com.cotation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Currency implements Serializable {

	@JsonProperty("USD")
	private USD usd;
	@JsonProperty("EUR")
	private EUR eur;
	@JsonProperty("BTC")
	private BTC btc;

	@Data
	@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
	@ToString
	@EqualsAndHashCode
	@AllArgsConstructor
	public static class USD {
		private String name;
		private String bid;
	}

	@Data
	@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
	@ToString
	@EqualsAndHashCode
	@AllArgsConstructor
	public static class EUR {
		private String name;
		private String bid;
	}

	@Data
	@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
	@ToString
	@EqualsAndHashCode
	@AllArgsConstructor
	public static class BTC {
		private String name;
		private String bid;
	}
}
