package adapter;

public class PagamentoForma implements IPagamento {

    private String forma;

    @Override
    public String getPagamento() {
        return this.forma;
    }

    @Override
    public void setPagamento(String forma) {
        this.forma = forma;
    }
}
