public class LivroDeNotas{
    //variavel de instancia
    //instancia pe sinonimo de objeto
    //modificadorde acesso
    private String nomeDisciplina;
    //metodos gatters/setters
    //principio do menor privilégio
    public String getNomeDisciplina(){
        return nomeDisciplina;
    };
    //setter
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina;
    }
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDisciplina);
    }
    // construtor padrão (aquele cusa lista de parametros é vazia)
    LivroDeNotas(String n){
        //shadowing
       this.nomeDisciplina = n;
    }
}