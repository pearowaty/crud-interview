


## Instalacja
Jednym ze sposobów jest wykonanie głównej metody w klasie `com.example.demo.DemoApplication` ze środowiska IDE

## Informacje techniczne
W projekcie wykorzystano: 
- Java w wersji 8
- Maven
- Spring boot
- Baza danych H2
## Endpointy:
* Lista wszystkich cytatów:
    * GET http://localhost:8080/quotes
* Pojedynczy cytat:
    * GET http://localhost:8080/quotes/{id}
* Usunięcie konkretnego cytatu:
    * DELETE http://localhost:8080/quotes/{id}
* Dodanie cytatu:
    * POST http://localhost:8080/quotes
* Zaktualowanie obecnego cytatu:
    * POST http://localhost:8080/quotes/{id}

## Request & Response przykłady

### GET /quotes

Example: http://localhost:8080/quotes

Response body:

    [
        {
            "id": 1,
            "author": "Brian Tracy",
            "content": "The more credit you give away, the more will come back to you. The more you help others, the more they will want to help you."
        },
        {
            "id": 2,
            "author": "Steve Jobs",
            "content": "My favorite things in life don’t cost any money. It’s really clear that the most precious resource we all have is time."
        }
    ]


### GET /quotes/[id]

Example: http://localhost:8080/quotes/1

Response body:

    {
        "id": 1,
        "author": "Brian Tracy",
        "content": "The more credit you give away, the more will come back to you. The more you help others, the more they will want to help you."
    }



### POST /quotes

Example: Create – POST  http://localhost:8080/quotes

Request body:

    {
        "content": "The more credit you give away, the more will come back to you. The more you help others, the more they will want to help you.",  
        "author": "Brian Tracy"
    }

### DELETE /quotes/{id}

Example: Update – POST  http://localhost:8080/quotes/1

Request body:

    {
        "content": "Sometimes life hits you in the head with a brick. Don’t lose faith.",  
        "author": "Brian Tracy"
    }    

### POST /quotes/{id}

Example: Delete – DELETE  http://localhost:8080/quotes/1
