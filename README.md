# Seccion 3
Entregar el Código Git, el diagrama de flujo, el diagrama de clases, el pseudo código de los siguientes ejercicios: 
1. **Servicio de Notificaciones Múltiples.**
2. **Sistema de Repositorio de Datos.**

---

## Pseudocodigo
<details>
  <summary><strong>Ejercicio 5</strong></summary>
  
```
// Interfaz INotificador

METODO enviar(mensaje, destinario)

FIN INTERFAZ

//-------------------------------------------

// Clase NotificadorEmail implementa INotificador

Metodo enviar(mensaje, destinatario)
Mostrar "Enviando Email a " + destinatario + "... el mensaje es: " + mensaje
FIN METODO

FIN CLASE

//-------------------------------------------

// Clase NotificadorSMS implementa INotificador

Metodo enviar(mensaje, destinatario)
Mostrar "Enviando SMS a " + destinatario + "... el mensaje es: " + mensaje
FIN METODO

FIN CLASE

//-------------------------------------------

// Clase NotificadorPUSH implementa INotificador

Metodo enviar(mensaje, destinatario)
Mostrar "Enviando PUSH a " + destinatario + "... el mensaje es: " + mensaje
FIN METODO

FIN CLASE

//-------------------------------------------

// Clase GestorDeAlertas

Atributo listaNotificadores

Constructor(lista)
listaNotificadores = lista
FIN CONSTRUCTOR

Metodo dispararAlertaMaxima(mensaje, destinatario)
Para cada notificador en listaNotificadores
notificador.enviar(mensaje, destinatario)
FIN PARA
FIN METODO

FIN CLASE

//-------------------------------------------

// Clase MAIN

Inicio

Crear scanner
Definir opcion como cadena

Repetir
Crear lista vacía de notificadores

Mostrar "Bienvenido al servicio de notificaciones multiples"
Mostrar "Selecciona el tipo de notificación"
Mostrar "1. Tipo Email"
Mostrar "2. Tipo SMS"
Mostrar "3. Tipo Push"

    Repetir
        Leer tipo

        Segun (tipo)
            Caso "1":
                Agregar NotificadorEmail a la lista
            Caso "2":
                Agregar NotificadorSMS a la lista
            Caso "3":
                Agregar NotificadorPush a la lista
            De otro modo:
                Mostrar "Opción invalida"
                tipo = ""     
            FinSegun
    Hasta que tipo sea "1" o "2" o "3"

        Crear objeto GestorDeAlertas enviando la lista

        Mostrar "Ingresa el mensaje:"
        Leer mensaje

        Mostrar "Ingresa el destinatario:"
        Leer destinatario

        Llamar gestor.dispararAlertaMaxima(mensaje, destinatario)

    Repetir
        Mostrar "¿Quieres que ese mismo mensaje se mande por otro tipo? (si/no)"
        Leer opcion

        Si opcion NO es "si" y NO es "no"
            Mostrar "Opcion invalida"
        FINSI
        Hasta que opcion sea "si" o "no"
        Hasta que opcion sea "no"

Cerrar scanner

FIN CLASE
FIN PROGRAMA

```

</details>
<details>
  <summary><strong>Ejercicio 6</strong></summary>

```
//INTERFAZ IRepositorio

METODO guardar(id, data)
METODO leer(id)
METODO eliminar(id)

FIN INTERFAZ

//-------------------------------------------

//CLASE RepositorioSQL IMPLEMENTA IRepositorio

ARREGLO tabla[10]

METODO guardar(data)
PARA i DESDE 0 HASTA 9
    SI tabla[i] ES null ENTONCES
        tabla[i] = data
        IMPRIMIR "SQL> INSERT INTO tabla VALUES (i, data)"
        TERMINAR METODO
    FIN SI
FIN PARA

IMPRIMIR "ERROR SQL: Tabla llena"
FIN METODO

METODO leer(id)
    IMPRIMIR "SQL> SELECT * FROM tabla WHERE id = id"
    IMPRIMIR tabla[id]
FIN METODO

METODO eliminar(id)
    IMPRIMIR "SQL> DELETE FROM tabla WHERE id = id"
    tabla[id] = null
    IMPRIMIR "1 row deleted"
FIN METODO

FIN CLASE

//-------------------------------------------

// CLASE RepositorioEnMemoria IMPLEMENTA IRepositorio

ARREGLO tabla[10]

METODO guardar(data)
    PARA i DESDE 0 HASTA 9
        SI tabla[i] ES null ENTONCES
            tabla[i] = data
            IMPRIMIR "MEM> Guardado en posición i"
            TERMINAR METODO
        FIN SI
    FIN PARA

    IMPRIMIR "MEM> Error: Memoria llena"
FIN METODO

METODO leer(id)
    IMPRIMIR "MEM> Leyendo posición id"
    IMPRIMIR tabla[id]
FIN METODO

METODO eliminar(id)
    IMPRIMIR "MEM> Eliminando posición id"
    tabla[id] = null
    IMPRIMIR "Eliminado"
FIN METODO

FIN CLASE

//-------------------------------------------

// MAIN

DECLARAR repo COMO IRepositorio
DECLARAR opcion COMO cadena
DECLARAR tipo COMO cadena
DECLARAR operacion COMO cadena
DECLARAR id, dato COMO cadena

REPETIR

MOSTRAR "Seleccione tipo de repositorio"
MOSTRAR "1. SQL"
MOSTRAR "2. Memoria"

LEER tipo

SI tipo == "1"
    repo = NUEVO RepositorioSQL
SINO
    repo = NUEVO RepositorioEnMemoria
FIN SI

    
REPETIR
    MOSTRAR "1. Guardar"
    MOSTRAR "2. Leer"
    MOSTRAR "3. Eliminar"

    LEER operacion

    SEGUN operacion HACER

        CASO "1":
        MOSTRAR "Ingrese dato a guardar"
        LEER dato
        repo.guardar(dato)

        CASO "2":
        MOSTRAR "Ingrese id a leer"
        LEER id
        repo.leer(id)

        CASO "3":
        MOSTRAR "Ingrese id a eliminar"
        LEER id
        repo.eliminar(id)

        DEFECTO:
        MOSTRAR "Opción inválida, volver a intentar"

    FIN SEGUN

    MOSTRAR "¿Desea hacer otra operación en este repositorio? (si/no)"
    LEER opcion

    HASTA opcion == "no"

    MOSTRAR "¿Desea cambiar de repositorio? (si/no)"
    LEER opcion

HASTA opcion == "no"

FIN CLASE

FIN PROGRAMA

```
</details>
