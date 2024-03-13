## CRUD_Shop-Order_JVEE8_Mybatics_PostgreSQL

### Introduction

This is a simple CRUD project that allows you to manage orders in a shop using Java EE 8, Mybatis, and PostgreSQL.

### Features

* Order management:
    * Add new order
    * Update order information
    * Delete order
    * Search order by code or customer
* Customer management:
    * List customers
    * Search customers by name or email

### Technologies used

* Java EE 8
* Mybatis
* PostgreSQL
* JUnit (for unit testing)

### Setup

**Installation:**

1. Clone the project to your machine: `git clone https://github.com/your-username/CRUD_Shop-Order_JVEE8_Mybatics_PostgreSQL.git`
2. Install PostgreSQL and create a database `shop_order`
3. Configure database information in the `application.properties` file
4. Build the project using Maven: `mvn clean install`
5. Run the application using Maven: `mvn spring-boot:run`

**Usage:**

* Access the URL `http://localhost:8080/` to see the home page
* Use the RESTful APIs to manage orders and customers

**API:**

* **GET /orders**: List all orders
* **GET /orders/{id}**: Get order information by code
* **POST /orders**: Add new order
* **PUT /orders/{id}**: Update order information
* **DELETE /orders/{id}**: Delete order
* **GET /customers**: List customers
* **GET /customers/{name}**: Search customers by name

### References

* Java EE 8 Tutorial: [invalid URL removed]
* Mybatis Documentation: [https://mybatis.org/mybatis-3/index.html](https://mybatis.org/mybatis-3/index.html)
* PostgreSQL Documentation: [https://www.postgresql.org/docs/current/](https://www.postgresql.org/docs/current/)

### Contributing

You can contribute to the project by:

* Reporting bugs on GitHub
* Sending pull requests with new improvements

### Happy coding!
