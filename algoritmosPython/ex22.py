#Input
nome = input("Informe o nome: ")
senha = input("Informe a senha: ")
#Process
while nome == senha:
    print("Nome do usuário e senha devem ser diferentes.")
    nome = input("Informe o nome: ")
    senha = input("Informe a senha: ")