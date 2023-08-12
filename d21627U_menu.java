package pasta_AED1;
import java.util.List;
import java.util.Scanner; 
import java.util.ArrayList;
public class d21627U_menu { // Luigi Fernando Alves 
    public static Scanner teclado = new Scanner(System.in);
    public static List<String> bens = new ArrayList<String>();
    public static List<String> dataBases = new ArrayList<String>();
    public static List<String> cod = new ArrayList<String>();
  public static void main(String[] args) {
    int opcao =0;
    do{
    System.out.println("Digite a opção desejada");
    System.out.println("1- Incluir bem");
    System.out.println("2- Excluir bem");
    System.out.println("3- Atualizar bem");
    System.out.println("4- Pesquisar bem");
    System.out.println("5- Listaagem dos bens cadastrados");
    System.out.println("6- Sair do Programa");
    switch(opcao){
        case 1: d21627U_metodos.inclusaoDeBem(); break;
        case 2: d21627U_metodos.exclusaoDeBem(); break;
        case 3: d21627U_metodos.attBem();break;
        case 4: d21627U_metodos.pesqBem();break;
        case 5: d21627U_metodos.listagemBem();break;
        case 6: break;
        default: System.out.println("Opção inválida");  continue;
    }
}while(opcao!=6);
    System.out.println("FIM DO PROGRAMA!");

  }  
}
