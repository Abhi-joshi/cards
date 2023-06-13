package com.abhishek.cards.service;

import com.abhishek.cards.model.Card;
import reactor.core.publisher.Flux;

public interface CardService {

    Flux<Card> findCardDetails(int customerId);
}
