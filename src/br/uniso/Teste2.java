package br.uniso;

import java.io.*;

public class Teste2 {

    public static void main(String args[]) throws Exception{

        // Ler o arquivo em Java
        File f = new File("alunos2.txt");



        // Vou pegar o conteudo do arquivo e jogar em memoria
        // para tal eu preciso de um fluxo de entrada, que parta do disco -> memoria


        // BEBE COM A FRALDA CHEIA DE MERDA
        InputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        // a hora KARATE KID - a hora de verdade
        // amador
            /*String cabecalho = br.readLine();
            String primeiraLinha = br.readLine();
            String segundaLinha = br.readLine();
            String terceiraLinha = br.readLine();

            System.out.println(cabecalho);
            System.out.println(primeiraLinha);
            System.out.println(segundaLinha);
            System.out.println(terceiraLinha);*/

        // profiçionau
        String linha = br.readLine();
        // enquanto a linha nao for nula, ou seja, tiver conteudo
        while(linha != null){

            String vetor[] = linha.split(";");
            // imprimo os nome, sou de porto feliz, beleza?
            System.out.println(vetor[0]);
            // passo pa 'prossima
            linha = br.readLine();
        }

        //estagiarice
        // pai cuidadoso, capturou a merda e limpou
    }






}