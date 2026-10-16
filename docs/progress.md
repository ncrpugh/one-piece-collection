# Development Progress

## Session: 12 October 2026

### Completed
- Created the initial Spring Boot backend.
- Added a `Card` class with private fields and a constructor.
- Added getters to expose card properties.
- Created `GET /cards` to return a list of sample cards as JSON.
- Created `GET /cards/{cardNumber}` to retrieve an individual card.
- Added a `404 Not Found` response when a requested card doesn't exist.

### Next session
- Reopen the project and run the backend.
- Briefly revisit the two card endpoints to reinforce today's learning.
- Continue developing the API, keeping the next task small and connected to the collection app.


## 13 October 2026 — Backend Refactoring

### Completed
- Refactored the backend to separate `CardController` and `CollectionController` from their respective services.
- Created `CardService` to manage the card catalogue and handle card lookups.
- Created `CollectionService` to manage collection entries and handle collection lookups.
- Introduced Spring-managed services using `@Service` and constructor injection.
- Learned how constructor injection allows services and controllers to share the same service instance, avoiding separate, potentially inconsistent copies of data.
- Confirmed that the existing endpoints still work, including returning `404 Not Found` for cards or collection entries that don't exist.

### Next Steps
- Continue improving the backend structure.
- Eventually introduce a repository/data access layer and PostgreSQL to persist the catalogue and collection data.

### Notes
Today's focus was understanding the reasoning behind the architecture, not just implementing it. The controllers handle HTTP requests, services handle application operations, and constructor injection lets Spring connect the required objects.


## 16 October 2026 — Collection Statistics

### Completed
- Added `getTotalCardsOwned()` to `CollectionService` to calculate the total number of cards owned.
- Added `GET /collection/total-cards-owned` to `CollectionController`.
- Tested the endpoint and confirmed it correctly returns `5`.

### Next Steps
- Continue developing collection features and work towards integrating a proper card database.
