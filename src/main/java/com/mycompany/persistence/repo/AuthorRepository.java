/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistence.repo;

import com.mycompany.persistence.model.Author;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gino
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> findByNombre(String nombre);

    Optional<Author> findOne(long id);
}
