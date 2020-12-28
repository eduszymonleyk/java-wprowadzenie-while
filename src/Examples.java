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
    }
}
