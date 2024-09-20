package quantumleap.controller;

import quantumleap.banco.ClienteDAO;
import quantumleap.dominio.Cliente;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("clientes")
public class ClienteController {





    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornaLivro(){
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.listarClientes();
        clienteDAO.fecharConexao();
        return Response.status(Response.Status.OK).entity(clientes).build();
    }


    @POST
    public Response salvarCliente(Cliente cliente){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.adicionarCliente(cliente);
        clienteDAO.fecharConexao();
        return Response.status(Response.Status.CREATED).build();
    }
}
