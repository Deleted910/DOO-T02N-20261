public class Clientes extends Pessoa {

    public Clientes() {

    }

    public Clientes(String nome, int idade, String cidade, String bairro, String rua) {
        super(nome, idade, cidade, bairro, rua);
    }

    public void apresentarse() {
        System.out.println("Cliente: "+ this.getNome() + " | Idade: "+ this.getIdade());
    }
    

    public static void main(String[] args) {
        Clientes cliente10 = new Clientes("Eduardo", 30, "Casc", "gnjfe", "ngvf");
        cliente10.apresentarse();
        System.out.println(cliente10.getEndereco().getCidade());
        System.out.println(cliente10.getEndereco().getBairro());
        System.out.println(cliente10.getEndereco().getRua());
    }
}
