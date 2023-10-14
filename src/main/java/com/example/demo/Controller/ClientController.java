package com.example.demo.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Book;
import com.example.demo.Entity.Client;
import com.example.demo.Repository.ClientRepository;

import java.util.Arrays;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientRepository _clientRepository;
    public ClientController(ClientRepository clientRepository) {
        _clientRepository = clientRepository;
    }
    @GetMapping
    public Iterable<Client> getAllClients() {
        return _clientRepository.findAll();
    }
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return _clientRepository.findById(id).get();
    }
    @DeleteMapping
    public void deleteClientById(@RequestParam int id) {
        _clientRepository.deleteAllByIdInBatch(Arrays.asList(id));
    }
    @PutMapping
    public void updateBook(@RequestBody Client client) {
        Client oldClient = _clientRepository.getById(client.id);
        oldClient.setName(client.name);
        oldClient.setLogin(client.login);
        oldClient.setEmail(client.email);
        oldClient.setPassword(client.password);

        _clientRepository.saveAndFlush(oldClient);
    }
    @PostMapping
    public void createBook(@RequestBody Client client) {
        _clientRepository.saveAndFlush(client);
    }
}
