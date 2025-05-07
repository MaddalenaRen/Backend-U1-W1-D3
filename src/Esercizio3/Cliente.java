package Esercizio3;

public class Cliente {
    private String codiceCliente;
    private String nomeCliente;
    private String cognomeCliente;
    private String emailCliente;
    private String dataIscrizione;

    public Cliente(String codiceCliente, String nomeCliente, String cognomeCliente, String emailCliente, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.emailCliente = emailCliente;
        this.dataIscrizione = dataIscrizione;
    }

        public String getNomeCompleto() {
            return nomeCliente + " " + cognomeCliente;
        }
    }

}
