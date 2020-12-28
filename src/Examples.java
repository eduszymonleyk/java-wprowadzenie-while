public class Examples {

    public static void main(String[] args) {
        /*

        while(warunek){
         instrukcje;
        }

        instrukcje wykują się dopóki warunke jest poprawny
         */

        int i = 1;
        while(i <= 20) {
            System.out.println("Witaj!");
            i++;
        }

        // i = 1
        // wyświetl 1
        // wyświetl Witaj!
        // i = 2
        // wyświetl 1
        // wyświetl Witaj!
        // i = 3
        // wyświetl 1
        // wyświetl Witaj!
        // i = 4
        // itd.

        System.out.println("Jestem za pętlą.");

        /*
        a l a
        m a r c i n
        m a j a
         */
//        char[][] crossword = new char[3][];
//        crossword[0] = new char[3];
//        crossword[1] = new char[6];
//        crossword[2] = new char[4];

        char[][]crossword = {{'a','l','a'}, {'m','a','r','c','i','n'}, {'m','a','j','a'}};

        System.out.print(crossword[0][0]);
        System.out.print(crossword[0][1]);
        System.out.print(crossword[0][2]);

        System.out.println();

        int z = 0;
        while(z < 3){
            System.out.print(crossword[0][z]);
            z = z+1;
        }

        System.out.println();

        System.out.print(crossword[1][0]);
        System.out.print(crossword[1][1]);
        System.out.print(crossword[1][2]);
        System.out.print(crossword[1][3]);
        System.out.print(crossword[1][4]);
        System.out.print(crossword[1][5]);


        System.out.println();

        z = 0;
        while(z<6){
            System.out.print(crossword[1][z]);
            z++;
        }

        System.out.println();

        System.out.print(crossword[2][0]);
        System.out.print(crossword[2][1]);
        System.out.print(crossword[2][2]);
        System.out.print(crossword[2][3]);

        System.out.println();

        z = 0;
        while(z < 4){
            System.out.print(crossword[2][z]);
            z++;
        }

        System.out.println();



        /********************************************/
        z = 0;
        while(z < crossword[0].length){ // liczba kolumn, długość wiersza 1
            System.out.print(crossword[0][z]);
            z++;
        }


        z = 0;
        while(z < crossword[1].length){ // liczba kolumn, długość wiersza 2
            System.out.print(crossword[1][z]);
            z++;
        }


        z = 0;
        while(z < crossword[2].length){ // liczba kolumn, długość wiersza 3
            System.out.print(crossword[2][z]);
            z++;
        }

        System.out.println("\n------ pętla w pęli ------");

        /***************************************************/
        int k = 0;
        while(k < crossword.length) { // liczba wierszy
            z = 0;
            while (z < crossword[k].length) {
                System.out.print(crossword[k][z]);
                z++;
            }
            k++;
            System.out.println();
        }

        System.out.println("--------------- crossword2 ------------------");

        char[][] crossword2 = {{'a','l','i','c','j','a'}, {'m','a','r','e','k'}, {'o','l','a'}, {'j','u','r','e','k'}};


        k = 0;
        while(k < crossword2.length) { // liczba wierszy
            z = 0;
            while (z < crossword2[k].length) {
                System.out.print(crossword2[k][z]);
                z++;
            }
            k++;
            System.out.println();
        }

        System.out.println("--------------- ile słów ------------------");

        // znajdź ile jest słów w  tym zdaniu, każe słowo jest oddzielone |
        char[] words = {'a','l','i','c','j','a','|','j','u','r','e','k','|','s','t','e','f','a','n','|','k','a','s','i','a'};




        /*
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        */

        // wyświetl wszystkie elementy
        i = 0;
        while(i < words.length){ // 19 to długością talibcy jednowymiarowej
            System.out.println(words[i]);
            i++;
        }

        // ile jest kresek ?
        int count = 0;
        i = 0;
        while(i < words.length){
            // jeżeli znajdziesz kreskę
            if(words[i] == '|'){
                count++; // to dodaj 1 do count
            }
            i++;
        }
        System.out.println("Ile jest kresek: "+count);

        // liczba kresek +1, to liczba słów

       System.out.println("Ile jest słów: "+(count+1));


        System.out.println("----------- gwiazdki 1 ----------");
       /* ***********************  gwiazdki  ****************** */

        // dla n = 4
       /*

       * * * *
        * * *
       * * * *
        * * *

        */

        int n = 10;

        i = 0;
        while(i < n){
            System.out.print("* ");
            i++;
        }

        System.out.println();

        i = 0;
        while(i < n-1){
            System.out.print(" *");
            i++;
        }

        System.out.println();

        i = 0;
        while(i < n){
            System.out.print("* ");
            i++;
        }

        System.out.println();

        i = 0;
        while(i < n-1){
            System.out.print(" *");
            i++;
        }

        System.out.println();

        System.out.println("----------- gwiazdki 2 ----------");
        int j = 0;
        while(j < n) {
            // jeżeli pażysta
            i = 0;
            if(j%2 == 0) {
                while (i < n) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                // jeżeli nieparzysta
                while (i < n - 1) {
                    System.out.print(" *");
                    i++;
                }
            }

            System.out.println();
            j++;
        }


        System.out.println("----------- gwiazdki 3 ----------");
        j = 0;
        while(j < n) {
            // jeżeli pażysta
            i = 0;
            while(i < (n*2-(j%2+1))) {
                if (((j+1)*(n*2)+(i+1)+(j%2)) % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                i++;
            }
            System.out.println();
            j++;
        }
    }
}
