import javax.swing.*;
public class TesteAtribuicao{
   public static void main(String[] args){
      String nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
      int idade = Integer.parseInt (JOptionPane.showInputDialog("Digite a idade: "));
      String nomeD = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
      boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("É pratica?true/false")); // como coloquei na disciplina "boolean = false", sempre vai dar false.
      
      Professor professor = new Professor(nome, idade);
      Disciplina disciplina = new Disciplina(nomeD);
      
      JOptionPane.showMessageDialog(null, professor.getDados());
      JOptionPane.showMessageDialog(null, disciplina.getDados());
            
   }   

}