
// * @author wbcqu
public class Veiculo {
    private String cor;
    private String modelo;
    private int ano;
    private Motor motor;

    public Veiculo(String cor, String modelo, int ano, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public Veiculo() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
}
