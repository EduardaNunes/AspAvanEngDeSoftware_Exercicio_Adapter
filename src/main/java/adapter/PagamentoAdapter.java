package adapter;

public class PagamentoAdapter extends PagamentoCodigo {

    private IPagamento pagamentoForma;

    public PagamentoAdapter(IPagamento pagamentoForma) {
        this.pagamentoForma = pagamentoForma;
    }

    public String recuperarPagamento() {
        if (this.getCodigo() == 1)
            pagamentoForma.setPagamento("PIX");
        else
            if (this.getCodigo() == 2)
                pagamentoForma.setPagamento("BOLETO");
            else
                if (this.getCodigo() == 3)
                    pagamentoForma.setPagamento("CARTAO");
                else
                    pagamentoForma.setPagamento("INVALIDO");
        return pagamentoForma.getPagamento();
    }

    public void salvarPagamento() {
        if (pagamentoForma.getPagamento().equals("PIX"))
            this.setCodigo(1);
        else
            if (pagamentoForma.getPagamento().equals("BOLETO"))
                this.setCodigo(2);
            else
                if (pagamentoForma.getPagamento().equals("CARTAO"))
                    this.setCodigo(3);
                else
                    this.setCodigo(0);
    }
}
