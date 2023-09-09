'''Variables'''

#Input
indice = float(input("informe o índice de poluição: "))
#Process
if indice >= 0.3 and indice < 0.4:
    print("Atenção: Indústrias do primeiro grupo devem suspender as atividades.")
elif indice >= 0.4 and indice < 0.5:
    print("Atenção: Indústrias do primeiro e segundo grupo devem suspender as atividades.")
elif indice >= 0.5:
    print("Atenção: Todos os grupos devem suspender as atividades.")
#Output