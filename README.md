# Movie Info Service movie-info-service
Java Spring Boot Microservice by ToniSun
![](src/main/resources/assets/colorful-wall_sm_tra.png)

### Services
* ```Port: 8081```
* ```/``` Get all Movies
* ```/getMovie?id=``` Get Movie by Id

### ```@Table("movie")``` Movie Info Service
| Java Field | Java Type | DB Field |      DB Type | Value   | Description         |
|:-----------|:----------|---------:|-------------:|:--------|:--------------------|
| id         | Long      |       id |   BigDecimal | 1 - ... | The id from a Movie |            
| title      | String    |    title | varchar(256) | [aA-zZ] | Title of a Movie    |