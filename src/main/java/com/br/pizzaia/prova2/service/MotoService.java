package com.br.pizzaia.prova2.service;

import com.br.pizzaia.prova2.model.Moto;
import com.br.pizzaia.prova2.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {
    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> findAll() {
        return motoRepository.findAll();
    }

    public Moto getMotoByRenavam(Long renavam) {
        return motoRepository.findById(renavam).get();
    }

    public void saveOrUpdateMotorcicly(Moto moto) {
        motoRepository.save(moto);
    }

    public void deleteMoto(Long renavam) {
        motoRepository.deleteById(renavam);
    }
}
