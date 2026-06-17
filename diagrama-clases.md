# Diagrama de Clases - Sistema de Gestión Hotelera

```mermaid
classDiagram

class Cliente{
    +int idCliente
    +string nombre
    +string apellido
    +string documento
    +string telefono
    +string email
    +string direccion
    +registrarCliente()
    +consultarReservas()
    +modificarDatos()
}

class Reserva{
    +int idReserva
    +date fechaEntrada
    +date fechaSalida
    +int cantidadNoches
    +int cantidadHuespedes
    +string estado
    +double total
    +date fechaReserva
    +crearReserva()
    +modificarReserva()
    +cancelarReserva()
    +confirmarReserva()
    +calcularTotal()
    +validarFechas()
    +verificarDisponibilidad()
    +generarComprobante()
    +registrarCheckIn()
    +registrarCheckOut()
}

class Habitacion{
    +int numero
    +string tipo
    +double precio
    +int capacidad
    +string servicios
    +int piso
    +boolean disponible
    +string estado
    +consultarDisponibilidad()
    +actualizarDisponibilidad()
    +mostrarInformacion()
    +cambiarEstado()
}

class Pago{
    +int idPago
    +date fechaPago
    +double importe
    +string metodoPago
    +string estadoPago
    +registrarPago()
    +validarPago()
    +emitirComprobantePago()
}

class Recepcionista{
    +int idRecepcionista
    +string nombre
    +string apellido
    +string usuario
    +string contraseña
    +string turno
    +verReservas()
    +confirmarReserva()
    +cancelarReserva()
    +gestionarEstados()
    +generarComprobante()
    +registrarCheckIn()
    +registrarCheckOut()
    +registrarCliente()
}

class Administrador{
    +int idAdministrador
    +string nombre
    +string apellido
    +string usuario
    +string contraseña
    +gestionarHabitaciones()
    +agregarHabitacion()
    +eliminarHabitacion()
    +modificarHabitacion()
    +gestionarPagos()
    +generarReportes()
    +controlarDisponibilidad()
    +administrarSistema()
}

class Reporte{
    +int idReporte
    +string tipoReporte
    +date fechaGeneracion
    +string descripcion
    +generarReporte()
    +exportarPDF()
    +mostrarReporte()
}

class Comprobante{
    +int idComprobante
    +date fechaEmision
    +string tipo
    +string detalle
    +generarComprobante()
    +imprimirComprobante()
    +enviarComprobante()
}

class EstadoReserva{
    PENDIENTE
    CONFIRMADA
    CANCELADA
    EN_CURSO
    FINALIZADA
}

Cliente "1" --> "*" Reserva : realiza

Reserva "*" --> "1" Habitacion : incluye

Reserva "1" --> "1" Pago : genera

Reserva "1" --> "1" Comprobante : genera

Recepcionista --> Reserva : administra

Administrador --> Habitacion : gestiona

Administrador --> Reporte : genera

Reserva --> EstadoReserva
```

## Descripción

Este diagrama representa un sistema de gestión hotelera donde:

* Un cliente puede realizar múltiples reservas.
* Cada reserva corresponde a una habitación.
* Cada reserva genera un pago.
* Cada reserva genera un comprobante.
* El recepcionista administra las reservas.
* El administrador gestiona habitaciones y reportes.
* El estado de una reserva puede ser: pendiente, confirmada, cancelada, en curso o finalizada.

## Tecnologías sugeridas

* Lenguaje: Java
* Base de datos: PostgreSQL
* UML: Mermaid
* Control de versiones: Git y GitHub

```
```
