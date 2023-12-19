-- Comandos para borrar la base de datos
DROP DATABASE IF EXISTS database_cinemagic;


-- Comandos para crear la Base de datos
CREATE DATABASE IF NOT EXISTS `database_cinemagic`
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_unicode_ci;
  
  -- Usar la base de datos
USE database_cinemagic;

-- Crear la tabla 'asientos'
CREATE TABLE asientos (
    AsientoID INT AUTO_INCREMENT PRIMARY KEY,
    HorarioID INT,
    NumeroAsiento INT,
    Disponible BOOLEAN,
    FOREIGN KEY (HorarioID) REFERENCES horario(HorarioID)
);

-- Crear la tabla 'compra'
CREATE TABLE compra (
    CompraID INT AUTO_INCREMENT PRIMARY KEY,
    UsuarioID INT,
    Titulo INT,
    Clasificacion INT,
    HorarioID INT,
    AsientoID INT,
    FechaCompra TIMESTAMP,
    TotalPago DECIMAL(10, 2),
    MedioPagoID INT,
    FOREIGN KEY (UsuarioID) REFERENCES usuario(UsuarioID),
    FOREIGN KEY (Titulo) REFERENCES pelicula(PeliculaID),
    FOREIGN KEY (Clasificacion) REFERENCES pelicula(PeliculaID),
    FOREIGN KEY (HorarioID) REFERENCES horario(HorarioID),
    FOREIGN KEY (AsientoID) REFERENCES asientos(AsientoID),
    FOREIGN KEY (MedioPagoID) REFERENCES medioDePago(MedioPagoID)
);

-- Crear la tabla 'funcion'
CREATE TABLE funcion (
    FuncionID INT AUTO_INCREMENT PRIMARY KEY,
    PeliculaID INT,
    HorarioID INT,
    Clasificacion VARCHAR(255),
    NumAsientosDisponibles INT,
    SalaID INT,
    FechaID INT,
    HoraInicioID INT,
    CostoFuncion DECIMAL(10, 2),
    FOREIGN KEY (PeliculaID) REFERENCES pelicula(PeliculaID),
    FOREIGN KEY (HorarioID) REFERENCES horario(HorarioID),
    FOREIGN KEY (SalaID) REFERENCES horario(HorarioID),
    FOREIGN KEY (FechaID) REFERENCES horario(HorarioID),
    FOREIGN KEY (HoraInicioID) REFERENCES horario(HorarioID)
);

-- Crear la tabla 'horario'
CREATE TABLE horario (
    HorarioID INT AUTO_INCREMENT PRIMARY KEY,
    PeliculaID INT,
    Fecha DATE,
    HoraInicio TIME,
    Sala VARCHAR(255),
    Precio DECIMAL(10, 2),
    FOREIGN KEY (PeliculaID) REFERENCES pelicula(PeliculaID)
);

-- Crear la tabla 'medioDePago'
CREATE TABLE medioDePago (
    MedioPagoID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255)
);

-- Crear la tabla 'pelicula'
CREATE TABLE pelicula (
    PeliculaID INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(255),
    Descripcion VARCHAR(255),
    ClasificacionPelicula VARCHAR(255),
    Duracion INT,
    Genero VARCHAR(255)
);

-- Crear la tabla 'resena'
CREATE TABLE resena (
    ResenaID INT AUTO_INCREMENT PRIMARY KEY,
    UsuarioID INT,
    PeliculaID INT,
    Calificacion INT,
    Comentario VARCHAR(255),
    FechaResena TIMESTAMP,
    FOREIGN KEY (UsuarioID) REFERENCES usuario(UsuarioID),
    FOREIGN KEY (PeliculaID) REFERENCES pelicula(PeliculaID)
);

-- Crear la tabla 'usuario'
CREATE TABLE usuario (
    UsuarioID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Correo VARCHAR(255),
    TipoUsuario VARCHAR(50),
    CreatedAt TIMESTAMP NOT NULL,
    UpdatedAt TIMESTAMP,
    UNIQUE (Correo)
);