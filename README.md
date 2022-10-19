# Practica-01-01

Ultilizamos ProcessBuilder para generar procesos,
usando .command() pasamos por parámetro que comando
queremos que se ejecute.

Creamos una variable de tipo int que indicará el numero 
de veces que queremos que el comando se ejecute.

La variable la utilizamos en el bucle for para abrir dicha
cantidad de procesos y añadirlos a un ArrayList.

En el siguiente bucle for obtenemos el tamaño de nuestro
ArrayList y obtenemos cada uno de los procesos e iterando por
cada uno de ellos comprobamos con un while si estos procesos
(proceso) están todavía ejecutándose (.isAlive()) si esta condición 
es verdadera el programa seguirá en ejecución, cuando estos procesos 
no estén vivos, el programa terminará, que es cuando el usuario cierra 
las ventanas que en un principio quería abrir.

Por último calculamos el tiempo de ejecución de nuestro programa
restando el tiempo inicial - final dado en milisegundos(ms).