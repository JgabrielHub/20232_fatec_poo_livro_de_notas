public class TesteLivroDeNotas{
    public static void main(String args[]){
        //nome completamente qualificado  classe.
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome da disciplina");
        //inserferencia de tipo
        //var: somente java 10
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        // enviando a men
        livroDeNotas.exibirMensagem();
        System.out.println("Fim");
    }
}