# Documentación de la API: EcoTecRecicla

## 1. Descripción General

La API de **EcoTecRecicla** permite interactuar con los recursos de reciclaje, gestionar usuarios y generar reportes. A continuación, se detallan los **endpoints** disponibles para realizar operaciones con la API. En esta API, solo se utilizan los métodos HTTP **GET** y **POST**.

## 2. Endpoints

### 2.1 Obtener todos los reportes
**GET** `/api/reports`

Este endpoint permite obtener todos los reportes generados por los usuarios del sistema.


#### Respuesta exitosa (200 OK)
### 2.2 **Crear un reporte**
**POST** `/api/reports`

Este endpoint permite crear un nuevo reporte. Requiere un objeto JSON en el cuerpo de la solicitud con la información del reporte.

#### Ejemplo de solicitud:
```json
{
    "deviceType": "Sensor",
    "status": "Active",
    "reportDate": "2024-11-01",
    "reportStatus": "Pending",
    "user": {
        "id": 2
    }
}


### 2.2 **Crear un reporte**
**POST** `/api/reports`

Este endpoint permite crear un nuevo reporte. Requiere un objeto JSON en el cuerpo de la solicitud con la información del reporte.

#### Ejemplo de solicitud:
```json
{
    "deviceType": "Sensor",
    "status": "Active",
    "reportDate": "2024-11-01",
    "reportStatus": "Pending",
    "user": {
        "id": 2
    }
}

