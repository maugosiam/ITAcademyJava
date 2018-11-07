public class EvenOdd {

    public static void main(String args[]){
        int[] tabela = new int[10];
        tabela[0] = 1;
        tabela[1] = 4;
        tabela[2] = 4;
        tabela[3] = 4;
        tabela[4] = 4;
        tabela[5] = 5;
        tabela[6] = 4;
        tabela[7] = 4;
        tabela[8] = 7;
        tabela[9] = 4;

        int liczbaParzystych=0;
        for(int i = 0; i<tabela.length;i++){
            if(tabela[i]%2 == 0)
                liczbaParzystych++;
        }

        System.out.println("Liczba parzystych wartości tabeli wynosi: "+liczbaParzystych+" a nieparzystych: "+(tabela.length-liczbaParzystych));
    }
}
