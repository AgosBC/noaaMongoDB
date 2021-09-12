package ar.com.ada.mongo.noaa.repos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.mongo.noaa.entities.Boya;

@Repository
public interface BoyaRepository extends MongoRepository<Boya, ObjectId > {

   
    
}
