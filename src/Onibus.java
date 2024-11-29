//@author wbcqu
public class Onibus extends Veiculo {
    private String Marca;
    private String numChassi;
    private int quantosEixos;
    private String cordoBanco;

    public Onibus(String Marca, String numChassi, int quantosEixos, String cordoBanco) {
        this.Marca = Marca;
        this.numChassi = numChassi;
        this.quantosEixos = quantosEixos;
        this.cordoBanco = cordoBanco;
    }

    public Onibus() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getnumChassi() {
        return numChassi;
    }

    public void setnumChassi(String Modelo) {
        this.numChassi = Modelo;
    }

    public int getquantosEixos() {
        return quantosEixos;
    }

    public void setquantosEixos(int quantosEixos) {
        this.quantosEixos = quantosEixos;
    }

    public String getcordoBanco() {
        return cordoBanco;
    }

    public void setcordoBanco(String Cor) {
        this.cordoBanco = Cor;
    }
    
}
