package com.debbox.debvendas.services;


import com.debbox.debvendas.dto.SaleDTO;
import com.debbox.debvendas.entities.Sale;
import com.debbox.debvendas.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;

    public Page<SaleDTO> findAll(Pageable pageable){
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));

    }
}
