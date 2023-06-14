package com.abhishek.cards.service.impl;

import com.abhishek.cards.client.ConfigProperties;
import com.abhishek.cards.config.CardsConfig;
import com.abhishek.cards.model.Card;
import com.abhishek.cards.repository.CardRepository;
import com.abhishek.cards.service.CardService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final CardsConfig cardsConfig;

    public CardServiceImpl(CardRepository cardRepository, CardsConfig cardsConfig) {
        this.cardRepository = cardRepository;
        this.cardsConfig = cardsConfig;
    }

    @Override
    public List<Card> findCardDetails(int customerId) {
        return this.cardRepository.findByCustomerId(customerId);
    }

    @Override
    public Mono<ConfigProperties> getProperties() {
        ConfigProperties configProperties = new ConfigProperties(this.cardsConfig.getMsg(), this.cardsConfig.getPassword());
        return Mono.just(configProperties);
    }
}
