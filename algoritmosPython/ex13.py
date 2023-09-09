'''Variables'''
valor_hora = 10.00
valor_hora_excedente = 20.00
e = 0
#Input
c = int(input("Informe o código: "))
n = float(input("Informe a quantidade de horas trabalhadas: "))
#Process
if n > 50:
    e = (n - 50) * valor_hora_excedente
    salario = (50 * valor_hora) + e
    print("Salário Total R$ {0:.2f}".format(salario))
    print("Salário excedente R$ {0:.2f}".format(e))
#Output
