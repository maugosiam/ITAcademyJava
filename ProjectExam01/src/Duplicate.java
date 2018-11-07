public class Duplicate {

    public static void main(String args[]){
        String[] tabela = new String[5];
        tabela[0] = "a";
        tabela[1] = "k";
        tabela[2] = "d";
        tabela[3] = "4";
        tabela[4] = "h";
        String[] tabelaKopia = new String[tabela.length*2];

        for(int i = 0; i<tabela.length; i++){
            tabelaKopia[2*i] = tabela[i];
            tabelaKopia[2*i+1] = tabela[i];

        }

        for(int i = 0; i<tabelaKopia.length;i++) {
            System.out.println(tabelaKopia[i]);
        }
    }
}

