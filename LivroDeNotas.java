public class LivroDeNotas{
    //variavel de instancia
    //instancia pe sinonimo de objeto
    String nomeDisciplina;

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDisciplina);
    }
    // construtor padrão (aquele cusa lista de parametros é vazia)
    LivroDeNotas(String n){
        //shadowing
       this.nomeDisciplina = n;
    }
}