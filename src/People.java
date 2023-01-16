public class People {
    public String nome;

    public People(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "People{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
