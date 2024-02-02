package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    @Autowired
    private EntityDataRepository entityDataRepository;
    public void save(EntityData data) {
        entityDataRepository.save(data);
    }
}
