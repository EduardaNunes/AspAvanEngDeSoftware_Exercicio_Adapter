package adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarFormaPagamentoAluno() {
        Cliente cliente = new Cliente();
        cliente.setPagamento("PIX");

        assertEquals("PIX", cliente.getPagamento());
    }

    @Test
    void deveRetornarCodigoPagamentoAluno() {
        Cliente cliente = new Cliente();
        cliente.setPagamento("PIX");

        assertEquals(1, cliente.getCodigo());
    }

    @Test
    void deveRetornarCodigoPagamentoBoleto() {
        Cliente cliente = new Cliente();
        cliente.setPagamento("BOLETO");

        assertEquals(2, cliente.getCodigo());
        assertEquals("BOLETO", cliente.getPagamento());
    }

    @Test
    void deveRetornarCodigoPagamentoCartao() {
        Cliente cliente = new Cliente();
        cliente.setPagamento("CARTAO");

        assertEquals(3, cliente.getCodigo());
        assertEquals("CARTAO", cliente.getPagamento());
    }

    @Test
    void deveRetornarPagamentoInvalidoParaFormaInexistente() {
        Cliente cliente = new Cliente();
        cliente.setPagamento("DINHEIRO");

        assertEquals(0, cliente.getCodigo());
        assertEquals("INVALIDO", cliente.getPagamento());
    }

}
