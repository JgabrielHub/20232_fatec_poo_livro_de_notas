public class TesteLivroDeNotas{
    public static void main(String args[]){
        //nome completamente qualificado  classe.
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome da disciplina");
        //inserferencia de tipo
        //var: somente java 10
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        //enviando a mensagem
        livroDeNotas.exibirMensagem();
        //livroDeNotas.nomeDisciplina = "Português";
        System.out.println("A disciplina é: " + livroDeNotas.getNomeDisciplina());
        System.out.println("Fim");
    }
}