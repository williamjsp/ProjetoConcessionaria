public class Automovel {
    private String id;
    private double valor;
    private String chassi;
    private String placa;
    private boolean novo;

    public Automovel(String chassi, String id, boolean novo, String placa, double valor) {
        this.chassi = chassi;
        this.id = id;
        this.novo = novo;
        this.placa = placa;
        this.valor = valor;
    }

    public String getChassi() {
        return chassi;
    }

    private void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
