package adapter;

public class Cliente {

    IPagamento pagamento;
    PagamentoAdapter persistencia;

    public Cliente() {
        pagamento = new PagamentoForma();
        persistencia = new PagamentoAdapter(pagamento);
    }

    public void setPagamento(String forma) {
        pagamento.setPagamento(forma);
        persistencia.salvarPagamento();
    }

    public String getPagamento() {
        return persistencia.recuperarPagamento();
    }

    public int getCodigo() {
        return persistencia.getCodigo();
    }

}
