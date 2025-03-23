# Publicación de software en Github

## Proyecto

### Clonar repositorio

Clonar un repositorio extrae una copia integral de todos los datos del mismo que `Github` tiene en ese momento, incluyendo todas las versiones para cada archivo y carpeta para el proyecto.

Ejecutando el siguiente comando:

```console
$ git clone https://github.com/mancabra/publicaci-nDeSoftwareEnGithub.git
```

### Generar ramas en el repositorio

Para añadir código a este repositorio es necesario generar una rama agregando el código a integrar. Para generar una nueva rama deberemos situarnos en la rama de develop con el comando:

```console
$ git checkout "develop" // posicionará el repositorio local en la rama de develop
```
```console
$ git pull origin "develop" // actualizara la rama develop a su última versión
```

Y creando la nueva rama ejecutando el comando:

```console
$ git checkout -b "name-branch"
```

Esto generará una rama que será una copia de la rama develop donde poderemos agregar nuestro código sin afectar la rama principal.

### Añadir código a una rama

Una vez generemos nuestra rama podremos realizar las modificaciones correspondientes y/o agregar los nuevos archivos a nuestro repositorio. para esto podremos utilizar los siguinetes comandos:

```console
$ git status // mostrará todos los archivos agregados o modificados
```

Notaremos que los archivos arrojados por el comando `git status` se mostraran en un color rojo, esto indica que los archivos no se han agregado al commit, para gregarlos podemoste utilizar los comandos:

```console
$ git add <path-file>  // agregaráal commit el archivo indicado
```

```console
$ git add . // agregara todos los archivos listados al commit
```

Al ejecutar estos comandos veremos que al usar `git status` una vez más veremos que los archivos han cambiado a color verde. Finalmente tendremos generar nuestro commit y publicar los cambios para esto podemos
ejecutar los comandos:

```console
$ git commit -m "commit message" // añade un commit con los cambios agregados con git add y el mensaje indicado.
```

```console
$ git pull // añade nuestro código en el repositorio remoto en la rama indicada.
```
