public class Multiplicate {

    public static void main(String args[]){
        String[] tabela = new String[5];
        tabela[0] = "a";
        tabela[1] = "k";
        tabela[2] = "d";
        tabela[3] = "4";
        tabela[4] = "h";
        int n = 3;

        String[] tabelaKopia = new String[tabela.length*n];

        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j<n;j++) {
                tabelaKopia[n * i + j] = tabela[i];

            }

        }

        for(int i = 0; i<tabelaKopia.length;i++) {
            System.out.print("\""+tabelaKopia[i]+"\",");
        }
    }
}

