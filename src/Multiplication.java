public class Multiplication {
    public static void main(String[] args) {
        int n = 100;

        int[][] multi = new int[n][n];

        // wyświetlenie tablicy
        System.out.println("------------- wyświetlenie -------------");
        int i = 0;
        while(i < multi.length){
            int j = 0;
            while(j < multi[i].length){
                System.out.print(multi[i][j]+"\t");
                j++;
            }
            i++;
            System.out.println();
        }


        // 1 2 3
        // 2 4 6
        i = 0;
        while(i < multi.length){
            int j = 0;
            while(j < multi[i].length){
                multi[i][j] = (i+1)*(j+1);
                j++;
            }
            i++;
        }


        // wyświetlenie tablicy
        System.out.println("------------- wyświetlenie -------------");
        i = 0;
        while(i < multi.length){
            int j = 0;
            while(j < multi[i].length){
                System.out.print(multi[i][j]+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
