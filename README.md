# Program API

This is a Spring Boot application that provides a RESTful API for managing programs offered by an educational institute. The API supports operations to create, read, update, and delete program records, and includes authentication to ensure that only authorized users can perform these operations.

## Features

- Create, read, update, and delete programs
- Basic authentication for securing the API
- PostgreSQL database integration
- Proper exception handling
- Configurable through application properties

## Program Fields

- **Name**: Name of the program
- **Price**: Price of the program
- **Domain**: Domain of the program (e.g., Data, Finance, etc.)
- **Program Type**: Type of the program (e.g., Bootcamp, Workshop, etc.)
- **Registrations**: Whether registrations are open or closed
- **Description**: Description of the program
- **Placement Assurance**: Placement assurance (Yes/No)
- **Image URL**: URL of the program image
- **University Name**: Name of the university offering the program
- **Faculty Profile**: Faculty profile (LinkedIn URL if available)
- **Learning Hours**: Number of learning hours
- **Duration**: Duration of the program
- **Credential Type**: Credential type awarded (e.g., Certificate, Diploma)
- **Eligibility Criteria**: Eligibility criteria for the program

## Getting Started

### Prerequisites

- Java 17 or later
- Maven
- PostgreSQL
- Postman
- Git (optional, for cloning the repository)

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/Parikshit9112/Assignment_ProgramApi.git
    cd Assignment_ProgramsApi
    ```

2. **Set up PostgreSQL database:**
    - Create a new database and user for the application. You can use pgAdmin or the psql command line tool.

    ```sql
    CREATE DATABASE yourdatabase;
    CREATE USER yourusername WITH ENCRYPTED PASSWORD 'yourpassword';
    GRANT ALL PRIVILEGES ON DATABASE yourdatabase TO yourusername;
    ```

3. **Configure the application properties:**
    - Open the `src/main/resources/application.properties` file and update the database configuration with your PostgreSQL credentials:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:3308/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    server.port=5215

    spring.security.user.name=Login username
    spring.security.user.password=Login password
    ```

4. **Run the application:**
    - Open a command prompt and navigate to the project directory.
    - Run the following command to start the application:

    ```sh
    mvn spring-boot:run
    ```

### Testing the API with Postman

1. **Open Postman** and create a new request.

2. **Get all programs:**
    - Method: GET
    - URL: `http://localhost:8080/api/programs/getAll`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Click `Send`.

3. **Get a specific program by ID:**
    - Method: GET
    - URL: `http://localhost:8080/api/programs/getById/{id}`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Click `Send`.

4. **Get a specific program by Name:**
    - Method: GET
    - URL: `http://localhost:8080/api/programs/getByName/{name}`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Click `Send`.

5. **Create a new program:**
    - Method: POST
    - URL: `http://localhost:8080/api/programs/create`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Headers: `Content-Type: application/json`
    - Body: Raw JSON

    ```json
    {
        "name": "Program name",
        "price": 1000,
        "domain": "Data",
        "programType": "Bootcamp",
        "registrationsStatus": "open",
        "description": "A new data bootcamp",
        "placementAssurance": true,
        "imageUrl": "http://example.com/image.jpg",
        "universityName": "University name",
        "facultyProfile": "http://linkedin.com/in/professor",
        "learningHours": 120,
        "duration": "12 weeks",
        "credentialType": "Certificate",
        "eligibilityCriteria": "Basic understanding of Python"
    }
    ```
    - Click `Send`.

6. **Update an existing program:**
    - Method: PUT
    - URL: `http://localhost:8080/api/programs/update/{id}`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Headers: `Content-Type: application/json`
    - Body: Raw JSON

    ```json
    {
        "name": "Program name",
        "price": 1500,
        "domain": "Data",
        "programType": "Bootcamp",
        "registrationsOpen": true,
        "description": "An updated data bootcamp",
        "placementAssurance": true,
        "imageUrl": "http://example.com/image.jpg",
        "universityName": "University name",
        "facultyProfile": "http://linkedin.com/in/professor",
        "learningHours": 150,
        "duration": "15 weeks",
        "credentialType": "Certificate",
        "eligibilityCriteria": "Basic understanding of Python"
    }
    ```
    - Click `Send`.

7. **Delete a program :**
    - Method: DELETE
    - URL: `http://localhost:8080/api/programs/delete/{id}`
    - Authorization: Basic Auth (Username: `user`, Password: `password`)
    - Click `Send`.

### Output 

**Login credentials :**
![Screenshot (210)](https://github.com/Parikshit9112/Assignment_ProgramApi/assets/134605344/b485c04e-6c28-47d0-a750-c959e1875ddb)


**Create Program:**
![alt text](<Screenshot (209).png>)

![alt text](<Screenshot (210).png>)

**Get Programs :**
*Get All Program :*
![alt text](<Screenshot (211).png>)

*Get Program By Id :*
![alt text](<Screenshot (212).png>)

*Get Program By Name :*
![alt text](<Screenshot (213).png>)

**Update Program :**
![alt text](<Screenshot (214).png>)

*Updated Program : registrationsStatus and credentialType updated*
![alt text](<Screenshot (215).png>)

**Delete Program :**
![alt text](<Screenshot (216).png>)

**Database :**
![alt text](<Screenshot (217).png>)



### License

This project is licensed under the terms of the Apache License. See the LICENSE file for more details.
