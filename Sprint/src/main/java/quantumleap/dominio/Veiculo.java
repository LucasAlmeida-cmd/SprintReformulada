package quantumleap.dominio;

import java.util.Date;

public class Veiculo {
    private long idVeiculo;
    private String montadoraVeiculo;
    private String modeloVeiculo;
    private Date anoVeiculo;
    private double quantidadeQuilometros;
    private String placaVeiculo;
    private String nomeCliente;

    public Veiculo(String montadoraVeiculo, String modeloVeiculo, Date anoVeiculo, double quantidadeQuilometros, String placaVeiculo){
        this.montadoraVeiculo = montadoraVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.quantidadeQuilometros = quantidadeQuilometros;
        this.placaVeiculo = placaVeiculo;
    }


    public String getMontadoraVeiculo() {
        return montadoraVeiculo;
    }

    public void setMontadoraVeiculo(String montadoraVeiculo) {
        this.montadoraVeiculo = montadoraVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public Date getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Date anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public double getQuantidadeQuilometros() {
        return quantidadeQuilometros;
    }

    public void setQuantidadeQuilometros(double quantidadeQuilometros) {
        this.quantidadeQuilometros = quantidadeQuilometros;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
