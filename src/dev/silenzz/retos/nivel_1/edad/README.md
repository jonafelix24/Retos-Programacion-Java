# ¿QUÉ EDAD TENDRÉ EN 2099?

**Nivel:** 1
<br>
**Tags:** Básico
<br>
**Fuente:** [Codewars](https://www.codewars.com/kata/5761a717780f8950ce001473)

## DESCRIPCIÓN:

El reto es escribir una función que tome dos parámetros: el año de nacimiento y el año a calcular, dependiendo los parámetros la función debe retornar qué edad tendrás en un futuro o cuantos años faltan para nacer.

El resultado debe tener el siguiente formato:
- Para fechas en futuro `"You are ... year(s) old."` (Tendrás ... años).
- Para fechas en pasado `"You will be born in ... year(s)."` (Nacerás en ... años).
- Si el año de nacimiento es igual al año a calcular: `"You were born this very year!"` (Naciste en este año).

**Notas:**
- `"..."` se debe reemplazar por el año calculado.
- Debes manejar `"year"` y también `"years"` dependiendo del resultado.

## Ejemplos

**Input:** `2020, 2024`
<br>
**Output:** `"You are 4 years old."`

**Input:** `2004, 1994`
<br>
**Output:** `"You will be born in 10 years."`

**Input:** `2023, 2024`
<br>
**Output:** `"You are 1 year old."`

**Input:** `3034, 3034`
<br>
**Output:** `"You were born this very year!"`
