public class Disciplina{
   private String nome;
   private boolean pratica;
   
   public Disciplina(String nomeD){
      this.nome = nomeD;
      this.pratica = true;
   }
   
   public String getNome(){
      return nome;
   }
   public boolean getPratica(){
      return pratica;
   }
   
   public void setNome(String nomeD){
      this.nome = nomeD;
   }
   public void setPratica(boolean pratica){
      this.pratica = pratica;
   }
   
   public String getDados(){
      return "Disciplina[nome= " + nome + ", pratica= " + pratica + "]";
   }   

}