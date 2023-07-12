package fr.orsys.msa.gc.resource;

import fr.orsys.msa.gc.data.ClientRepository;
import fr.orsys.msa.gc.model.Client;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ClientResource implements IClientResource{

    final ClientRepository clientRepository;


    public List<Client> getClients(){
//        Client client = new Client();
//        client.setFirstname("Cyril");
//        return Arrays.asList(client);
        log.trace("Recherche des clients");
        List<Client> clients = clientRepository.findAll();
        log.debug("Clients trouvés : {} ", clients.size());
        return clients;

    }
}
