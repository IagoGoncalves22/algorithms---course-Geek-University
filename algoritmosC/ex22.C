#include<stdio.h>
#include<string.h>
int main() {
    //Declaration of variables
    char nome[100], senha[100];

    //Input
    printf("Informe o nome: ");
    gets(nome);
    printf("Informe a senha: ");
    gets(senha);
    

    //Process
    while (!strcmp(nome, senha))
    {
    printf("Nome de usuário e senha devem ser diferentes. \n");
    printf("Informe o nome: ");
    gets(nome);
    printf("Informe a senha: ");
    gets(senha);
    }
    
    

    //Output
    
}