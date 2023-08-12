package pasta_AED1;
public class d21627U_metodos { // Luigi Fernando Alves 
    public static void inclusaoDeBem(){
        String bem = "";
        String dataBase = "";
        do{
        System.out.println("Digite o valor do bem a ser incluído(digite x para interromper):");
         bem = d21627U_menu.teclado.nextLine();
        if(bem.equalsIgnoreCase("X")){
            break;
        }
        else if (d21627U_menu.bens.indexOf(bem)>0){
            System.out.println("Este bem já foi cadastrado!");
            break;
        }
        System.out.println("Digite o código deste bem: ");
          String cod=d21627U_menu.teclado.nextLine();
        d21627U_menu.bens.add(bem);
        d21627U_menu.dataBases.add(dataBase);
        d21627U_menu.cod.add(cod);
    }while (!bem.equalsIgnoreCase("x"));
    System.out.println();
    System.out.println("-");
    System.out.println();
    }
    
    public static void exclusaoDeBem(){
        System.out.println("Digite o código do bem: ");
        String bem = d21627U_menu.teclado.nextLine();
        if (d21627U_menu.cod.indexOf(bem)>0){
            int posbem=d21627U_menu.cod.indexOf(bem);
        System.out.println("valor: "+d21627U_menu.cod.get(d21627U_menu.bens.indexOf(bem)));
        System.out.println("Data Base: "+d21627U_menu.dataBases.get(posbem));
        d21627U_menu.bens.remove(bem);
        d21627U_menu.dataBases.remove(posbem);
        System.out.println("Bem Excluido!");
        }
        else{
        System.out.println("Bem não encontrado!");
        }
        System.out.println();
    System.out.println("-");
    System.out.println();
    }
    
    public static void attBem(){
        System.out.println("Digite um código de bem");
          String bem = d21627U_menu.teclado.nextLine();
        if(d21627U_menu.cod.indexOf(bem)>0){
            int posBem = d21627U_menu.cod.indexOf(bem);
            System.out.println("Digite o novo código do bem: ");
            String novoCod = d21627U_menu.teclado.nextLine();
            d21627U_menu.cod.set(posBem,novoCod);
            System.out.println("Bem atualizado!");
        }
        else{
            System.out.println("Bem não encontrado! ");
        }
        System.out.println();
    System.out.println("-");
    System.out.println();
    }

    
public static void pesqBem(){
    System.out.println("Digite o código do bem: ");
      String bem = d21627U_menu.teclado.nextLine();
    if (d21627U_menu.cod.indexOf(bem)>0){
        int posBem = d21627U_menu.cod.indexOf(bem);
        System.out.println("Bem encontrado!");
        System.out.println("valor: "+d21627U_menu.bens.get(posBem));
        System.out.println("Data base: "+d21627U_menu.dataBases.get(posBem));
    }
    else{
        System.out.println("Bem não encotrado!");
    }
    System.out.println();
    System.out.println("-");
    System.out.println();
    }

public static void listagemBem(){
    for(int aux=0;aux<d21627U_menu.bens.size();aux++){   // Método da bolha  
        for (int cont=0;cont< d21627U_menu.bens.size();cont++){
            if (d21627U_menu.bens.get(cont).compareTo(d21627U_menu.bens.get(cont+1)) < 0){
            String temp=d21627U_menu.bens.get(cont);
            d21627U_menu.bens.set(cont, d21627U_menu.bens.get(cont+1));
            d21627U_menu.bens.set(cont+1, temp);
            String temp2=d21627U_menu.dataBases.get(cont);
            d21627U_menu.dataBases.set(cont, d21627U_menu.dataBases.get(cont+1));
            d21627U_menu.dataBases.set(cont+1, temp2);
            String temp3=d21627U_menu.cod.get(cont);
            d21627U_menu.cod.set(cont, d21627U_menu.cod.get(cont+1));
            d21627U_menu.cod.set(cont+1, temp3);
            }
        }
    }
    for(int aux=0;aux<d21627U_menu.bens.size();aux++){
    System.out.println("Código: "+d21627U_menu.cod.get(aux)+"Valor: "+d21627U_menu.bens.get(aux)+" Data base: "+d21627U_menu.dataBases.get(aux));
    System.out.println("Quantidade de bens listados: "+d21627U_menu.bens.size());
    System.out.println();
    System.out.println("-");
    System.out.println();
    }
}
}


