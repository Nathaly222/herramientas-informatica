CREATE TABLE  IF NOT EXISTS lead (
    id SERIAL PRIMARY KEY,          -- Identificador único del lead
    full_name VARCHAR(255) NOT NULL, -- Nombre completo del lead
    email VARCHAR(255) UNIQUE NOT NULL, -- Correo electrónico único
    phone VARCHAR(20),              -- Teléfono
    source VARCHAR(50),             -- Fuente del lead (redes, web, etc.)
    status VARCHAR(50) DEFAULT 'nuevo', -- Estado del lead (nuevo, en proceso, convertido, descartado)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS activity(
    id SERIAL PRIMARY KEY,          -- Identificador único de la actividad
    lead_id INT NOT NULL,           -- Relación con el lead
    activity_type VARCHAR(50) NOT NULL, -- Tipo de actividad (llamada, correo, reunión, etc.)
    activity_date TIMESTAMP NOT NULL, -- Fecha de la actividad
    description TEXT,               -- Descripción de la actividad
    responsible VARCHAR(255),       -- Responsable de la actividad
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Fecha de creación
    FOREIGN KEY (lead_id) REFERENCES lead (id) ON DELETE CASCADE
    );