package br.uniso;

import java.io.*;

public class Teste1 {

    private static String Regex;

    public static void main(String args[]) throws Exception {

        // Ler o arquivo em Java
        File f = new File("alunos.txt");



        // Vou pegar o conteudo do arquivo e jogar em memoria
        // para tal eu preciso de um fluxo de entrada, que parta do disco -> memoria
        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader (isr);
            // a hora da verdade

            //amador
            /*String Cabecalho = br.readLine();
            String PrimeiraLinha = br.readLine();
            String SegundaLinha = br.readLine();
            String TerceiraLinha = br.readLine();
            String QuartaLinha = br.readLine();


            System.out.println(Cabecalho);
            System.out.println(PrimeiraLinha);
            System.out.println(SegundaLinha);
            System.out.println(TerceiraLinha);
            System.out.println(QuartaLinha);*/

            //top top top
            String linha =br.readLine();
            // enquanto tiver conteudo na linha imprime ela e passa pra prox linha ate acabar o texto
            while(linha != null){


                String vetor[] = linha.split(";");
                //imprime ela
                System.out.println(vetor[1]);
                //passa pro prox
                linha = br.readLine();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
