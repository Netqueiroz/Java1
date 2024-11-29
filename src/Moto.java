

/* @author wbcqu
 */
public class Moto extends Veiculo{
    private String tipoPartida;
    private String tipoTransmissao;

    public Moto() {
    }

    public Moto(String tipoPartida, String tipoTransmissao) {
        this.tipoPartida = tipoPartida;
        this.tipoTransmissao = tipoTransmissao;
    }

    public Moto(String tipoPartida, String tipoTransmissao, String cor, String modelo, int ano, Motor motor) {
        super(cor, modelo, ano, motor);
        this.tipoPartida = tipoPartida;
        this.tipoTransmissao = tipoTransmissao;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }
    
    
}
