public class TesteLivroDeNotas{
    public static void main(String args[]){
        //nome completamente qualificado  classe.
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome da disciplina");
        //inserferencia de tipo
        //var: somente java 10
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        //enviando a mensagem "exibirMensagem" ao objeto livroDeNotas
        livroDeNotas.exibirMensagem();
        //livroDeNotas.nomeDisciplina = "Português";
        System.out.println("A disciplina é: " + livroDeNotas.getNomeDisciplina());
        String nome = "ABC";
        System.out.println("Fim");
        lilivroDeNotas.nomeDisciplina = "Português";
    }
}