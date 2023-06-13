package com.abhishek.cards.service;

import com.abhishek.cards.client.ConfigProperties;
import com.abhishek.cards.model.Card;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CardService {

    List<Card> findCardDetails(int customerId);

    Mono<ConfigProperties> getProperties();
}
