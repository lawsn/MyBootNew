package com.doo.myboot.demomysql;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO INPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
