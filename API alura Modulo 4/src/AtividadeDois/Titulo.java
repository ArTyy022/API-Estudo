package AtividadeDois;

public class Titulo {
   private String nome;
   private int ano;

   public Titulo (String nome, int ano){
       this.setNome("Venom");
       this.setAno(2018);
   }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
