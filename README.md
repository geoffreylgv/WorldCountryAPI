## Open Source Programs
<p>Pragrams are more than welcome </p>
 <a href="https://ghw.mlh.io/events/api-week">
 <img width="800" alt="GHW API Days" src="https://github.com/geoffreylgv/API-world_countries/assets/52314615/8b72db59-ca8c-4942-b5ca-65c7211c4a58">
 </a>


# WorldCountryAPI
<p>About the project:</p>
<p>
    <img src="https://img.shields.io/github/issues/geoffreylgv/WorldCountryAPI"> 
    <img src="https://img.shields.io/github/issues-pr/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/forks/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/stars/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/license/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/contributors/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/last-commit/geoffreylgv/WorldCountryAPI">
    <img src="https://img.shields.io/github/watchers/geoffreylgv/WorldCountryAPI">
</p>

<p>Tech Stack:</p>
<p>
    <img src="https://img.shields.io/badge/java-%D0A384.svg?style=for-the-badge&logo=oracle&logoColor=white"> 
    <img src="https://img.shields.io/badge/springboot-%233372B6.svg?style=for-the-badge&logo=springboot&logoColor=white">
    <img src="https://img.shields.io/badge/mysql-FFFFFFFF.svg?style=for-the-badge&logo=mysql&logoColor=black">
    <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white">
</p>

## Documentation

### Running principal route for the API
```bash
  localhost:8090/country/api/v1
```

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

Response: A JSON array containing all the countries whose attribute contains the specified search term, their respective ID, code, name (in French and English), and alpha2 and alpha3 codes.
The API is implemented using Spring Boot and utilizes the JPA/Hibernate framework for data persistence. The "Country" entity represents the data model, which is mapped to a database table called "COUNTRIES". The entity has the following attributes:

**Full Changelog**: https://github.com/geoffreylgv/API-world_countries/commits/v1.0.0

##### Demo video
[<img src="https://i3.ytimg.com/vi/3M6ogLK_I-4/maxresdefault.jpg" width="100%">](https://www.youtube.com/watch?v=3M6ogLK_I-4 "Video on youtube, soon the API on Azure Functio APP")

id: A unique identifier for each country.<br>
code: A unique code assigned to each country.<br>
nameFR: The name of the country in French.<br>
nameEN: The name of the country in English.<br>
alpha2: The two-letter code assigned to each country.<br>
alpha3: The three-letter code assigned to each country.<br>

<quote>The entity also includes standard JPA annotations for defining the mapping to the database table and managing the persistence of the entity instances. The Lombok library is used to generate getters, setters, equals and hashcode methods for the entity class.</quote>

## How to use locally
1. Download the repos, 
2. make sure to update the application.propertie in the resources folder 
3. make a clean and build and 
4. run <br>

>Insert the country's data into the countries table; that's all. With love, thank you for reading. ^_^
