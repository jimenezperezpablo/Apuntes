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

## RM ##

```bash

```
