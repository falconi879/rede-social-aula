package com.andre.RedeSocial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andre.RedeSocial.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
