package com.kaiburr.Kaiburr.repository;

import com.kaiburr.Kaiburr.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server, String> {
    List<Server> findByName(String name);
}
