import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Jogo {

    int[][] tabuleiro = new int[2][9];

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("teste-commit.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch( IOException ioe ){
            // ...
        }
        System.out.println();
        System.out.println();
        System.out.println();
//      iniciaJogo();

        String[][] pecas = new String[][]{
            {"2","A1"},
            {"1","A2"},
            {"3","A3"},
            {"7","B1"},
            {"16","B2"},
            {"17","B3"}

        };

        board(pecas);


    }

    public static void board(String[][] pecas)
    {
        String a ="  ";
        String b ="  ";
        String c ="  ";
        String d ="  ";
        String e ="  ";
        String f ="  ";
        String g ="  ";
        String h ="  ";
        String i ="  ";
        String j ="  ";
        String k ="  ";
        String l ="  ";
        String m ="  ";
        String n ="  ";
        String o ="  ";
        String p ="  ";
        String q ="  ";


        for (int z = 0; z < pecas.length; z++) {
            String w = pecas[z][0].toString();
            if (w.equals("1")){
                a = pecas[z][1].toString();
            }
            if (w.equals("2")){
                b = pecas[z][1].toString();
            }
            if (w.equals("3")){
                c = pecas[z][1].toString();
            }
            if (w.equals("4")){
                d = pecas[z][1].toString();
            }
            if (w.equals("5")){
                e = pecas[z][1].toString();
            }
            if (w.equals("6")){
                f = pecas[z][1].toString();
            }
            if (w.equals("7")){
                g = pecas[z][1].toString();
            }
            if (w.equals("8")){
                h = pecas[z][1].toString();
            }
            if (w.equals("9")){
                i = pecas[z][1].toString();
            }
            if (w.equals("10")){
                j = pecas[z][1].toString();
            }
            if (w.equals("11")){
                k = pecas[z][1].toString();
            }
            if (w.equals("12")){
                l = pecas[z][1].toString();
            }
            if (w.equals("13")){
                m = pecas[z][1].toString();
            }
            if (w.equals("14")){
                n = pecas[z][1].toString();
            }
            if (w.equals("15")){
                o = pecas[z][1].toString();
            }
            if (w.equals("16")){
                p = pecas[z][1].toString();
            }
            if (w.equals("17")){
                q = pecas[z][1].toString();
            }



        }


        System.out.println("["+a+" ]-----------["+b+" ]-----------["+c+" ]");
        System.out.println("  |               |               |");
        System.out.println("  |    ["+d+" ]----["+e+" ]----["+f+" ]    |");
        System.out.println("  |      |        |        |      |");
        System.out.println("["+g+" ]--["+h+" ]----["+i+" ]----["+j+" ]--["+k+" ]");
        System.out.println("  |      |        |        |      |");
        System.out.println("  |    ["+l+" ]----["+m+" ]----["+n+" ]    |");
        System.out.println("  |               |               |");
        System.out.println("["+o+" ]-----------["+p+" ]-----------["+q+" ]");
    }

    public void iniciaJogo() {
        Peca vermelho1 = new Peca(1, 10, 0, 7);
        Peca vermelho2 = new Peca(2, 10, 0, 6);
        Peca vermelho3 = new Peca(3, 10, 0, 5);
        Peca preto1 = new Peca(1, 20, 0, 1);
        Peca preto2 = new Peca(2, 20, 0, 2);
        Peca preto3 = new Peca(3, 20, 0, 3);
    }

}
