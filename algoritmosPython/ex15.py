'''Variables'''

#Input
numero = int(input("Informe um número: "))
#Process
if numero % 2 == 0:
    if numero > 0:
        print("O número {0} é par e positivo".format(numero))
    else:
        print("O número {0} é par e negativo".format(numero))
else:
     if numero > 0:
        print("O número {0} é impar e positivo".format(numero))
     else:
        print("O número {0} é impar e negativo".format(numero))
#Output
