## Prueba sistemas UD 2

**CHMOD**

```bash
chmod XXX nombre del archivo
```

4: Lectura (r).
2: Escritura (w).
1: Ejecución (x).

**CHOWN**

```bash
chown [nuevo_propietario] [archivo]
```

**CHGRP**

```bash
chgrp (-R de manera recursiva) [nuevo_grupo] [archivo]
```

**ADDUSER**

```bash
adduser [opciones] [nombre usuario]
```

- d --> Indica su directorio home
- m --> Si no tiene directorio lo crea
- g --> Indico el grupo al que pertenece
- s /bin/bash --> Indica la consola del usuario
- p --> Indica una contraseña al usuario
- e 12/12/2015 --> Indica la caducidad del usuario

**USERMOD**

```bash
usermod [opciones] [nombre usuario]
```

- `-l [nuevo_nombre]`: Cambia el nombre del usuario.
- `-d [nueva_ruta]`: Modifica el directorio de inicio del usuario.
- `-g [grupo]`: Cambia el grupo principal del usuario.
- `-aG [grupo]`: Añade el usuario a un grupo secundario.
- `-L`/`-U`: Bloquea (`-L`) o desbloquea (`-U`) la cuenta de usuario.
- `-s [shell]`: Cambia el shell predeterminado del usuario.

**DELUSER**

```bash
deluser [nombre_usuario]
```

#### **Opciones de `deluser`**

- `--remove-home`: Elimina el directorio de inicio y los archivos del usuario.
- `--backup`: Crea un archivo comprimido del directorio de inicio antes de eliminar al usuario.
- `--remove-all-files`: Elimina todos los archivos del usuario en todo el sistema.

**GROUPADD**

```bash
  groupadd [opciones] [nombre_grupo]
```

- **Parámetros Comunes**:
  - `-g [GID]`: Especifica el GID del nuevo grupo. Si no se proporciona, el sistema asignará el siguiente GID disponible.
  - `-r`: Crea un grupo de sistema con un GID menor a 1000. Los grupos de sistema se utilizan para servicios y aplicaciones.

**GROUPDEL**

```bash
  groupdel [nombre_grupo]
```

**PASSWD**

```bash
passwd [OPCIONES] [nombre_usuario]
```

- `-e`: Expira inmediatamente la contraseña, forzando al usuario a cambiarla en el próximo inicio de sesión.
- `-l`: Bloquea la cuenta del usuario, deshabilitando su acceso.
- `-u`: Desbloquea la cuenta de un usuario previamente bloqueado.
- `-d`: Elimina la contraseña de un usuario, dejando la cuenta sin protección.

**PASS_MAX_DAYS**: Define el número máximo de días que una contraseña es válida antes de caducar.

```plaintext
PASS_MAX_DAYS 90
```

Establece que las contraseñas deben ser cambiadas cada 90 días.

**PASS_MIN_DAYS**: Especifica el número mínimo de días que deben transcurrir antes de que un usuario pueda cambiar su contraseña nuevamente.

```plaintext
PASS_MIN_DAYS 1
```

Evita cambios de contraseñas demasiado frecuentes que puedan eludir las políticas de caducidad.

**PASS_WARN_AGE**: Define el número de días antes de la caducidad en los que se alerta al usuario para que cambie su contraseña.

```plaintext
PASS_WARN_AGE 7
```

Genera un aviso al usuario 7 días antes de que su contraseña caduque.

**pam_pwquality**

```plaintext
password requisite pam_pwquality.so retry=3 minlen=12 difok=4 ucredit=-1 lcredit=-1 dcredit=-1 ocredit=-1
```

- **`retry=3`**: Permite al usuario 3 intentos para introducir una contraseña que cumpla con las políticas.
- **`minlen=12`**: Establece una longitud mínima de 12 caracteres.
- **`difok=4`**: Requiere al menos 4 caracteres diferentes a la contraseña anterior.
- **`ucredit=-1`**: Exige al menos 1 letra mayúscula.
- **`lcredit=-1`**: Exige al menos 1 letra minúscula.
- **`dcredit=-1`**: Exige al menos 1 número.
- **`ocredit=-1`**: Exige al menos 1 carácter especial.

**Verificación de la Fuerza de las Contraseñas**

El comando `pwscore` se utiliza para verificar la fortaleza de una contraseña y asegurar que cumple con las políticas definidas:

```bash
echo "contraseña_segura" | pwscore
```

**CHAGE**

- **`chage -l [usuario]`**: Muestra la información de caducidad de la cuenta.

  ```bash
  chage -l juan
  ```

  Muestra cuándo fue el último cambio de contraseña, los días hasta la próxima expiración y otros detalles.

- **`chage -E [fecha] [usuario]`**: Establece una fecha de expiración para la cuenta.

  ```bash
  chage -E 2024-12-31 juan
  ```

  Indica que la cuenta `juan` expirará el 31 de diciembre de 2024, después de lo cual el usuario no podrá iniciar sesión.

**PS**

El comando `ps` (Process Status) es una herramienta versátil y poderosa para listar y obtener información detallada de los procesos en ejecución. A diferencia de las herramientas de monitoreo en tiempo real, `ps` genera una instantánea estática del estado actual de los procesos en el momento de su ejecución. Su flexibilidad radica en la gran cantidad de opciones disponibles para personalizar la salida y enfocarse en los aspectos específicos de los procesos.

- **Sintaxis Básica**:

  ```bash
  ps [opciones]
  ```

  Si se ejecuta sin opciones, `ps` muestra solo los procesos asociados a la terminal actual.

- **Opciones Comunes**:

  - **`-e`**: Muestra todos los procesos en el sistema.
  - **`-f`**: Genera una salida detallada (formato extendido).
  - **`-u [usuario]`**: Muestra los procesos de un usuario específico.
  - **`aux`**: Muestra todos los procesos del sistema junto con detalles de su uso de CPU y memoria.

- **Ejemplo**:

  ```bash
  ps aux
  ```

  Este comando lista todos los procesos en el sistema, mostrando columnas con el nombre del usuario, el PID, el porcentaje de uso de CPU y memoria, el tiempo de ejecución, el estado y el comando que inició cada proceso.

- **Salida Típica**:
  ```
  USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
  root         1  0.0  0.1  16648  1356 ?        Ss   08:24   0:01 /sbin/init
  juan      1234  0.2  1.0  12000  8000 pts/0    R+   12:34   0:05 /bin/bash
  ```
  - **USER**: Usuario propietario del proceso.
  - **PID**: Identificador del proceso.
  - **%CPU**: Porcentaje de CPU utilizado.
  - **%MEM**: Porcentaje de memoria utilizada.
  - **VSZ**: Tamaño virtual del proceso en memoria (en KB).
  - **RSS**: Tamaño de la memoria física (en KB).
  - **TTY**: Terminal asociada al proceso.
  - **STAT**: Estado del proceso (R = Running, S = Sleeping, Z = Zombie, T = Stopped).
  - **START**: Hora de inicio del proceso.
  - **TIME**: Tiempo total de CPU consumido.
  - **COMMAND**: Comando que inició el proceso.
- **Uso Avanzado**:

  - Filtrar por nombre de proceso:

    ```bash
    ps -C sshd
    ```

    Muestra solo los procesos con el nombre `sshd`.

  - Mostrar la jerarquía de procesos:
    ```bash
    ps -ejH
    ```
    Genera un árbol de procesos con sus relaciones jerárquicas.

**TOP**

`top` es una herramienta de monitoreo en tiempo real que muestra una vista dinámica de los procesos en ejecución, actualizando su información a intervalos regulares. Proporciona una perspectiva completa del uso de recursos del sistema, incluyendo el consumo de CPU y memoria, la carga promedio y el tiempo de ejecución de los procesos. Su capacidad de interacción permite al administrador ordenar, filtrar y gestionar procesos directamente desde la interfaz.

- **Sintaxis Básica**:

  ```bash
  top
  ```

- **Interfaz y Elementos Clave**:
  Al ejecutar `top`, se despliega una interfaz dividida en dos secciones:

  1. **Resumen del Sistema (Header)**: La parte superior muestra información sobre el estado general del sistema.

     - **Load Average**: Carga promedio del sistema en los últimos 1, 5 y 15 minutos.
     - **Tareas (Tasks)**: Número de procesos en ejecución, durmientes, detenidos y zombies.
     - **CPU(s)**: Uso de la CPU, desglosado en tiempo de usuario, tiempo del sistema, tiempo de E/S, etc.
     - **Memoria**: Uso total de la memoria física y de intercambio (swap).

  2. **Lista de Procesos**: La parte inferior muestra información detallada de los procesos, como PID, uso de CPU y memoria, usuario propietario y comando de inicio.

- **Comandos Interactivos**:
  Mientras `top` está en ejecución, se pueden usar los siguientes comandos interactivos para ajustar la visualización:

  - **`P`**: Ordenar por uso de CPU.
  - **`M`**: Ordenar por uso de memoria.
  - **`k`**: Terminar un proceso especificando su PID.
  - **`r`**: Cambiar la prioridad de un proceso (requiere permisos de superusuario).

- **Uso Avanzado**:
  Es posible personalizar la interfaz de `top` con parámetros como:

  - Mostrar procesos de un usuario específico:

    ```bash
    top -u juan
    ```

    Muestra solo los procesos pertenecientes al usuario `juan`.

  - Ajustar el intervalo de actualización:
    ```bash
    top -d 5
    ```
    Cambia el intervalo de actualización a 5 segundos (por defecto es 3 segundos).

**COMANDO TOP EXAMEN**

```bash
top -b -n 1 | head -n 12 | tail -n 6 > top5.txt


ps aux --sort=-%mem | head -n 6 >> top5.txt

```




**CRONTAB**

```bash
crontab [opcion]

[minuto] [hora] [día_del_mes] [mes] [día_de_la_semana] [comando]
```

- **Editar el `crontab` del Usuario Actual**:
  ```bash
  crontab -e
  ```
  Al ejecutar `crontab -e`, se abre el editor de texto predeterminado para configurar las tareas cron del usuario actual.

- **Listar las Tareas `cron` Existentes**:
  ```bash
  crontab -l
  ```
  Muestra las tareas cron definidas para el usuario actual.

- **Eliminar el `crontab` de un Usuario**:
  ```bash
  crontab -r
  ```
  Elimina todas las tareas cron para el usuario actual


- **minuto**: Rango de `0-59`.
- **hora**: Rango de `0-23`.
- **día_del_mes**: Rango de `1-31`.
- **mes**: Rango de `1-12` o nombres abreviados (jan, feb, mar, etc.).
- **día_de_la_semana**: Rango de `0-7` (0 y 7 representan el domingo) o nombres abreviados (sun, mon, etc.).
- **comando**: El comando o script que se desea ejecutar.


**AT**

- **Ejecutar un Comando a las 10:00 a.m.**:
  ```bash
  echo "tar -czf backup.tar.gz /home/usuario" | at 10:00
  ```
  Este comando crea un archivo comprimido `backup.tar.gz` del directorio `/home/usuario` a las 10:00 a.m.

- **Ejecutar un Script a Medianoche**:
  ```bash
  at midnight < /ruta/script.sh
  ```
  Programa la ejecución de `script.sh` a la medianoche del día actual.

- **Ejecutar un Comando en 2 Días**:
  ```bash
  at now + 2 days
  ```
  Inicia una sesión interactiva de `at` donde se puede ingresar una serie de comandos que se ejecutarán en dos días.


Las tareas programadas con `at` se pueden gestionar y listar con los siguientes comandos:

- **`atq`**: Lista las tareas pendientes de ejecución para el usuario actual.
  ```bash
  atq
  ```
  Muestra la lista de tareas con su número de identificación y hora de ejecución.

- **`atrm [número]`**: Elimina una tarea programada.
  ```bash
  atrm 2
  ```
  Elimina la tarea número `2` de la lista.


