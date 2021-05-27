# my challenge
* H2
* session

##Lifefitness Coding Challenge

You are given the task of implementing a simple e-commerce application. You need to develop REST APIs using Spring Boot and assume a client application that will consume the API.

Implement REST APIs,
1. To show all Product in shopping cart
2. Add/Remove Product to shopping cart
3. Checkout Shopping cart - Should reduce the quantity available in the product repository.

Basically, Each user should have his own shopping cart (session functionality). Checkout is transactional.

##### Attachments

- `schema.sql`: The DDL for the database your program needs to use. This DDL is written for H2 DB, however you may use any DB of your choosing as long as the constraints are the same.

##### Guidelines

- The program needs to be written in Java
- Create your solution as if you were in a real-life project and it would have to be shipped into production after you are done
(read that again, and REALLY consider it in your approach).
- For the purpose of this exercise you can assume that we already have a database containing the necessary tables; you don't need to include the database itself in your solution.
- Please include a short readme when returning your solution describing decisions and assumptions you made during development.
- Please submit as a ZIP file over either email or DropBox/Google Drive/etc - do NOT push to a public repository.

##### What we will be looking at

- Readability
- Adherence to best practices
- Unit test cases
- Exception handling