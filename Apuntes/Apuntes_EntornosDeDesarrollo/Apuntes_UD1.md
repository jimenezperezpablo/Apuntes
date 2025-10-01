# Git y sus usos #

## **1. Terminos iniciales para conocer Git y que funciones tiene**

- **Repositorio** : Una carpeta donde Git realiza un seguimiento de tu proyecto y su historial.
- **Clonar** : Hacer una copia de un repositorio remoto en tu ordenador.
- **Commit** : Guarda una instantánea de los cambios preparados.
- **Pull** : Obtén los últimos cambios de un repositorio remoto.
- **Push** : Envía tus cambios a un repositorio remoto.

## **2. Instalacion Inicial de Git**

En windows usaremos la aplicacion `Git Bash`, una vez que tengamos esta aplicacion lo primero sera configurar nuestro nombre 

``` Bash
git config --global user.name "Your Name"
```


Despues de esto configuraremos nuestro correo electronico

``` Bash
git config --global user.email "you@example.com" 
```

Y haciendo uso de `--global` podremos poner esta configuracion para todos nuestros proyectos

A la hora de crear un nuevo proyecto deberemos hacer uso de `mkdir` y `cd` para crear una nueva carpeta y entrar a ella despues de esto iniciaremos git

``` Bash
git init 
```

Una vez que hemos hecho esto crearemos un archivo el cual usaremos para subirlo, en mi caso
