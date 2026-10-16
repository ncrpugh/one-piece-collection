package com.onepiececollection.backend;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CollectionService {
    private List<CollectionEntry> collection = new ArrayList<>();

    public CollectionService(CardService cardService) {

        collection.add(new CollectionEntry(cardService.getCardList().get(0), 3));
        collection.add(new CollectionEntry(cardService.getCardList().get(1), 2));

    }

    public List<CollectionEntry> getCollection() {
        return collection;
    }  

    public int getTotalCardsOwned() {
        int total = 0;
        for (CollectionEntry entry:collection) {
            total += entry.getQuantityOwned();
        }
        return total;
    }

    public CollectionEntry getIndividualCollectionEntry(String cardNumber) {
        for (CollectionEntry entry:collection) {
            if (entry.getCard().getCardNumber().equals(cardNumber)) {
                return entry;
            }
        }
        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Entry not found"
        );
    }
}
