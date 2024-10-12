# Calculadora Básica - Ejercicio con TDD

Este proyecto es un ejercicio de **TDD (Test-Driven Development)** en Java que implementa una calculadora básica. El usuario puede realizar operaciones aritméticas (suma, resta y multiplicación) a través de la línea de comandos. 
El desarrollo sigue los principios de TDD, donde primero se escriben los tests para cada operación antes de implementar la funcionalidad.

## Funcionalidades

- **Suma (+)**
- **Resta (-)**
- **Multiplicación (*)**

La operación de división fue implementada utilizando el enfoque de TDD, y existen tests que aseguran que la división entre cero sea manejada correctamente.

## Estructura del Proyecto


    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── com
    │   │           └── example
    │   │               └── Calculator.java
    │   └── test
    │       └── java
    │           └── com
    │               └── example
    │                   └── CalculatorTest.java
    ├── README.md
    ├── pom.xml (si estás usando Maven)

### Archivos Principales

- `Calculator.java`: Clase que contiene la implementación de las operaciones de la calculadora.
- `CalculatorTest.java`: Clase de pruebas unitarias con JUnit que cubren las operaciones de la calculadora.

## Requisitos

Para ejecutar este proyecto, necesitas tener instalado:

- **Java 8** o superior.
- **JUnit 5** (usado para escribir y ejecutar las pruebas unitarias).
- **Maven** (opcional, si lo usas para la gestión de dependencias).

## Instalación y Ejecución

1. **Clonar el repositorio**:

```bash
git clone https://github.com/ppmoyano/calculadora-tdd
cd calculadora-tdd
```
