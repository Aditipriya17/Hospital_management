
**Hospital Management System**

**Description:** This document provides an overview of the Hospital Management System, its features, and usage.

**Key Features**

- Patient Registration: Allows new patients to create accounts by providing necessary details such as name, email, and medical history. Data is securely stored in the MySQL database.
- Patient Login: Provides existing patients with a login interface to access their accounts. Authentication is implemented using session management techniques.
- Session Management: Ensures secure session handling to prevent unauthorized access and maintain patient privacy throughout their interaction with the application.
- Responsive Design: Utilizes HTML, CSS, and Bootstrap to create a responsive and user-friendly interface, ensuring seamless accessibility across various devices and screen sizes.
- Database Integration: Integrates MySQL database to store patient and appointment information securely and efficiently. Utilizes JDBC for database connectivity and data manipulation operations.
- Appointment Scheduling: Added a user-friendly interface for scheduling medical appointments with doctors. Patients can select available time slots and receive confirmation.
- Notifications: Implemented email notifications to remind patients of upcoming appointments.
- Medical Records: Secure storage and retrieval of patient medical records, accessible to authorized personnel only.
- Microservices Architecture: Utilizes J2EE microservices for handling different parts of the application, ensuring scalability and maintainability.
- Service Discovery and API Gateway: Implemented Eureka for service discovery and Zuul as an API Gateway to manage routing and load balancing.


**Architecture:**

- **Frontend:** JavaScript, HTML, CSS
- **Backend:** Java with J2EE
- **Database:** MySQL
- **Microservices:**
  - Service discovery using Eureka
  - API Gateway with Zuul

**Additional Sections:**

- **Stability:** Currently in Beta.
- **Platforms:** Windows, macOS
- **Portability:** Highly portable across different environments.
- **Category:** Web Application, Microservices Architecture

**Commit Message:**


git commit -m 'feat(appointment): Added new appointment scheduling feature

Implemented the functionality to allow users to schedule medical appointments online. 


This feature enhances the usability and functionality of the Hospital Management System, providing a comprehensive solution for managing patient appointments and medical records.

