# personapp-hexa-spring-boot
Moisés Quintero, Santiago Hernández, Gabriel Martín.
Este repositorio contiene scripts y guías para la instalación y configuración de dos bases de datos en una arquitectura hexagonal: MongoDB y MariaDB. Estas instrucciones están diseñadas para usuarios que trabajan en un entorno Windows.


### Instalación de MongoDB ###

1. **Descarga de MongoDB**: 
   - Visita la página de descargas oficial de MongoDB (https://www.mongodb.com/try/download/community).
   - Selecciona tu sistema operativo y descarga el paquete de instalación MSI.
   - Ejecuta el instalador y sigue las instrucciones en pantalla.

2. **Instalación del Shell de MongoDB y MongoDB Compass**:
   - Desde el mismo sitio oficial, descarga el Shell de MongoDB y MongoDB Compass.
   - Sigue los pasos de instalación para cada uno de ellos.

3. **Conexión a MongoDB**:
   - Una vez instalado MongoDB Compass, realiza la conexión al puerto 27017.

### Instalación de MariaDB ###

1. **Descarga de MariaDB**:
   - Visita el enlace de descargas oficial de MariaDB: [Descargar MariaDB](https://mariadb.org/download/).
   - Selecciona la versión y el paquete adecuados (MSI para Windows de 64 bits).
   - Ejecuta el archivo MSI y sigue las instrucciones del asistente de instalación.

2. **Configuración de HeidiSQL**:
   - Al instalar MariaDB, también se instala HeidiSQL.
   - Abre HeidiSQL y selecciona "Nueva sesión".
   - Elige "MariaDB" como tipo de servidor y proporciona la dirección IP local (127.0.0.1).
   - Ingresa el puerto correcto (por defecto 3306) y las credenciales de acceso.

### Ejecución de Scripts ###

1. **Clonar el Repositorio**:
   - Clona el repositorio desde GitHub utilizando el comando `git clone https://github.com/SteelheartBreak/personapp-hexa-spring-boot.git`.

2. **Ejecución en MongoDB**:
   - Abre MongoDB Compass y conecta al servidor MongoDB.
   - Crea la base de datos "persona_db" y la colección "persona".
   - Utiliza el MongoDB Shell para ejecutar los scripts DDL y DML según sea necesario.

3. **Ejecución en MariaDB**:
   - Utiliza HeidiSQL para cargar y ejecutar los archivos SQL encontrados en la carpeta "Scripts" del repositorio.
   - Ejecuta el archivo DDL para crear las tablas necesarias.
   - Ejecuta el archivo DML para insertar datos en las tablas.

Siguiendo estas instrucciones, podrás instalar y configurar MongoDB y MariaDB en tu sistema Windows, así como ejecutar los scripts proporcionados para crear y poblar las bases de datos.