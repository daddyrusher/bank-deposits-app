package com.daddyrusher.bankdepositsapp;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.repository.BaseCrudRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ClientServiceTest {

    @Autowired
    private BaseCrudRepository<Client> repository;

    @Test
    public void saveRecord() {
        Client client = new Client();
        client.setName("Maksim");
        client.setShortName("Zanin");
        client.setAddress("test address");
        client.setRulesForm("test rules");

        Client client1 = repository.save(client);
        System.out.println(client1);
    }
}
