package com.infinium.rasheen.rainbowopapi.controller;

import com.infinium.rasheen.rainbowopapi.Repository.OperatorListRepository;
import com.infinium.rasheen.rainbowopapi.domain.OperatorList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rainbowsix")
public class OperatorController {

    private OperatorListRepository operatorListRepository;

    public OperatorController(OperatorListRepository operatorListRepository){
        this.operatorListRepository = operatorListRepository;
    }

    @GetMapping("/all")
    public List<OperatorList> getAll(){
        List<OperatorList> operatorLists = this.operatorListRepository.findAll();

        return operatorLists;
    }


    @GetMapping("ops/{type}")
        public List<OperatorList> getAttack(@PathVariable("type") String type){
        List<OperatorList> attackList = this.operatorListRepository.findByTypeLike(type);
        return attackList;
    }


}
