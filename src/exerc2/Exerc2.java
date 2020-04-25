
package exerc2;


public class Exerc2 {

   
    public static void main(String[] args) {
        System.out.println("EXERCÍCIOS DE COMPARAÇÃO DE PAÍSES E DE FRONTEIRA DE PAÍSES\nOBS: OS PAÍSES E FRONTEIRAS MENCIONADOS É UMA MERA SIMULAÇÃO NÃO É NADA EXATO!!!\n\n");
       
        Pais pais = new Pais("Brasil","Brasilia",8516000);
        Pais pais1 = new Pais("Argentina","Buenos Aires",2780000);
        Pais pais2 = new Pais("Alemanha","Berlim",357376);
        Pais pais3 = new Pais("Uruguai","Montevidéu",176215);
        Pais pais4 = new Pais("Afeganistão","Cabul",652864);
        Pais pais5 = new Pais("Croácia","Zagreb",56594);
        Pais pais6 = new Pais("Itália","Roma",301338);
        
       
        Pais[] lista_de_paises = {pais,pais1,pais2,pais3,pais4,pais5,pais6};
        
        pais.defineFronteiras(lista_de_paises);
        
        
        Pais[] lista_de_paises_classe = pais.getFronteiras();
        
        System.out.println("Países que fazem fronteira com o "+pais.getNome());
        for(int i=0;i<lista_de_paises_classe.length;i++){
            System.out.println("Nome : "+lista_de_paises_classe[i].getNome());
        }
        
        
        Pais[] lista_de_paises_comuns = {pais,pais1,pais2,pais3,pais4,pais5,pais6};
        
        pais.defineFronteiras(lista_de_paises_comuns);
        pais4.defineFronteiras(lista_de_paises_comuns);
        
        
        Pais[] lista_de_paises_comuns_classe = pais.vizinhosEmComum(pais4);
        
        System.out.println("Países que fazem fronteira com o "+pais.getNome()+" e com o "+pais4.getNome());
        for(int i=0;i<lista_de_paises_comuns_classe.length;i++){
            System.out.println("Nome : "+lista_de_paises_comuns_classe[i].getNome());
        }
        
    }
    
}


