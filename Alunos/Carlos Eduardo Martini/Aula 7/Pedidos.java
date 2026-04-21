import java.util.Date;

public class Pedidos {
    public Item item;
    public Date dataCriacao;
    public Date dataPagamento;
    public Date dataVencimento;

    public Pedidos(Item item, Date dataCriacao, Date dataPagamento, Date dataVencimento){
        this.item = item;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public void impriPedido(){
        System.out.println("");
    }
}
