
public class Candidato {
    private String nome;
    private int votos;
    private Cargo cargo;
    pivate String partido;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public pivate getString() {
        return String;
    }

    public void setString(pivate String) {
        this.String = String;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private void ganharVoto(){
        votos += 1;
    }
}
