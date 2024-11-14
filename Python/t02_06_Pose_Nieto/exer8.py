#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Exercicio 8. Queremos realizar un programa que calcule o índice dunha chave para un dicionario utilizando o algoritmo de hashing por folding. 

O programa recibirá en orde os seguintes parámetros: tamaño da táboa, número de división por folding e a chave.
"""

__author__ = "Brais Pose Nieto"

def calcular_indice_hash(tam_tabla, num_divisions, chave):
    """
    Calcula o índice hash dunha chave empregando o método de folding.

    O método divide a chave en partes dun tamaño especificado, suma os valores enteiros de cada parte
    e calcula o índice como o resto de dividir a suma total entre o tamaño da táboa.

    Args:
        tam_tabla (int): Tamaño da táboa hash.
        num_divisions (int): Número de díxitos en cada división da chave para o folding.
        chave (str): Chave que se vai converter en índice hash.

    Returns:
        int: Índice hash calculado para a chave.
    """
    suma = 0
    tam_chave = len(chave)
    
    i = 0
    while i < tam_chave:
        parte = chave[i:i+num_divisions]
        suma += int(parte)
        i += num_divisions
    
    # Calcula o índice como resto na división da suma polo tamaño da tabla
    indice = suma % tam_tabla
    
    return indice

# Solicita parámetros ao usuario
tam_tabla = int(input("Introduce o tamaño da tabla: "))
num_divisions = int(input("Introduce o número de divisións por folding: "))
chave = input("Introduce a chave: ")

# Calcula o índice
indice = calcular_indice_hash(tam_tabla, num_divisions, chave)
print(f"O índice da chave é: {indice}")
