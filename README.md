# practica-kotlin-poo3-ejercicioROBOT

# P4.4 - Robots

## Descripción: ¿Dónde está R2D2?

Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".

- El robot comienza en la coordenada (0, 0).
- Para indicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos) que indican la secuencia de pasos a dar.
- Por ejemplo: `[10, 5, -2]` indica que primero se mueve 10 pasos, se detiene, luego 5, se detiene, y finalmente 2. El resultado en este caso sería `(x: -5, y: 12)`.
- Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
- Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte positiva del eje "y".
- El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira 90 grados en el sentido contrario a las agujas del reloj.

**No te olvides lo aprendido en las primeras unidades: Estructura condicionales, repetitivas, comentarios, etc.**

### Ejemplos de Movimientos y Salidas:

# Parte 1

## Crear una versión del programa ¿Dónde está R2D2? orientado a objetos

### Clase `Robot`
La clase `Robot` debe tener 4 propiedades:
- `nombre`
- `posX`
- `posY`
- `direccion`

También tendrá un comportamiento por medio de 3 métodos:
- `mover(array)`
- `obtenerPosicion()`
- `obtenerDireccion()`

### Métodos

#### Método `mover(array)`
- Debe recibir un array de elementos enteros y no retornará nada, ya que los cambios quedarán almacenados en las propiedades del mismo.

#### Método `obtenerDireccion()`
- No recibe parámetros y retorna una cadena de caracteres con la dirección `PositiveX`, `NegativeX`, `PositiveY` o `NegativeY`.
- (Posible mejora con enum class Enum classes).

#### Método `obtenerPosicion()`
- Debe devolver la posición. Ejemplo: `(10, -5)`.

#### Método `toString()`
- Describe la posición actual del robot. Ejemplo: `R2D2 está en (10, -5) PositiveX`.

### Inicialización de la Clase `Robot`
- Un objeto de la clase `Robot` debe inicializarse siempre en la posición `(0, 0)` y la dirección eje Y positivo (hacia arriba) `PositiveY` cuando se instancia.
- En esta versión, ya no va a moverse siempre desde la posición `(0,0)`, sino que lo hará desde la última posición y dirección donde se quedó al realizar su último movimiento.

### Movimientos
En este programa, vamos a realizar los mismos movimientos, pero el robot comenzará cada movimiento en la posición final después de realizar el movimiento anterior.

En el `main` debes crear un objeto de `Robot` (o una variable de tipo `Robot`) con el nombre `R2D2`. El nombre de la variable que utilices para crearlo puede ser `robot1`.

La clase `Robot` debe obligar a introducir un nombre que no esté vacío.

Crea los movimientos en un array de arrays y recórralos para realizar en cada iteración los movimientos del robot y mostrar la posición del mismo al finalizar cada uno. En cada iteración del bucle llamaremos al método `mover()` y mostraremos por consola el contenido del robot, es decir, el método `toString()`.

### Ejemplo de Estructura de Movimientos

```python
[
   [1, -5, 0, -9],
   [3, 3, 5, 6, 1, 0, 0, -7],
   [2, 1, 0, -1, 1, 1, -4],
   [],
   [3, 5]
]


```plaintext
Movimientos:
[10, 5, -2]
[0, 0, 0]
[]
[-10, -5, 2]
[-10, -5, 2, 4, -8]



Salidas:
x: -5, y: 12, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEX
x: 0, y: 0, direction: POSITIVEY
x: 5, y: -12, direction: POSITIVEX
x: 9, y: -20, direction: NEGATIVEX
