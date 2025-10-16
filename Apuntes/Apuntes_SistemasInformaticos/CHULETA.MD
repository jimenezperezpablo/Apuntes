# Comandos Linux #

## CD ##

```bash
cd /ruta/deseada


##subir un nivel superior

cd ..
```

## LS ##

```bash
ls 

##Lista con más detalles 

ls -l

##Lista con archivos ocultos

ls -a

```

## TREE ##

```bash
tree /ruta/deseada

##Mostrar solo archivos y no directorios vacíos


tree -f

##Mostrar con el tamaño de cada archivo

tree -h
```

## CP ##

```bash
##Mostrar con el tamaño de cada archivo

cp [opciones] archivo_origen archivo_destino

##OPCIONES

-r: Opción para copiar directorios de forma recursiva, incluyendo todos los subdirectorios y archivos.
-p: Mantiene los permisos, fechas y propietarios originales del archivo al copiarlo.
-i: Pregunta al usuario antes de sobrescribir un archivo existente en el destino.
-u: Copia únicamente los archivos que han sido actualizados más recientemente que los archivos de destino, útil para sincronizar directorios.


##Copiar un archivo a un nuevo directorio

cp archivo.txt /ruta/destino/

##Copiar un directorio completo de forma recursiva:

cp -r directorio /ruta/destino/

```

## MV ##

```bash
mv [opciones] archivo_origen archivo_destino

##Opciones

-i: Pregunta antes de sobrescribir archivos existentes.
-f: Fuerza el movimiento, sobrescribiendo archivos sin preguntar.
-u: Mueve el archivo solo si es más reciente o no existe en el destino.

##Mover un archivo a otro directorio

mv archivo.txt /ruta/destino/

##Renombrar un archivo

mv archivo.txt nuevo_nombre.txt

##Mover un directorio

mv /ruta/directorio /nueva/ruta/

```

## TOUCH ##

El primer parámetro es la ruta del archivo que queremos crear.Si solamente escribimos un nombre, lo creará en la carpeta donde ejecutemos el comando

```bash
touch archivo.txt
```

## CAT ##

Abre el archivo que pasemos como primer parámetro y muestra su contenido en la terminal

```bash
cat archivo.txt
```

## GREP ##

Busca una cadena de caracteres dentro de un texto. Hay dos formas de usarlo, tomando el texto como salida de otro comando usando | o abriendo el archivo pasado como segundo parámetro

```bash
ls carpeta1 | grep hola
```

## NANO ##

Abre el editor de texto Nano en la terminal.El primer parámetro es la ruta del archivo que queremos abrir.Si no existe, lo crea

```bash
nano archivo.txt
```

## WC ##

Cuenta las líneas, palabras y caracteres del archivo pasado como parámetro. También se puede usar redirigiendo la salida de otro comando a la entrada de wc

```bash
# -l     líneas
# -w   palabras
# -c caracteres

wc archivo.txt

ls -l | wc -l
```

## PWD ##

Devuelve la ruta en la que nos encontramos en la terminal. No tiene parámetros.

```bash
pwd
```

## FIND ##

Busca los archivos que cumplan con los filtros pasados como opciones dentro de la carpeta pasada como primer parámetro. Si no se le pasa carpeta, es la actual

```bash
find ~/Desktop/CarpetaMadre/Pablo1 -type f 

# Busca todos los archivos de tipo .log y busca dentro de ellos si hay la palabra error, luego lo guarda en un txt donde yo diga  
find / -type f -name "*.log" | grep -i "error" > /home/ismail/Escritorio/erroreslog.txt
```
