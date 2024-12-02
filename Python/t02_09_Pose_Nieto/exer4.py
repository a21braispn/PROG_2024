#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Exercicio 4. Desenvolva un script para determinar se unha cadea de caracteres (palabra/frase) é palíndromo, é dicir, se se pode ler igual de esquerda a dereita que de dereita a esquerda. 
Un exemplo de palíndromo é a palabra “radar”.

Desenvolva a seguinte función recursiva:

Función palindromo: cos parámetros de entrada que considere preciso para resolver de forma recursiva se unha palabra/frase é palíndromo. 
O valor de retorno será True ou False en función do caso. (Exemplo:“radar” é palíndromo, polo tanto, a función devolverá True).
Nese mesmo script proba a función obtendo unha palabra ou frase por teclado e mostra por pantalla Palídromo se é un palíndromo e Non palíndromo en caso contrario.
"""

__author__ = "Brais Pose Nieto"

def comprobar_datos(palabra: str):
    if type(palabra) == str:
        return True
    else:
        return False

def es_palindromo(palabra: str) -> bool:

    if len(palabra) <= 1:
        return True

    if palabra[0] == palabra[-1]:
        return es_palindromo(palabra[1:-1])
    else:
        return False

palabra = str(input("Palabra ou frase: "))

if comprobar_datos(palabra) == True:
    if es_palindromo(palabra) == True:
        print("É un palíndromo")
    else:
        print("Non é un palíndromo")
else:
    print("Datos incorrectos. Por favor, introduza unha cadea de caracteres.")


