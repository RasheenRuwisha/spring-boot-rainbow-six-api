package com.infinium.rasheen.rainbowopapi.Repository;

import com.infinium.rasheen.rainbowopapi.domain.OperatorList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperatorListRepository extends MongoRepository<OperatorList,String> {


    List<OperatorList> findByTypeLike(String Type);
}
