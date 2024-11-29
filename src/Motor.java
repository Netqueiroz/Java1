
// * @author wbcqu
public class Motor {
    private String nome;
    private int valvula;
    private int cilindrada;

    public Motor(String nome, int valvula, int cilindrada) {
        this.nome = nome;
        this.valvula = valvula;
        this.cilindrada = cilindrada;
    }

    public Motor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValvula() {
        return valvula;
    }

    public void setValvula(int valvula) {
        this.valvula = valvula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
