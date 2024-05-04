package com.upc.demorail.service;

import com.upc.demorail.model.Peru;
import com.upc.demorail.repository.PeruRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeruService {
    final PeruRespository peruRespository;

    public PeruService(PeruRespository peruRespository) {
        this.peruRespository = peruRespository;
    }
    public List<Peru> findAll () {
        return peruRespository.findAll();
    }
    public Peru findById (Long id) {
        return peruRespository.findById(id).orElse(null);
    }
    public Peru add (Peru peru) {
        return peruRespository.save(peru);
    }

}
