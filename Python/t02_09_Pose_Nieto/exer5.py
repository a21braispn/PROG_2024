#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Exercicio 5. Crea nun script unha función recursiva: anagrama(palabra1: str, palabra2: str) -> boolean 
que indique se unha das palabras é ou non un anagrama da outra, é dicir, que se pode obter a partir das letras da outra sen máis que reordenalas.

Considerarase que as palabras están escritas en minúsculas, sen til nin outros signos diacríticos e sen espazos en branco ou outros caracteres distintos dos alfabéticos da “A” á “Z”.

Se as dúas palabras son iguais tamén se considera que son anagrama.

Nese mesmo script proba a función obtendo unha palabra por teclado e mostra por pantalla Anagrama se é un anagrama e Non anagrama en caso contrario.
"""

__author__ = "Brais Pose Nieto"

def comprobar_datos(palabra: str):
    if type(palabra) == str:
        return True
    else:
        return False

def anagrama(palabra1: str, palabra2: str) -> bool:
    if palabra1 == palabra2:
        return True
    
    if len(palabra1) == 0 and len(palabra2) == 0:
        raise ValueError

    if palabra1[0] in palabra2:
        nova_palabra2 = ""
        encontrado = False
        for char in palabra2:
            if char == palabra1[0] and not encontrado:
                encontrado = True
            else:
                nova_palabra2 += char

        return anagrama(palabra1[1:], nova_palabra2)

    return False

palabra1 = str(input("Primeira palabra: "))
palabra2 = str(input("Segunda palabra: "))

if comprobar_datos(palabra1) and comprobar_datos(palabra2):
    if anagrama(palabra1, palabra2):
        print("Son anagramas")
    else:
        print("Non son anagrama")
else:
    print("Por favor, introduza caracteres válidos.")
