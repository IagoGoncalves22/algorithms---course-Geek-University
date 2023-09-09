#Variables

#Input
valor_por_hora = float(input("Qual o valor você ganha por hora? "))
horas_trabalhadas = int(input("Quantas horas você trabalhou esse mês? "))
#Process
salario = horas_trabalhadas * valor_por_hora
#Output
print("Neste mês você vai receber R$ {0:.2f}".format(salario))  