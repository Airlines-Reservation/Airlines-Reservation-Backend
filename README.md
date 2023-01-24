# Airlines Reservation
We are implementing a simple Airlines Reservations Information System that manages the available flights, and assigns them to clients if they're available and generates tickets for them.

Expected classes and respective properties and methods:
```txt
Flight
    └── id
    └── code
    └── departure
    └── destination
    └── departureTime
    └── pilot
    └── passengers
    └── isCanceled
    └── limit
Ticket
    └── id
    └── code
    └── owner
    └── flightId
    └── issueDate
    └── expirationDate
Passport
    └── id
    └── isValid
    └── expirationDate
    └── issueDate
    └── owner
    └── range
    └── nationality
Person
    └── id
    └── firstname
    └── lastname
    └── dob
    └── nationality
Pilot [extends Person]
    └── id
    └── pilotCode

```

More to be added later