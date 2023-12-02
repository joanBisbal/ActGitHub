# Encriptación de mensajes
## ¿Qué es?
Este programa surge como solución al programa número 102 de AceptaElReto.

## ¿Qué hace?
El programa descifra cadenas de texto cifradas usando el cifrado cesar. Después cuenta e imprime el número de vocales del mensaje descifrado.

## ¿Cómo lo hace?
El programa se divide en tres problemas:

### 1.- Desplazamiento
Primero se obtiene el desplazamiento con el cual se ha cifrado el mensaje sacando la diferencia entre el caracter 'p' y el primer caracter de la cadena.

### 2.- Descifrar el mensaje
Se recorre el resto de la cadena a partir del segundo caracter. Luego se utiliza el desplazamiento para escoger el nuevo caracter y se construye el nuevo mensaje en un String vacío.

### 3.- Contar vocales
Se cuentan las vocales de la cadena descifrada y se imprime el número por pantalla.
