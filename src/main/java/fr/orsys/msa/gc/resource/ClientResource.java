package fr.orsys.msa.gc.resource;

import fr.orsys.msa.gc.data.ClientRepository;
import fr.orsys.msa.gc.model.Client;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientResource {

    final ClientRepository clientRepository;

    @GetMapping
    public List<Client> getClients(){
//        Client client = new Client();
//        client.setFirstname("Cyril");
//        return Arrays.asList(client);

        return clientRepository.findAll();
    }
}
