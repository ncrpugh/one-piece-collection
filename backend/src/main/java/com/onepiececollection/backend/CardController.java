package com.onepiececollection.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;




@RestController
public class CardController {
    private final CardService cardService;
    
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }
    
    @GetMapping("/cards")
    public List<Card> cardEndpoint() {
        return cardService.getCardList();
    }

    @GetMapping("/cards/{cardNumber}")
    public Card getIndividualCard(@PathVariable String cardNumber) {
        return cardService.getIndividualCard(cardNumber);
    } 
}
