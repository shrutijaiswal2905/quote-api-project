package com.devops;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class QuoteApiApplicationTests {

    @Test
    void quoteEndpointShouldReturnQuote() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8081/quote", String.class);
        assertThat(result).isEqualTo("Stay hungry, stay foolish.");
    }
}
