package com.example.demo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.springframework.stereotype.Repository;


@ApplicationScoped
@Repository

public class EntityDataRepository implements PanacheRepository<EntityData> {
    public void save(EntityData data){
        return;
    }
}
