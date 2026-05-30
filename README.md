
# 1. Sistema de Reserva de Hotel  
## 1.1 Diagrama de Clases UML

---

# 2. Descripción del Proyecto

Este sistema modela la gestión de reservas de un hotel mediante un diseño orientado a objetos. Representa los procesos principales del negocio, incluyendo la administración de habitaciones, reservas, pagos, comprobantes y control de estados.

El sistema está desarrollado bajo el enfoque de **modelado UML (Lenguaje Unificado de Modelado)** mediante un diagrama de clases.

---

# 3. Objetivo

- Diseñar la estructura lógica de un sistema de reservas hoteleras
- Representar entidades principales del dominio
- Establecer relaciones entre clases
- Modelar el ciclo de vida de una reserva
- Simular procesos administrativos del hotel

---

# 4. Alcance del Sistema

El sistema contempla:

- Gestión de clientes
- Creación y administración de reservas
- Control de habitaciones
- Registro de pagos
- Emisión de comprobantes
- Generación de reportes
- Control de estados de reserva
- Funciones de recepcionista y administrador

---

# 5. Modelo de Clases (UML)

## 5.1 Relaciones principales

- Cliente 1 → * Reserva  
- Reserva * → 1 Habitación  
- Reserva 1 → 1 Pago  
- Reserva 1 → 1 Comprobante  
- Recepcionista → gestiona Reservas  
- Administrador → gestiona Habitaciones, Pagos y Reportes  
- Habitación y Reserva → asociados a EstadoReserva  

---

# 6. Clases del Sistema

## 6.1 Cliente
Representa a los huéspedes del hotel.

Funciones:
- Registro de datos personales
- Consulta de reservas

---

## 6.2 Reserva
Clase principal del sistema.

Funciones:
- Crear, modificar y cancelar reservas
- Validar fechas y disponibilidad
- Calcular costos totales
- Check-in y check-out
- Generar comprobantes

---

## 6.3 Habitación
Representa las habitaciones del hotel.

Funciones:
- Control de disponibilidad
- Gestión de estado
- Información de características

---

## 6.4 Pago
Gestiona las transacciones económicas.

Funciones:
- Registro de pagos
- Validación de operaciones
- Control de ingresos

---

## 6.5 Comprobante
Documento generado a partir de una reserva o pago.

Funciones:
- Generación de comprobantes
- Emisión digital o impresa

---

## 6.6 Recepcionista
Usuario operativo del sistema.

Funciones:
- Gestión de reservas
- Confirmación y cancelación
- Check-in y check-out
- Registro de clientes

---

## 6.7 Administrador
Usuario con control total del sistema.

Funciones:
- Gestión de habitaciones
- Control de pagos
- Generación de reportes
- Administración general

---

## 6.8 Reporte
Permite el análisis del sistema.

Funciones:
- Generación de reportes
- Exportación de información
- Visualización de estadísticas

---

## 6.9 EstadoReserva
Define el ciclo de vida de una reserva.

Estados:
- Pendiente
- Confirmada
- En curso
- Finalizada
- Cancelada

---

# 7. Ciclo de Vida de una Reserva

El flujo de estados es:

Pendiente → Confirmada → En curso → Finalizada  
o bien  
Pendiente → Cancelada

---

# 8. Tecnologías Utilizadas

- UML (Lenguaje Unificado de Modelado)
- Git / GitHub
- Visual Studio Code

---

# 9. Estructura del Proyecto

- Diagramas UML de clases
- Documentación del sistema
- Trabajo colaborativo con ramas en GitHub

---

# 10. Conclusión

Este sistema representa una solución estructurada para la gestión hotelera basada en programación orientada a objetos y modelado UML. Permite visualizar claramente las relaciones entre entidades y el flujo completo de una reserva.
