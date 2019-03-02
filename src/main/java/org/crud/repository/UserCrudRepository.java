package org.crud.repository;

import java.io.Serializable;

import org.crud.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Serializable> {
    
}
