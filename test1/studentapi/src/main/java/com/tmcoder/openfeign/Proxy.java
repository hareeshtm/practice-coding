package com.tmcoder.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tmcoder.dto.Quote;

@FeignClient(name="quote-service",url="https://quoters.apps.pcfone.io")
public interface Proxy {
	
	@GetMapping("/api/random")
	Quote getQuote();

}
