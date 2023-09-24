package com.kaiburr.Kaiburr.service;

import com.kaiburr.Kaiburr.model.Server;

import java.util.List;
import java.util.Optional;
//import java.util.*;

public interface ServerService {

    List<Server> findAll();

    Optional<Server> findById(String Id);

    void createOrUpdateServer(Server server);

    void deleteServerById(String Id);

    List<Server> findByName(String name);
}
