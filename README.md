# Sistema de Reservaciones - CRUD Simple

Este repositorio contiene un proyecto para la gestión de reservaciones desarrollado en Java utilizando Spring Boot para el backend y React para el frontend. El sistema implementa un CRUD básico y organizado basado en la arquitectura MVC, cumpliendo con los siguientes requisitos:

---

## **Requisitos del Proyecto**

1. **Implementación de CRUD**:
   - Crear una reservación.
   - Leer reservaciones por día.
   - Actualizar una reservación.
   - Eliminar una reservación.

2. **Restricciones de Negocio**:
   - Asegurar que no se puedan hacer dos reservaciones en el mismo horario.

3. **Organización**:
   - Arquitectura organizada y basada en el patrón MVC.
   - Código claro y bien estructurado.

4. **Diseño Web**:
   - Aunque no será evaluado, se incluye un diseño simple y funcional para la interfaz web.

---

## **Backend**

El backend está desarrollado en Java con Spring Boot. Proporciona los endpoints necesarios para gestionar reservaciones, clientes, horarios disponibles y horarios reservados.

### **Características**
- Framework: Spring Boot.
- Persistencia: JPA con H2/MySQL (dependiendo de la configuración).
- Endpoints RESTful.
- Validación para evitar reservaciones duplicadas en el mismo horario.

### **Endpoints Principales**
1. **Reservaciones**
   - `POST /api/reservaciones/crear-reservacion`: Crear una nueva reservación.
   - `GET /api/reservaciones/fecha/{fecha}`: Consultar reservaciones por día.
   - `PUT /api/reservaciones/{id}`: Actualizar una reservación existente.
   - `DELETE /api/reservaciones/{id}`: Eliminar una reservación.

2. **Clientes**
   - `POST /api/clientes`: Crear un cliente.
   - `GET /api/clientes`: Consultar todos los clientes.
   - `GET /api/clientes/{id}`: Consultar un cliente por ID.
   - `PUT /api/clientes/{id}`: Actualizar un cliente.
   - `DELETE /api/clientes/{id}`: Eliminar un cliente.

3. **Horarios Disponibles**
   - `POST /api/horarioDisponible`: Crear un horario disponible.
   - `GET /api/horarioDisponible`: Consultar todos los horarios disponibles.
   - `GET /api/horarioDisponible/{id}`: Consultar un horario disponible por ID.
   - `PUT /api/horarioDisponible/{id}`: Actualizar un horario disponible.
   - `DELETE /api/horarioDisponible/{id}`: Eliminar un horario disponible.

4. **Horarios Reservados**
   - `POST /api/horariosReserva`: Crear un horario reservado.
   - `GET /api/horariosReserva`: Consultar todos los horarios reservados.
   - `GET /api/horariosReserva/{id}`: Consultar un horario reservado por ID.
   - `PUT /api/horariosReserva/{id}`: Actualizar un horario reservado.
   - `DELETE /api/horariosReserva/{id}`: Eliminar un horario reservado.

### **Repositorio Backend**
Puedes encontrar el backend en el siguiente repositorio:
[Repositorio Backend - prueba-riservi-backend](https://github.com/JJAR140201/prueba-riservi-backend)

---

## **Frontend**

El frontend está desarrollado en React, con componentes modulares y estilos CSS simples. Proporciona una interfaz funcional para interactuar con el backend y gestionar clientes, horarios y reservaciones.

### **Características**
- Framework: React.
- Componentes reutilizables para gestionar clientes, horarios y reservaciones.
- Validación básica para la entrada de datos.
- Consumo de APIs RESTful mediante Axios.

### **Componentes Principales**
1. **Clientes**: Gestión de información de clientes.
2. **Horarios Disponibles**: Gestión de horarios disponibles.
3. **Horarios de Reserva**: Gestión de horarios reservados.
4. **Reservaciones**: Gestión de reservaciones.

---

## **Instrucciones de Configuración**

### **Backend**
1. Clona el repositorio del backend:
   ```bash
   git clone https://github.com/JJAR140201/prueba-riservi-backend.git
