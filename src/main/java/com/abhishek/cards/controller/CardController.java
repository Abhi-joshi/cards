package com.abhishek.cards.controller;

import com.abhishek.cards.client.ConfigProperties;
import com.abhishek.cards.model.Card;
import com.abhishek.cards.service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/details/{customerId}")
    public List<Card> cardDetails(@PathVariable int customerId){
        return this.cardService.findCardDetails(customerId);
    }

    @GetMapping("/properties")
    public Mono<ConfigProperties> properties() {
        return cardService.getProperties();
    }

}
