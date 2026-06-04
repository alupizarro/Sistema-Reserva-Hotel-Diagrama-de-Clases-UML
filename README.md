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

US: Definir Fechas de Estadía COMO cliente, QUIERO ingresar fecha de entrada y salida, PARA definir correctamente la duración de mi estadía. • Criterio de Aceptación: o DADO que deseo realizar una reserva, o CUANDO ingreso las fechas de estadía, o ENTONCES el sistema debe validar que las fechas sean correctas y disponibles. 

US: Calcular Precio Total COMO cliente, QUIERO conocer el precio total de la reserva, PARA saber cuánto debo pagar. • Criterio de Aceptación: o DADO una habitación y cantidad de noches seleccionadas, o CUANDO confirmo los datos de la reserva, o ENTONCES el sistema debe calcular automáticamente el precio total.

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

KAREN
Cliente + Reserva
Trabaja con:
Clase Cliente
Clase Reserva
Relación Cliente ↔ Reserva
Se encarga de:
Registrar clientes
Crear reservas
Modificar reservas
Cancelar reservas
Validar fechas de estadía
Calcular precio total de la reserva
Historias de Usuario asociadas:
Crear Reserva
Definir Fechas de Estadía
Modificar Reserva
Cancelar Reserva
Calcular Precio Total
Archivos:
Cliente.java
Reserva.java


MICAELA
Habitación
Trabaja con:
Clase Habitacion
Se encarga de:
Consultar disponibilidad
Información de habitaciones
Actualizar datos de habitaciones
Control de disponibilidad automática
Estado disponible / ocupada
Historias de Usuario asociadas:
Consultar Disponibilidad
Seleccionar Habitación
Control de Disponibilidad Automática
Gestión de Habitaciones
Archivos:
Habitacion.java

SILVINA
Pago + Comprobante
Trabaja con:
Clase Pago
Clase Comprobante
Se encarga de:
Registrar pagos
Validar pagos
Registrar importe
Registrar método de pago
Generar comprobantes
Imprimir comprobantes
Historias de Usuario asociadas:
Gestión de Pagos
Generar Comprobante
Archivos:
Pago.java
Comprobante.java

LUCAS
Recepcionista
Trabaja con:
Clase Recepcionista
Se encarga de:
Confirmar reservas
Gestionar estados
Registrar Check-in
Registrar Check-out
Ver reservas
Registrar clientes
Historias de Usuario asociadas:
Ver Reservas
Registrar Cliente
Confirmar Reserva
Gestión de Estados de Reserva
Registrar Check-in
Registrar Check-out
Archivos:
Recepcionista.java

ALEJANDRA 
Administrador + Reporte + EstadoReserva
Trabaja con:
Clase Administrador
Clase Reporte
Enumeración EstadoReserva
Se encarga de:
Gestionar habitaciones
Administrar el sistema
Generar reportes
Visualizar reportes
Exportar reportes
Gestionar estados de reservas
Controlar disponibilidad automática
Historias de Usuario asociadas:
Gestión de Habitaciones
Reportes
Control de Disponibilidad Automática
Gestión de Estados de Reserva
Archivos:
Administrador.java
Reporte.java
EstadoReserva.java

---

┌───────────────────────────────────────┐
│                Cliente               │
├───────────────────────────────────────┤
│ - idCliente : int                    │
│ - nombre : string                    │
│ - apellido : string                  │
│ - documento : string                 │
│ - telefono : string                  │
│ - email : string                     │
│ - direccion : string                 │
├───────────────────────────────────────┤
│ + registrarCliente()                 │
│ + consultarReservas()                │
│ + modificarDatos()                   │
└───────────────────────────────────────┘
                    │ 1
                    │
                    │ realiza
                    │
                    │ *
┌───────────────────────────────────────┐
│                Reserva               │
├───────────────────────────────────────┤
│ - idReserva : int                    │
│ - fechaEntrada : date                │
│ - fechaSalida : date                 │
│ - cantidadNoches : int               │
│ - cantidadHuespedes : int            │
│ - estado : string                    │
│ - total : double                     │
│ - fechaReserva : date                │
├───────────────────────────────────────┤
│ + crearReserva()                     │
│ + modificarReserva()                 │
│ + cancelarReserva()                  │
│ + confirmarReserva()                 │
│ + calcularTotal()                    │
│ + validarFechas()                    │
│ + verificarDisponibilidad()          │
│ + generarComprobante()               │
│ + registrarCheckIn()                 │
│ + registrarCheckOut()                │
└───────────────────────────────────────┘
                    │ *
                    │
                    │ incluye
                    │
                    │ 1
┌───────────────────────────────────────┐
│              Habitacion              │
├───────────────────────────────────────┤
│ - numero : int                       │
│ - tipo : string                      │
│ - precio : double                    │
│ - capacidad : int                    │
│ - servicios : string                 │
│ - piso : int                         │
│ - disponible : boolean               │
│ - estado : string                    │
├───────────────────────────────────────┤
│ + consultarDisponibilidad()          │
│ + actualizarDisponibilidad()         │
│ + mostrarInformacion()               │
│ + cambiarEstado()                    │
└───────────────────────────────────────┘
                    │ 1
                    │
                    │ genera
                    │
                    │ 1
┌───────────────────────────────────────┐
│                 Pago                 │
├───────────────────────────────────────┤
│ - idPago : int                       │
│ - fechaPago : date                   │
│ - importe : double                   │
│ - metodoPago : string                │
│ - estadoPago : string                │
├───────────────────────────────────────┤
│ + registrarPago()                    │
│ + validarPago()                      │
│ + emitirComprobantePago()            │
└───────────────────────────────────────┘


┌───────────────────────────────────────┐
│            Recepcionista             │
├───────────────────────────────────────┤
│ - idRecepcionista : int              │
│ - nombre : string                    │
│ - apellido : string                  │
│ - usuario : string                   │
│ - contraseña : string                │
│ - turno : string                     │
├───────────────────────────────────────┤
│ + verReservas()                      │
│ + confirmarReserva()                 │
│ + cancelarReserva()                  │
│ + gestionarEstados()                 │
│ + generarComprobante()               │
│ + registrarCheckIn()                 │
│ + registrarCheckOut()                │
│ + registrarCliente()                 │
└───────────────────────────────────────┘
                    │
                    │ administra
                    ▼
┌───────────────────────────────────────┐
│                Reserva               │
└───────────────────────────────────────┘


┌───────────────────────────────────────┐
│             Administrador            │
├───────────────────────────────────────┤
│ - idAdministrador : int              │
│ - nombre : string                    │
│ - apellido : string                  │
│ - usuario : string                   │
│ - contraseña : string                │
├───────────────────────────────────────┤
│ + gestionarHabitaciones()            │
│ + agregarHabitacion()                │
│ + eliminarHabitacion()               │
│ + modificarHabitacion()              │
│ + gestionarPagos()                   │
│ + generarReportes()                  │
│ + controlarDisponibilidad()          │
│ + administrarSistema()               │
└───────────────────────────────────────┘
            │                  │
            │ gestiona         │ genera
            ▼                  ▼

┌───────────────────────────┐    ┌────────────────────────────┐
│        Habitacion         │    │          Reporte           │
├───────────────────────────┤    ├────────────────────────────┤
│ - numero : int            │    │ - idReporte : int          │
│ - tipo : string           │    │ - tipoReporte : string     │
│ - precio : double         │    │ - fechaGeneracion : date   │
│ - capacidad : int         │    │ - descripcion : string     │
└───────────────────────────┘    ├────────────────────────────┤
                                 │ + generarReporte()         │
                                 │ + exportarPDF()            │
                                 │ + mostrarReporte()         │
                                 └────────────────────────────┘



┌───────────────────────────────────────┐
│             Comprobante              │
├───────────────────────────────────────┤
│ - idComprobante : int                │
│ - fechaEmision : date                │
│ - tipo : string                      │
│ - detalle : string                   │
├───────────────────────────────────────┤
│ + generarComprobante()               │
│ + imprimirComprobante()              │
│ + enviarComprobante()                │
└───────────────────────────────────────┘


                    Reserva
                       │
                       │ genera
                       ▼
            ┌─────────────────────┐
            │    Comprobante      │
            └─────────────────────┘



┌───────────────────────────────────────┐
│           EstadoReserva              │
├───────────────────────────────────────┤
│ - pendiente                          │
│ - confirmada                         │
│ - cancelada                          │
│ - enCurso                            │
│ - finalizada                         │
└───────────────────────────────────────┘

---

El cuadro se divide en 3 partes:
1. Nombre de la clase
Ejemplo:
•	Cliente 
•	Reserva 
•	Habitación 
•	Pago 
La clase representa un objeto del sistema.
________________________________________
2. Atributos
Son los datos que guarda la clase.
Ejemplo de Cliente: 
•	idCliente 
•	nombre 
•	apellido 
•	documento 
•	teléfono 
•	email 
Eso significa que cada cliente tendrá esos datos almacenados.
________________________________________
3. Métodos
Son las acciones o funciones que puede hacer la clase.
Ejemplo: 
•	registrarCliente() 
•	consultarReservas() 
•	modificarDatos() 
Los paréntesis indican que es una función.
________________________________________
Explicación de cada clase del diagrama
Clase Cliente
Representa a la persona que reserva una habitación. 
Guarda:
•	ID del cliente 
•	Nombre 
•	Documento 
•	Teléfono 
•	Dirección 
Puede hacer:
•	Registrarse 
•	Consultar reservas 
•	Modificar sus datos 
________________________________________
Clase Reserva
Representa una reserva del hotel. 
Guarda:
•	Fecha de entrada 
•	Fecha de salida 
•	Cantidad de noches 
•	Cantidad de huéspedes 
•	Estado de la reserva 
•	Total a pagar 
Puede hacer:
•	Crear reserva 
•	Modificar reserva 
•	Cancelar reserva 
•	Confirmar reserva 
•	Calcular total 
•	Validar fechas 
•	Verificar disponibilidad 
•	Registrar check-in 
•	Registrar check-out 
________________________________________
Clase Habitación
Representa las habitaciones del hotel. 
Guarda:
•	Número 
•	Tipo 
•	Precio 
•	Capacidad 
•	Servicios 
•	Piso 
•	Disponibilidad 
•	Estado 
Puede hacer:
•	Consultar disponibilidad 
•	Actualizar disponibilidad 
•	Mostrar información 
•	Cambiar estado 
________________________________________
Clase Pago
Representa el pago de una reserva. 
Guarda:
•	ID del pago 
•	Fecha 
•	Importe 
•	Método de pago 
•	Estado del pago 
Puede hacer:
•	Registrar pago 
•	Validar pago 
•	Emitir comprobante 
________________________________________
Clase Recepcionista
Representa al empleado que maneja reservas. 
Guarda:
•	ID 
•	Nombre 
•	Usuario 
•	Contraseña 
•	Turno 
Puede hacer:
•	Ver reservas 
•	Confirmar reservas 
•	Cancelar reservas 
•	Gestionar estados 
•	Registrar clientes 
•	Hacer check-in y check-out 
________________________________________
Clase Administrador
Representa al administrador del sistema. 
Puede hacer:
•	Gestionar habitaciones 
•	Agregar habitaciones 
•	Eliminar habitaciones 
•	Modificar habitaciones 
•	Gestionar pagos 
•	Generar reportes 
•	Administrar el sistema 
________________________________________
Clase Reporte
Representa informes del sistema. 
Guarda:
•	ID del reporte 
•	Tipo de reporte 
•	Fecha 
•	Descripción 
Puede hacer:
•	Generar reportes 
•	Exportar PDF 
•	Mostrar reportes 
________________________________________
Clase Comprobante
Representa comprobantes emitidos. 
Guarda:
•	ID 
•	Fecha 
•	Tipo 
•	Detalle 
Puede hacer:
•	Generar comprobante 
•	Imprimir comprobante 
•	Enviar comprobante 
________________________________________
EstadoReserva
Es una enumeración de estados posibles de una reserva. 
Puede estar:
•	Pendiente 
•	Confirmada 
•	Cancelada 
•	En curso 
•	Finalizada 

---

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

##  Habitación
Representa las habitaciones del hotel.

Funciones:
- Control de disponibilidad
- Gestión de estado
- Información de características

---

##  Pago
Gestiona las transacciones económicas.

Funciones:
- Registro de pagos
- Validación de operaciones
- Control de ingresos

---

## Comprobante
Documento generado a partir de una reserva o pago.

Funciones:
- Generación de comprobantes
- Emisión digital o impresa

---

## Recepcionista
Usuario operativo del sistema.

Funciones:
- Gestión de reservas
- Confirmación y cancelación
- Check-in y check-out
- Registro de clientes

---

## Administrador
Usuario con control total del sistema.

Funciones:
- Gestión de habitaciones
- Control de pagos
- Generación de reportes
- Administración general

---

##  Reporte
Permite el análisis del sistema.

Funciones:
- Generación de reportes
- Exportación de información
- Visualización de estadísticas

---

##  EstadoReserva
Define el ciclo de vida de una reserva.

Estados:
- Pendiente
- Confirmada
- En curso
- Finalizada
- Cancelada

---

#  Ciclo de Vida de una Reserva

El flujo de estados es:

Pendiente → Confirmada → En curso → Finalizada  
o bien  
Pendiente → Cancelada

---

#  Tecnologías Utilizadas

- UML (Lenguaje Unificado de Modelado)
- Git / GitHub
- Visual Studio Code

---

#  Estructura del Proyecto

- Diagramas UML de clases
- Documentación del sistema
- Trabajo colaborativo con ramas en GitHub

---

#  Conclusión

Este sistema representa una solución estructurada para la gestión hotelera basada en programación orientada a objetos y modelado UML. Permite visualizar claramente las relaciones entre entidades y el flujo completo de una reserva.
