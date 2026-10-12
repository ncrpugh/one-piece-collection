package com.onepiececollection.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

@RestController
public class CardController {
    private List<Card> cardList = new ArrayList<>();

    public CardController() {
        cardList.add(new Card("OP01-001", "Roronoa Zoro", "Leader", "Red"));
        cardList.add(new Card("OP01-002", "Trafalgar Law", "Leader", "Red/Green"));
        cardList.add(new Card("OP01-003", "Monkey.D.Luffy", "Leader", "Red/Green"));
    }
    
    @GetMapping("/cards")
    public List<Card> cardEndpoint() {
        return cardList;
    }

    @GetMapping("/cards/{cardNumber}")
    public Card getIndividualCard(@PathVariable String cardNumber) {
        for (Card card:cardList) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Card not found"
        );
    }
    
    
}
