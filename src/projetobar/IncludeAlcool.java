/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobar;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class IncludeAlcool {
    private static int escolha=-1;
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        if(escolha==-1){
            System.out.println("-------------------------------------------------------------");
            System.out.println("         Olá!Esta é sua primeira vez aqui,vamos configurar o sistema      ");
            System.out.println("(1)Criar gerente");
            System.out.println("(2)Criar garçom");
            System.out.println("(3)Adicionar item ao cardápio");
            System.out.println("(0)Continuar pro Menu do Sistema");
            System.out.println("-------------------------------------------------------------");
            escolha= tec.nextInt();
            while(escolha!=0){
                if(escolha==1){
                    System.out.println("Entre com o nome do gerente");
                }
            }
        }
    }
    
}
