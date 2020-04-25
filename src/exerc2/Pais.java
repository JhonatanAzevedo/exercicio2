
package exerc2;

public class Pais {
    private String nome;
    private String nomeCapital;
    private int tamanho;
    private Pais[] fronteiras;
    
    public Pais(String nome, String nomeCapital, int tamanho) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.tamanho=tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCapital() {
        return nomeCapital;
    }

    public void setNomeCapital(String nomeCapital) {
        this.nomeCapital = nomeCapital;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void defineFronteiras(Pais... paises){
        int quantidadePaisesIguais = 0;
        for(int i=0; i<paises.length; i++){
            
           if(this.equals(paises[i])){
                
                quantidadePaisesIguais++;
            }
        }
        
        
        this.fronteiras = new Pais[paises.length - quantidadePaisesIguais];
        
        int idxFronteira = 0;
        
        
        for(int i=0;i< paises.length;i++){
            
            if(!this.equals(paises[i])){
             
                this.fronteiras[idxFronteira] = paises[i];
                
                idxFronteira++;
            }
        }  
    
    }
    
    public Pais[] getFronteiras(){
        return this.fronteiras;
    
    }
    
    public Pais[] vizinhosEmComum(Pais outro) {
        int totaisIguais = 0;
        
        
        for (Pais fronteiraPais : this.fronteiras) {
            for (Pais fronteiraOutro : outro.fronteiras) {
                if (fronteiraPais.equals(fronteiraOutro)) {
                    totaisIguais++;
                }
            }
        }

        if (totaisIguais > 0) {
            int idxVizinhos = 0;
            Pais[] mesmosVizinhos = new Pais[totaisIguais];
            for (Pais fronteiraPais : this.fronteiras) {
                for (Pais fronteiraOutro : outro.fronteiras) {
                    if (fronteiraPais.equals(fronteiraOutro)) {
                        mesmosVizinhos[idxVizinhos] = fronteiraOutro;
                        idxVizinhos++;
                    }
                }
            }

            return mesmosVizinhos;
        }
        return null;
    }        
    
}
