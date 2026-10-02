# App Workflows

## Adding a sorted collection

1. I open the app.
2. I move to the collection page or whatever page allows me to add cards.
3. I filter by set.
4. All base cards from the set are displayed in ascending card number.
5. Each card has `+` and `-` controls so I can adjust the quantity I own.
6. I click `+` the number of times I want to add the card.

   * A `+2` or `+4` option could potentially make bulk entry faster.
7. The process is complete.

**Open questions:**

* How should alternate arts and other card variants be handled?

## Adding a random card

1. Go to the card addition page.
2. Enter the card number in a simplified format, e.g. `OP7, 41`, rather than requiring the exact `OP07-041` syntax.
3. The app interprets the input and resolves it to the correct card.
4. Press Enter.
5. A popup, side panel, or similar interface allows me to enter the quantity I want to add.

   * I should be able to repeatedly press Enter or otherwise quickly increase the quantity.
   * Alternatively, I could enter the quantity directly.
6. The card is added to my collection.

**Open questions:**

* How should invalid or ambiguous card-number input be handled?
* How should alternate arts and other variants be distinguished?
* How can the app help prevent accidentally adding a card that has already been entered?

## Checking your collection

1. Go to the collection page.
2. There should be a search bar where I can search by card number, name, etc.
3. Search using either the card name or a simplified card number.
4. The application interprets the search and finds matching cards in the database.
5. The matching cards are displayed, including images of the cards I own and the quantity I own for each card.


## Building decks with your collection

1. Select the deck I want to build.

   * The deck could potentially be imported using the standard text format used by the official OPTCG Simulator.
2. At the top of the page, display an overall collection summary for the deck:

   * **Cards Owned: XX / YY — ZZ%**
3. Below the summary, display images of the cards I own from the deck, including the quantity I currently own.
4. Display a separate **Cards Missing: XX / YY — ZZ%** section.
5. Below the missing-card summary, display images of the cards I don't have, potentially slightly dulled, along with the quantity I need.
6. Potentially display:

   * Rough total price of the deck.
   * Rough price of the cards still needed.
7. The overall completion percentage should be immediately visible and easy to scan.

   * For example, the percentage could be displayed prominently over the deck's leader card.
   * Visual indicators could potentially change depending on the completion percentage.

**Open questions:**

* Should "cards owned" mean individual cards or required quantities? For example, owning 2 of the 4 required copies.
* How should cards be handled when I own some but not all of the required copies?
* How should alternate arts/variants affect the comparison?

## Locating physical cards

1. Go to the collection or card-location page.
2. Find and select a card.
3. Display additional metadata for the card.
4. Display the physical locations associated with the card.
5. Show how many copies are stored at each location.

### Metadata

Metadata such as physical location and card condition should be optional when adding a card. The application should not require users to provide this information if they do not care about tracking it.
