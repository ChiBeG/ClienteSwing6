package adapters.input.ui.cadastrocliente;

import services.application.cliente.CadastroClientePort;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;

public class ListaClientesView extends JPanel {

    private final JEditorPane pnListaClientes;

    public ListaClientesView() {

        setLayout(new BorderLayout());

        pnListaClientes = new JEditorPane();
        pnListaClientes.setContentType("text/html");

        add(new JScrollPane(pnListaClientes), BorderLayout.CENTER);
    }

    public void apresentarDados() {
        var builder = new StringBuilder();

        builder.append("<html><body><table border='1'><tr><th>CPF</th><th>Nome</th><th>Data de Nascimento</th><th>Endereço</th><th>Telefone</th></tr>");

        builder.append("<tr><td>765.875.546-34</td><td>Paulo Guimarães</td><td>15/08/2001</td><td>Rua das Flores, 100, casa 1<br>Vila Isabel - Rio de Janeiro<br>20431-000 - RJ</td><td>(21) 87654-3210</td></tr>");
        builder.append("<tr><td>023.231.569-02</td><td>Ana Almeida</td><td>20/02/1997</td><td>Rua Cd. de Bonfim, 200, ap 502<br>Tijuca - Rio de Janeiro<br>20530-000 - RJ</td><td>(21) 98765-4321</td></tr>");
        builder.append("<tr><td>341.651.876-14</td><td>Beatriz Peixoto</td><td>23/12/2003</td><td>Av Pasteur, 468<br>Urca - Rio de Janeiro<br>20267-000 - RJ</td><td>(21) 99887-6655</td></tr>");

        builder.append("</table></body></html>");

        pnListaClientes.setText(builder.toString());
    }
}
