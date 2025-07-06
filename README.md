# 🎓 Backend - Registro de Estudiantes con Spring Boot y MongoDB

Este proyecto forma parte de una aplicación web completa para registrar estudiantes, guardar sus datos en una base de datos en la nube con MongoDB y consultarlos a través de una API REST desarrollada con Spring Boot.

## 🚀 Tecnologías utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Data MongoDB
- MongoDB Atlas
- Maven

---

## 📚 Marco Teórico - ¿Qué es MongoDB?

**MongoDB** es una base de datos NoSQL orientada a documentos. En lugar de almacenar datos en tablas y filas como una base de datos relacional, utiliza documentos BSON (una forma binaria de JSON) que permiten una estructura flexible y escalable. Algunas ventajas:

- No requiere esquema fijo.
- Ideal para almacenar datos semi estructurados o jerárquicos.
- Escala horizontalmente fácilmente (sharding).
- Muy utilizado en aplicaciones modernas por su facilidad de integración con JavaScript y JSON.

---

## Explicación de códigos

### 📌 `Estudiante.java`

Ubicada en el paquete `model`, esta clase representa la entidad **Estudiante**. Utiliza anotaciones de Spring Data para mapearla a la colección `estudiantes` de MongoDB.

### 📌 EstudianteRepository.java

Interfaz que extiende MongoRepository para proporcionar acceso CRUD a la colección estudiantes. Spring genera automáticamente la implementación en tiempo de ejecución.

### 📌 EstudianteController.java

Clase que expone una API REST con dos endpoints:
- POST /api/estudiantes: Guarda un nuevo estudiante.
- GET /api/estudiantes: Lista todos los estudiantes registrados.

### 📌 application.properties
En el archivo application.properties se incluye la URI de MongoDB Atlas y el nombre de la base de datos.

---
# 🌐 Frontend - Registro de Estudiantes con React

Este proyecto es el frontend de una aplicación web que permite registrar estudiantes, guardar los datos en MongoDB a través de un backend Spring Boot, y mostrar los registros en una tabla.

## 🚀 Tecnologías utilizadas

- React 18+
- Axios
- JavaScript (ES6)
- CSS básico

---

## 🧠 ¿Cómo funciona?

1. **Formulario (EstudianteForm.jsx)**  
   Permite ingresar los datos: nombre, correo, fecha de nacimiento y programa. Usa componentes reutilizables (`Input`, `DateInput`, `Button`) para consistencia.

2. **Envío al backend**  
   Al hacer clic en "Guardar", los datos se envían con `Axios` a la API del backend (`POST /api/estudiantes`).

3. **Tabla de estudiantes (EstudianteTable.jsx)**  
   Consulta al backend con `Axios` (`GET /api/estudiantes`) y muestra los registros en una tabla HTML.

4. **Componente principal (`App.jsx`)**  
   Coordina los cambios en el formulario y actualiza la tabla automáticamente al agregar un nuevo registro.

---

## ⚙️ Requisitos para ejecución

1. Tener el backend corriendo en `http://localhost:8080`
2. Ejecutar este comando en la raíz del frontend:


---
## 📸 Capturas de pantalla

Vista antes de agregar un estudiante  
![image](https://github.com/user-attachments/assets/8b17708a-b51b-414e-a8de-a76804c45e44)

Vista luego de agregar el estudiante  
![image](https://github.com/user-attachments/assets/2508f4de-a8aa-4c47-b90a-d6a4fbb96ac8)

Comprobamos en la base de datos de MongoDB Atlas  
![image](https://github.com/user-attachments/assets/2922c136-d40a-4567-9550-f4d233973be1)

