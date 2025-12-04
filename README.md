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

</details>
