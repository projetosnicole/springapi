package com.api.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.biblio.model.CadCds;

public interface CdRepository extends JpaRepository<CadCds, Long>{
    
    CadCds findById(long id);

}
