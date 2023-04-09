# world countries api
## Global Hack Week MLH

**The API provides the following functionalities:**

##### Get a list of all countries:

` Request: GET /countries`

Response: A JSON array containing all the countries in the system, with their respective ID, code, name (in French and English), alpha2 and alpha3 codes.
##### Get a specific country by ID:

`Request: GET /countries/{id}`

Response: A JSON object containing the details of the country with the specified ID, including its code, name (in French and English), alpha2 and alpha3 codes.

##### Get a list of countries by name:

`Request: GET /countries?name={name}`

Response: A JSON array containing all the countries whose name (in French or English) contains the specified search term, along with their respective ID, code, name (in French and English), alpha2 and alpha3 codes.

##### Search for countries using any attribute:

`Request: GET /countries/search?q={query}`

Response: A JSON array containing all the countries who's any attribute contains the specified search term, along with their respective ID, code, name (in French and English), alpha2 and alpha3 codes.
The API is implemented using Spring Boot and utilizes the JPA/Hibernate framework for data persistence. The data model is represented by the "Country" entity, which is mapped to a database table called "COUNTRIES". The entity has the following attributes:

**Full Changelog**: https://github.com/geoffreylgv/API-world_countries/commits/v1.0.0


id: A unique identifier for each country.<br>
code: A unique code assigned to each country.<br>
nameFR: The name of the country in French.<br>
nameEN: The name of the country in English.<br>
alpha2: The two-letter code assigned to each country.<br>
alpha3: The three-letter code assigned to each country.<br>

<quote>The entity also includes standard JPA annotations for defining the mapping to the database table and managing the persistence of the entity instances. The Lombok library is used to generate getters, setters, equals and hashcode methods for the entity class.</quote>

## How to use locally
1. Download the repos, 
2. make sure to update the application.propertie in resources folder 
3. make a clean and build and 
4. run <br>

>Insert country's data into countries table; that's all. With love, thanks you for reading. ^_^
