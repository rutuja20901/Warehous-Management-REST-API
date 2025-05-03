# Warehouse-Management-REST-API
This project is a REST API service built using Spring Boot for managing a library. The API supports CRUD (Create, Read, Update, Delete) operations to manage product information. This implementation is designed for easy testing and scalability.

--


## Tech Stack
- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Web
- H2 / MySQL
- Maven

---

## Technologies Used
- **Spring Boot**: Framework for building REST APIs.
- **H2 Database**: In-memory database for testing.
- **Maven**: Dependency and build management.

---

## Features
-  Add, update, delete, and view products.
-  Search products by vendor.
-  Filter products by price range or stock.
-  Validate unique SKU before insertion.
-  Return appropriate HTTP status codes (200, 201, 400, 404).
-  Uses H2 (in-memory) or MySQL database.
-  Layered architecture: Controller → Service → Repository.

---

## Sample Product JSON
Here is an example of the JSON representation of a product object:

```json
{
    "name": "Pen",
    "description": "Black Ball Point",
    "vendor": "Parker",
    "price": 1090,
    "stock":90,
    "currency": "EUR",
    "image_url": "https://via.plolder.com/150",
    "sku": "SK9001"
}

---

## Example API Endpoints

| Method     | Endpoint                 | Description                |
|------------|--------------------------|----------------------------|
| `POST`     | `/warehouse	`           | Add a new product.         |
| `GET`      | `/warehouse/{id}`        | Get product by ID.         |
| `PUT`      | `/warehouse/{id}`        | Update a product .         |
| `DELETE`   | `/warehouse/{id}`        | Delete a product .         |
| `GET`      | `/warehouse?vendor=Apple`| Get products by vendor.    |


---

## Running the Application

1. Clone the repository:
```bash
git clone https://github.com/yout-username/warehouse-management-system.git
```
2. Open in IDE (IntelliJ / VS Code / Eclipse)
3. Run WarehouseManagementSystemApplication.java
4. Test APIs using Postman or Swagger


---



   
