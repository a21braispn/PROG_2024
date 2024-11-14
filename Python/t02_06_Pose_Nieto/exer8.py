#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Exercicio 8. Queremos realizar un programa que calcule o índice dunha chave para un dicionario utilizando o algoritmo de hashing por folding. 

O programa recibirá en orde os seguintes parámetros: tamaño da táboa, número de división por folding e a chave.
"""

__author__ = "Brais Pose Nieto"

def calcular_indice_hash(tam_tabla, num_divisiones, clave):
    """
    Calcula o índice hash dunha clave empregando o método de folding.

    O método divide a clave en partes dun tamaño especificado, suma os valores enteiros de cada parte
    e calcula o índice como o resto de dividir a suma total entre o tamaño da táboa.

    Args:
        tam_tabla (int): Tamaño da táboa hash.
        num_divisions (int): Número de díxitos en cada división da clave para o folding.
        clave (str): Clave que se vai converter en índice hash.

    Returns:
        int: Índice hash calculado para a clave.
    """
    suma_partes = 0
    longitud_clave = len(clave)
    
    i = 0
    while i < longitud_clave:
        parte = clave[i:i+num_divisiones]
        suma_partes += int(parte)
        i += num_divisiones
    
    # Calcular el índice como el resto de dividir la suma por el tamaño de la tabla
    indice = suma_partes % tam_tabla
    
    return indice

# Solicitar parámetros al usuario
tam_tabla = int(input("Introduce el tamaño de la tabla: "))
num_divisiones = int(input("Introduce el número de divisiones por folding: "))
clave = input("Introduce la clave: ")

# Calcular el índice
indice = calcular_indice_hash(tam_tabla, num_divisiones, clave)
print(f"El índice de la clave es: {indice}")
