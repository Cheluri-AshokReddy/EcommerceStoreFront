# E-commerce Product Catalog Application

This E-commerce Product Catalog is a full-stack web application designed to display a variety of products, enabling users to browse, search, and filter products by category, as well as sort them by price. It’s built using **React** for the frontend and **Spring Boot** for the backend, with **MySQL** as the database. This application demonstrates basic e-commerce functionalities suitable for learning and building upon for larger projects.

---

## Technologies Used

### Frontend:
- **Vite**: A fast build tool and development server for modern web projects.
- **JavaScript (ES6)**: A modern version of JavaScript with enhanced features like arrow functions and classes.
- **Bootstrap**: A popular CSS framework for building responsive and mobile-first websites.
- **Fetch API**: A browser API used to make HTTP requests to servers.

### Backend:
- **Spring Boot**: A framework that simplifies building production-ready Spring applications.
- **Spring Data JPA**: A Spring module that simplifies database access and management using JPA.
- **Hibernate**: An ORM tool for mapping Java objects to database tables.
- **MySQL**: A widely-used open-source relational database management system.

### Additional:
- **CORS**: A security feature that controls resource sharing between different origins.
- **CommandLineRunner**: An interface in Spring Boot used to run code at application startup.

---

## Getting Started

Follow these steps to set up and run the project on your local machine.

### Prerequisites

Ensure you have the following installed:

- **Node.js** and **npm**
- **Java Development Kit (JDK)** 11 or higher
- **MySQL Server**
- An IDE (e.g., **IntelliJ IDEA**, **VS Code**)

### Installation and Setup

#### 1. Clone the Repository

```bash
git clone https://github.com/Cheluri-AshokReddy/EcommerceStoreFront.git
```

#### 2. Start the Backend

1. Open the project in your preferred IDE (e.g., **IntelliJ IDEA**).
2. Navigate to:

```plaintext
C:\Users\Ashok Reddy\Desktop\productcatalog\src\main\java\com\ecom\productcatalog
```

3. Create a **MySQL** database to store products and categories.
4. Update the `application.properties` file located in the `src/main/resources` directory with your database connection details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<your-database-name>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
```

5. Run the **Spring Boot** application.

#### 3. Start the Frontend

1. Navigate to the frontend directory and run the application:

```plaintext
C:\Users\Ashok Reddy\Desktop\productcatalog\ecom-catalog-react\src
```

2. Open this directory in **VS Code**.
3. Open the terminal in **VS Code** and run:

```bash
npm install
npm run dev
```

4. Once the server starts, you will see an output with a local development URL. Click or open this URL in your browser to view the app:

[http://localhost:5174/](http://localhost:5174/)

---

## Project Features

### Product Display:
- Products are displayed in a clean, responsive grid layout.
- Each product includes an image, name, description, and price.

### Category Filtering:
- Users can filter products by category using a dropdown menu.
- Categories include **Electronics**, **Clothing**, **Home and Kitchen**, **Sports & Outdoors**, **Books**, and **Beauty & Personal Care**.

### Search Functionality:
- A search bar allows users to search for products by name dynamically.

### Price Sorting:
- Products can be sorted by price using a dropdown menu.
- Sorting options include **Low to High** and **High to Low**.

### Responsive Design:
- Built using **Bootstrap** to ensure the application looks great on all devices.

---

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.

1. **Fork** the repository.
2. **Create a new branch**:

```bash
git checkout -b feature-branch
```

3. **Make your changes**.
4. **Commit your changes**:

```bash
git commit -m 'Add some feature'
```

5. **Push to the branch**:

```bash
git push origin feature-branch
```

6. **Submit a pull request**.

---

## License

This project is open-source and available under the **MIT License**.

---

## Contact

For any questions, please contact:

**Ashok Reddy Cheluri**

GitHub: [Cheluri-AshokReddy](https://github.com/Cheluri-AshokReddy)  <br>
Linkedin: [ashokreddycheluri](https://www.linkedin.com/in/ashokreddycheluri-740603235/)

