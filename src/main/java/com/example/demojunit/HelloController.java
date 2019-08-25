package com.example.demojunit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    PartyRepository partyRepository;

    @RequestMapping(value = "v1/sayHello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @RequestMapping(value = "v1/sayHelloREST", method = RequestMethod.GET)
    public ResponseEntity<HelloResponse> sayHelloObject() {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setGreeting("Sat Sri Akal!");
        helloResponse.setCounter(2);

        ResponseEntity<HelloResponse> helloResponseResponseEntity = new ResponseEntity<>(helloResponse, HttpStatus.OK);

        return helloResponseResponseEntity;

//        return new ResponseEntity<>(helloResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "v1/sayHelloRESTSaveToMongo", method = RequestMethod.GET)
    public ResponseEntity<SaveMongoResponse> sayHelloObjectSaveToMongo() {

        Party party = new Party();
        party.setFirstName("Dale");
        party.setLastName("Saini");
        party.setPartyId("1");




        Party party1 = null;


        partyRepository.save(party);

        party1 = partyRepository.findOneById(party.getId());

        SaveMongoResponse saveMongoResponse = new SaveMongoResponse();

        saveMongoResponse.setId(party1.getId());
        saveMongoResponse.setPartyId(party1.getPartyId());




        ResponseEntity<SaveMongoResponse> helloResponseResponseEntity = new ResponseEntity<>(saveMongoResponse, HttpStatus.OK);

        return helloResponseResponseEntity;

//        return new ResponseEntity<>(helloResponse, HttpStatus.OK);
    }


}