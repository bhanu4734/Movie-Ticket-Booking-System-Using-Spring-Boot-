# 🎬 Movie Ticket Booking System

A full-stack **Movie Ticket Booking Application** built with **Spring Boot**, **REST APIs**, and a **responsive Bootstrap frontend**.  
This project allows users to browse movies, select show timings, view available seats in real time, and book tickets seamlessly.

---

## 🚀 Features

- 🎥 **Movie Management** — Add and view movie listings via REST API  
- 🪑 **Seat Selection** — Interactive seat map with live availability  
- 🕒 **Showtime Selection** — Choose show timings dynamically  
- 👤 **Customer Booking** — Book tickets with name and seat numbers  
- 💾 **Data Persistence** — Managed using Spring Data JPA  
- 💡 **Responsive UI** — Built using HTML, CSS, JavaScript, and Bootstrap  

---

## 🧩 Tech Stack

**Backend:**  
- Java 17+  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 / MySQL Database (configurable)

**Frontend:**  
- HTML5, CSS3, JavaScript  
- Bootstrap 5  
- Google Fonts (Montserrat)

---

## 📁 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/Movie_Ticket_Booking/
 │   │   ├── controller/
 │   │   │   ├── MovieController.java
 │   │   │   └── BookingController.java
 │   │   ├── model/
 │   │   │   ├── Movie.java
 │   │   │   └── Booking.java
 │   │   ├── Service/
 │   │   │   ├── MovieService.java
 │   │   │   └── BookingService.java
 │   │   └── Repository/
 │   │       ├── MovieRepository.java
 │   │       └── BookingRepository.java
 │   └── resources/
 │       ├── static/
 │       │   └── index.html
 │       └── application.properties
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/yourusername/Movie_Ticket_Booking.git
cd Movie_Ticket_Booking
```

### 2️⃣ Build and Run the project
Using Maven:
```bash
mvn spring-boot:run
```

Server will start at:  
👉 `http://localhost:8080`

### 3️⃣ Access the frontend
Open your browser and go to:
```
http://localhost:8080/index.html
```

---

## 🧠 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | `/movies` | Get all movies |
| POST | `/movies` | Add a new movie |
| GET | `/bookings` | Get all bookings |
| POST | `/bookings` | Create a new booking |

---
## ✨ Author
**Bhanu Prasad**  
💼 Passionate Java & Spring Boot Developer  
🔗 [LinkedIn](https://linkedin.com/in/yourprofile) | [GitHub](https://github.com/yourusername)

---

## 📜 License
This project is licensed under the **MIT License**.
