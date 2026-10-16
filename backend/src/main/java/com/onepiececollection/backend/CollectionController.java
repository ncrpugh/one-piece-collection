package com.onepiececollection.backend;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CollectionController {
    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }
    
    @GetMapping("/collection")
    public List<CollectionEntry> getCollection() {
        return collectionService.getCollection();
    }  

    @GetMapping("/collection/{cardNumber}")
    public CollectionEntry getIndividualCollectionEntry(@PathVariable String cardNumber) {
        return collectionService.getIndividualCollectionEntry(cardNumber);
    }

    @GetMapping("/collection/total-cards-owned")
    public int getTotalCardsOwned() {
        return collectionService.getTotalCardsOwned();
    }
    
}

