package com.onepiececollection.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CardService {
    private List<Card> cardList = new ArrayList<>();

    public CardService() {
        
        cardList.add(new Card("OP01-001", "Roronoa Zoro", "Leader", "Red"));
        cardList.add(new Card("OP01-002", "Trafalgar Law", "Leader", "Red/Green"));
        cardList.add(new Card("OP01-003", "Monkey.D.Luffy", "Leader", "Red/Green"));
    
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public Card getIndividualCard(String cardNumber) {
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
