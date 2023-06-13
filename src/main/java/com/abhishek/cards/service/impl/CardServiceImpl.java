package com.abhishek.cards.service.impl;

import com.abhishek.cards.model.Card;
import com.abhishek.cards.repository.CardRepository;
import com.abhishek.cards.service.CardService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Flux<Card> findCardDetails(int customerId) {
        return Flux.fromIterable(this.cardRepository.findByCustomerId(customerId));
    }
}
