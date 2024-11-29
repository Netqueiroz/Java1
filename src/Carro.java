

//@author wbcqu

public class Carro extends Veiculo {
    private int numeroPorta;
    private String tipoDirecao;
    private String tipoCambio;

    public Carro() {
        
    }

    public Carro(int numeroPorta, String tipoDirecao, String tipoCambio) {
        this.numeroPorta = numeroPorta;
        this.tipoDirecao = tipoDirecao;
        this.tipoCambio = tipoCambio;
    }

    public Carro(int numeroPorta, String tipoDirecao, String tipoCambio, String cor, String modelo, int ano, Motor motor) {
        super(cor, modelo, ano, motor);
        this.numeroPorta = numeroPorta;
        this.tipoDirecao = tipoDirecao;
        this.tipoCambio = tipoCambio;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
}
