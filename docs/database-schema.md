# Database Schema

## Table: `members`

This table stores information about the users in the system.

| **Column**        | **Type**         | **Constraints**                 | **Description**                  |
|--------------------|------------------|----------------------------------|----------------------------------|
| `id`              | BIGINT           | Primary Key, Auto Increment     | Unique identifier for the user. |
| `name`            | VARCHAR(255)     | NOT NULL                        | Name of the user.               |
| `email`           | VARCHAR(255)     | UNIQUE, NOT NULL                | Email address of the user.      |
| `password`        | VARCHAR(255)     | NOT NULL                        | Encrypted password of the user. |
| `created_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP       | Record creation timestamp.      |
| `updated_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP | Record update timestamp. |

---


## Table: `books`

This table stores information about books in the library.

| **Column**        | **Type**         | **Constraints**                 | **Description**                  |
|--------------------|------------------|----------------------------------|----------------------------------|
| `id`              | BIGINT           | Primary Key, Auto Increment     | Unique identifier for the book. |
| `title`           | VARCHAR(255)     | NOT NULL                        | Title of the book.              |
| `author`          | VARCHAR(255)     | NOT NULL                        | Name of the author.             |
| `isbn`            | VARCHAR(13)      | UNIQUE, NOT NULL                | ISBN number of the book.        |
| `published_date`  | DATE             | NULLABLE                        | Publication date of the book.   |
| `price`           | DECIMAL(10, 2)   | NOT NULL                        | Price of the book.              |
| `stock`           | INT              | DEFAULT 0                       | Number of books in stock.       |
| `created_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP       | Record creation timestamp.      |
| `updated_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP | Record update timestamp. |

---

## Table: `rentals`

This table stores information about the book rental transactions.

| **Column**        | **Type**         | **Constraints**                 | **Description**                  |
|--------------------|------------------|----------------------------------|----------------------------------|
| `id`              | BIGINT           | Primary Key, Auto Increment     | Unique identifier for the rental record. |
| `user_id`         | BIGINT           | Foreign Key (`users.id`), NOT NULL | ID of the user who rented the book. |
| `book_id`         | BIGINT           | Foreign Key (`books.id`), NOT NULL | ID of the book being rented.    |
| `rental_date`     | DATE             | DEFAULT CURRENT_DATE            | Date when the book was rented.  |
| `return_date`     | DATE             | NULLABLE                        | Date when the book was returned. |
| `status`          | ENUM('RENTED', 'RETURNED') | DEFAULT 'RENTED'         | Current status of the rental.   |
| `created_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP       | Record creation timestamp.      |
| `updated_at`      | TIMESTAMP        | DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP | Record update timestamp. |

---


+------------------+         +------------------+         +------------------+
|      users       |         |      rentals     |         |      books       |
+------------------+         +------------------+         +------------------+
| id (PK)          |    +--->| id (PK)          |<---+    | id (PK)          |
| name             |    |    | user_id (FK)     |    |    | title            |
| email            |    |    | book_id (FK)     |    |    | author           |
| password         |    |    | rental_date      |    |    | isbn             |
| created_at       |    |    | return_date      |    |    | published_date   |
| updated_at       |    |    | status           |    |    | price            |
+------------------+         | created_at       |         | stock            |
                             | updated_at       |         | created_at       |
                             +------------------+         | updated_at       |
                                                          +------------------+

