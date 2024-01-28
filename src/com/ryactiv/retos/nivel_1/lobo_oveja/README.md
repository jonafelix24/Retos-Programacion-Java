# LOBO DISFRAZADO DE OVEJA

**Nivel:** 1
<br>
**Tags:** Arrays
<br>
**Fuente:** [Codewars](https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15)

## DESCRIPCIÓN:

Los lobos han sido reintroducidos en Gran Bretaña. Eres un granjero de ovejas, y ahora estás plagado de lobos que se hacen pasar por ovejas. Afortunadamente, eres bueno detectándolos.

Advierte a la oveja que está frente al lobo que está a punto de ser devorada. Recuerda que estás parado al frente de la cola, que está al final del arreglo:

```
[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep] (TÚ ESTÁS AQUÍ AL FRENTE DE LA COLA)
   7      6      5      4      3            2      1
```
   
Si el lobo es el animal más cercano a ti, devuelve "Pls go away and stop eating my sheep" (Por favor vete y deja de comer mis ovejas). De lo contrario, devuelve "Oi! Sheep number N! You are about to be eaten by a wolf!" (¡Oye! ¡Oveja número N! ¡Estás a punto de ser comido por un lobo!) donde N es la posición de la oveja en la cola.

**Nota:** siempre habrá exactamente un lobo en el arreglo.


## Ejemplos

**Input:** `["sheep", "sheep", "sheep", "wolf", "sheep"]`
<br>
**Output:** `"Oi! Sheep number 1! You are about to be eaten by a wolf!"`

**Input:** `["sheep", "sheep", "wolf"]`
<br>
**Output:** `"Pls go away and stop eating my sheep"`
