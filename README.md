#  Sistema de Reserva de Hotel  
##  Diagrama de Clases UML

---

# Integrantes
- Nombre del alumno: Lucas Cioccale
- Nombre del alumno: Micaela Coradini
- Nombre del alumno: Karen Tymoszcuk
- Nombre del alumno: Silvina Palaoro
- Nombre del alumno: Alejandra Pizarro

---

# Materias
- Alfabetizacion Digital y Introduccion al Analisis Sistemico

---

# Profesor
- Narciso Pérez

---

# Fecha
- 30 /05 / 2026

---  

#  Descripción del Proyecto

Este sistema modela la gestión de reservas de un hotel mediante un diseño orientado a objetos. Representa los procesos principales del negocio, incluyendo la administración de habitaciones, reservas, pagos, comprobantes y control de estados.

El sistema está desarrollado bajo el enfoque de **modelado UML (Lenguaje Unificado de Modelado)** mediante un diagrama de clases.

---

#  Objetivo

- Diseñar la estructura lógica de un sistema de reservas hoteleras
- Representar entidades principales del dominio
- Establecer relaciones entre clases
- Modelar el ciclo de vida de una reserva
- Simular procesos administrativos del hotel

---

#  Alcance del Sistema

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

# Historias de Usuario (US) del Sistema de Reserva de Hotel

US: Crear Reserva COMO cliente, QUIERO registrar una reserva en el hotel, PARA asegurar una habitación disponible en las fechas deseadas. • Criterio de Aceptación: o DADO que existen habitaciones disponibles, o CUANDO el cliente ingresa las fechas y selecciona una habitación, o ENTONCES el sistema debe registrar la reserva y cambiar el estado a “pendiente” o “confirmada”.

US: Consultar Disponibilidad COMO cliente, QUIERO consultar habitaciones disponibles, PARA elegir una opción de hospedaje. • Criterio de Aceptación: o DADO un rango de fechas ingresado, o CUANDO realizo la búsqueda de habitaciones, o ENTONCES el sistema debe mostrar únicamente las habitaciones disponibles.

US: Seleccionar Habitación COMO cliente, QUIERO seleccionar el tipo de habitación, PARA elegir la opción que mejor se adapte a mis necesidades. • Criterio de Aceptación: o DADO que existen habitaciones disponibles, o CUANDO selecciono una habitación, o ENTONCES el sistema debe mostrar precio, capacidad y servicios incluidos.

US: Definir Fechas de Estadía COMO cliente, QUIERO ingresar fecha de entrada y salida, PARA definir correctamente la duración de mi estadía. • Criterio de Aceptación: o DADO que deseo realizar una reserva, o CUANDO ingreso las fechas de estadía, o ENTONCES el sistema debe validar que las fechas sean correctas y disponibles. US: Calcular Precio Total COMO cliente, QUIERO conocer el precio total de la reserva, PARA saber cuánto debo pagar. • Criterio de Aceptación: o DADO una habitación y cantidad de noches seleccionadas, o CUANDO confirmo los datos de la reserva, o ENTONCES el sistema debe calcular automáticamente el precio total.

US: Modificar Reserva COMO cliente, QUIERO modificar mi reserva, PARA cambiar fechas o habitación si es necesario. • Criterio de Aceptación: o DADO una reserva existente, o CUANDO modifico fechas o habitación, o ENTONCES el sistema debe validar disponibilidad y actualizar la reserva.

US: Cancelar Reserva COMO cliente, QUIERO cancelar una reserva, PARA liberar la habitación reservada. • Criterio de Aceptación: o DADO una reserva activa, o CUANDO selecciono la opción “Cancelar Reserva”, o ENTONCES el sistema debe cambiar el estado a “cancelada” y liberar la habitación.

US: Ver Reservas COMO recepcionista, QUIERO visualizar las reservas registradas, PARA controlar la ocupación del hotel. • Criterio de Aceptación: o DADO que existen reservas cargadas, o CUANDO ingreso al listado de reservas, o ENTONCES el sistema debe mostrar cliente, habitación, fechas y estado.

US: Registrar Cliente COMO recepcionista, QUIERO registrar los datos de un cliente, PARA almacenarlos en el sistema. • Criterio de Aceptación: o DADO un nuevo huésped, o CUANDO ingreso sus datos personales, o ENTONCES el sistema debe guardar correctamente la información.

US: Confirmar Reserva COMO recepcionista, QUIERO confirmar una reserva, PARA validar la estadía del cliente. • Criterio de Aceptación: o DADO una reserva pendiente, o CUANDO verifico los datos y confirmo la operación, o ENTONCES el sistema debe cambiar el estado a “confirmada”.

US: Gestión de Estados de Reserva COMO recepcionista, QUIERO administrar los estados de las reservas, PARA mejorar el control del hotel. • Criterio de Aceptación: o DADO una reserva registrada, o CUANDO ocurre una acción como confirmar, cancelar o finalizar, o ENTONCES el sistema debe actualizar automáticamente el estado correspondiente.

US: Generar Comprobante COMO recepcionista, QUIERO generar un comprobante de reserva, PARA entregar una constancia al cliente. • Criterio de Aceptación: o DADO una reserva confirmada, o CUANDO finaliza el proceso de reserva, o ENTONCES el sistema debe generar un comprobante imprimible o digital.

US: Registrar Check-in COMO recepcionista, QUIERO registrar la llegada del huésped al hotel, PARA cambiar el estado de la reserva a “en curso” y asignarle su habitación. • Criterio de Aceptación: o DADO una reserva confirmada para el día de hoy, o CUANDO selecciono la opción “Check-in” al llegar el cliente, o ENTONCES el sistema debe actualizar el estado de la reserva y bloquear la habitación para que no aparezca como disponible.

US: Registrar Check-out COMO recepcionista, QUIERO registrar la salida del huésped, PARA finalizar la reserva y liberar la habitación. • Criterio de Aceptación: o DADO una reserva en curso, o CUANDO selecciono la opción “Check-out”, o ENTONCES el sistema debe finalizar la reserva y liberar la habitación.

US: Gestión de Pagos COMO administrador, QUIERO registrar pagos de reservas, PARA controlar los ingresos del hotel. • Criterio de Aceptación: o DADO una reserva activa, o CUANDO registro un pago, o ENTONCES el sistema debe guardar el importe y el método de pago utilizado.

US: Gestión de Habitaciones COMO administrador, QUIERO administrar las habitaciones del hotel, PARA mantener actualizado el sistema. • Criterio de Aceptación: o DADO una nueva habitación o modificación, o CUANDO ingreso o actualizo los datos, o ENTONCES el sistema debe guardar correctamente la información.

US: Reportes COMO administrador, QUIERO generar reportes, PARA analizar información del hotel. • Criterio de Aceptación: o DADO información registrada en el sistema, o CUANDO solicito un reporte, o ENTONCES el sistema debe mostrar los datos solicitados correctamente.

US: Control de Disponibilidad Automática COMO administrador, QUIERO actualizar automáticamente la disponibilidad de habitaciones, PARA evitar reservas duplicadas. • Criterio de Aceptación: o DADO una reserva creada o cancelada, o CUANDO cambia el estado de la habitación, o ENTONCES el sistema debe actualizar automáticamente la disponibilidad.


#  Modelo de Clases (UML)

##  Relaciones principales

- Cliente 1 → * Reserva  
- Reserva * → 1 Habitación  
- Reserva 1 → 1 Pago  
- Reserva 1 → 1 Comprobante  
- Recepcionista → gestiona Reservas  
- Administrador → gestiona Habitaciones, Pagos y Reportes  
- Habitación y Reserva → asociados a EstadoReserva  

---

#  Clases del Sistema

##  Cliente
Representa a los huéspedes del hotel.

Funciones:
- Registro de datos personales
- Consulta de reservas

---

##  Reserva
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
