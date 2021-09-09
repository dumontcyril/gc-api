package fr.orsys.msa.gc.api.resource;


import fr.orsys.msa.gc.api.model.Client;
import fr.orsys.msa.gc.api.repository.ClientRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientResource {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    @ApiOperation("Retourne la liste des clients")
        public List<Client> getClients(){
//        Client client = new Client();
//        client.setFirstname("Cyril");
//        client.setLastname("Dumont");
//        return Arrays.asList(client);
        return clientRepository.findAll();
    }
}
