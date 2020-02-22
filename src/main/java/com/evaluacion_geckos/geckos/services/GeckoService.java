package com.evaluacion_geckos.geckos.services;

import com.evaluacion_geckos.geckos.models.Gecko;
import com.evaluacion_geckos.geckos.repository.CRUD;
import com.evaluacion_geckos.geckos.repository.GeckoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeckoService extends CRUD<Gecko, GeckoRepository> {

    public GeckoService(GeckoRepository repository) {
        super(repository);
    }

    @Override
    public List<Gecko> list() {
        return repository.findAll();
    }

    @Override
    public Gecko get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Gecko o) {
        repository.save(o);
    }

    @Override
    public void update(Gecko o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }






















}
