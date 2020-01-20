package com.dz.services;

import com.dz.models.Cliente;
import com.dz.repositories.ClienteRepo;
import com.dz.repositories.ICrud;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ICrud<Cliente> {

    private ClienteRepo repo;

    @Override
    public List<Cliente> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Cliente getById(Integer id) throws Exception {
        return repo.findById(id).get();
    }

    @Override
    public void save(Cliente obj) {
        repo.save(obj);
    }

    @Override
    public void update(Cliente obj, Integer id) {
        obj.setId(id);
        repo.save(obj);
    }

    @Override
    public void deleteById(Cliente obj, Integer id) {
        repo.deleteById(id);
    }
}
