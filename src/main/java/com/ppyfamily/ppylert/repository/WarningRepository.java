package com.ppyfamily.ppylert.repository;

import com.ppyfamily.ppylert.entity.WarningEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarningRepository extends MongoRepository<WarningEntity, String> {

  List<WarningEntity> findAll();
}
