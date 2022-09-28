package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    void Serivice() {

        //lista
        List<Clientes> clientesList = new ArrayList<>();

        Clientes cliente = new Clientes();
        Produtos produto = new Produtos();         // Exemplo

        int cont = 0;

        DMJ:
        while (true){

            System.out.println("-=-=-=-=-=-=-=-=BEM VINDO=-=-=-=-=-=-=-=-");
            System.out.println("Se você deseja sair do aplicativo digite: (1)");
            System.out.println("Se você deseja adicionar um cliente ao aplicativo digite: (2)");
            System.out.println("Se você deseja remover clientes do aplicativo digite: (3)");
            System.out.println("Se você deseja imprimir dadas de um cliente especifico do aplicativo digite: (4)");
            System.out.println("Se você deseja imprimir todos os clientes da lista do aplicativo digite: (5)");
            System.out.println("Se voce deseja remover/atualizar produtos do cliente digite: (6)");
            cont ++;

            Scanner scanner = new Scanner(System.in);
            int opicacaoEscolhida = scanner.nextInt();
            //Sair do app
            if (opicacaoEscolhida==1){
                System.out.println("Você saiu do aplicativo. Obrigado, volte sempre!!...");
                break DMJ;
            }
            //Add cliente
            if (opicacaoEscolhida==2){
                Clientes clientes = new Clientes();
                System.out.println("Digite os seguintes dados do cliente em suas respectivas ordes: Nome, CPF, produtos");
                Scanner atributosDoCliente = new Scanner(System.in);
                clientes.nome = atributosDoCliente.nextLine();
                clientes.cpf = atributosDoCliente.nextLine();
                
                System.out.println("Cliente com nome: "+cliente.nome);
                System.out.println("Cliente com idade: "+cliente.cpf);
                clientesList.add(cliente);

            }
            //Remover cliente
            if (opicacaoEscolhida==3) {
                for (int c = 0; c < clientesList.size(); c++) {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente, que voce deseja remover");
                    String remove = scanner1.nextLine();
                    if (remove.equals(clientesList.get(c))) {
                        clientesList.remove(c);

                    }
                }

            //Cliente em especifico
            if (opicacaoEscolhida==4) {
                System.out.println("Digite o CPF do cliente que voce quer");
                Scanner scanner1 = new Scanner(System.in);
                String clienteEmEspecifico = scanner1.nextLine();
                for (Clientes c : clientesList) {
                    if (clienteEmEspecifico.equals(c.cpf)) {
                        System.out.println("Nome: " + c.nome);
                        System.out.println("Idade: " + c.cpf);


                    }

                }
            }
            //Todos os Clientes
            if (opicacaoEscolhida==5) {
                System.out.println("Imprimindo os nomes dos clientes da lista...");
                for (Clientes s : clientesList) {
                    System.out.println(s.nome);

                }
            }
            //Atualizar
            if (opicacaoEscolhida==6){


            }

            }else{
                System.out.println("nenhuma opicao valida, por favor digite um numero que esteja na lista!");
            }



        }



    }

}







