package com.berna.workshopspringbootmongodb.repository;

import com.berna.workshopspringbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends MongoRepository<User, String> {
    // nos < > da linha 9 fica o tipo do repositorio (user) e o tipo do ID dele (string)

}
