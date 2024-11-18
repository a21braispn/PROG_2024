#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Exercicio 8. Crea un script que pida as notas dun exame dos alumnos dunha clase para procesalos. 
Tódalas notas téñense que ir almacenando nunha lista. 
Mostra un menú que se mostre continuamente ata que o usuario seleccione a opción saír. As entradas do menú son:

a) Engadir nota
b) Ver media
c) Ver número de aprobados
d) Ver máxima nota
e) Eliminar nota Primeiro debes de mostrar un menú onde mostres para cada índice da lista, a súa nota. 
O usuario indicará o índice da nota a eliminar.
f) Saír
Para poder realizar cada acción do menú, implanta as seguintes funcións:

engadir_nota(lista: list[float], nota: float).

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
Se a nota é un valor inválido, lanza a excepción ValueError.
mostrar_notas(lista: list[float])

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
Débese mostrar neste formato: índice: nota. Exemplo:
0 : nota1
1 : nota2
...
media_notas(lista: list[float]) -> float

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
numero_aprobados(lista list[float]) -> int

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
maxima_nota(lista: list[float]) -> float

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
eliminar_nota(lista: list[float], indice: int)

Comproba que a lista sexa unha lista, senón lanza excepción ValueError.
Se o índice non é válido lanza excepción ValueError.
"""

__author__ = "Brais Pose Nieto"

def engadir_nota(lista: list[float], nota: float):
    if not type(lista) == list and not type(nota) == float:
        raise ValueError
    if nota < 0 or nota > 10:
        raise ValueError

def mostrar_notas(lista: list[float]):
    if not type(lista) == list:
        raise ValueError
    for indice, valor in enumerate(lista):
        print(f"{indice} : {valor}")

def media_notas(lista: list[float]) -> float:
    if not type(lista) == list:
        raise ValueError
    return sum(lista) / len(lista)

def numero_aprobados(lista list[float]) -> int:
    

lista = []
notas = input("Introduce as notas: ")
lista.append(notas)
