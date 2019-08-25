package com.example.demojunit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PartyRepository extends MongoRepository<Party, String> {
    Party findOneById(String id);

}