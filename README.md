# Seccion 3
Entregar el Código Git, el diagrama de flujo, el diagrama de clases, el pseudo código de los siguientes ejercicios: 
1. **Jerarquía de Cuentas Bancarias.**
2. **Sistema de Procesamiento de Pedidos.**

---

## Pseudocodigo
<details>
  <summary><strong>Ejercicio 3</strong></summary>
  
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

Método dispararAlertaMaxima(mensaje, destinatario)
Para cada notificador en listaNotificadores
notificador.enviar(mensaje, destinatario)
FIN PARA
FIN METODO

FIN CLASE
```

</details>
<details>
  <summary><strong>Ejercicio 4</strong></summary>

</details>
