package com.aus.Aus.controllers;

import com.aus.Aus.httpentities.AddingRequest;
import com.aus.Aus.httpentities.Address;
import com.aus.Aus.httpentities.Location;
import com.aus.Aus.repo.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class BusinessApi {

    @Autowired
    private BusinessRepo repo;

    @GetMapping("/showBusiness")
    public ResponseEntity<AddingRequest> showBusiness(){
        AddingRequest addingRequest = new AddingRequest();

        addingRequest.setName("Teravle");
        addingRequest.setPhone(+438940233);

        Address address = new Address();
        address.setLine1("Galle road");
        address.setLine2("Colombo 2");

        addingRequest.setAddress(address);

        Location location = new Location();
        location.setLat(1.23434F);
        location.setLon(2.34343F);

        addingRequest.setLocation(location);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(addingRequest);

    }

    @PostMapping("/business")
    public ResponseEntity<AddingRequest>saveBusiness(@RequestBody AddingRequest addingRequest){
        addingRequest=this.repo.save(addingRequest);
        return ResponseEntity.ok().body(addingRequest);
    }

    @GetMapping("/show")
    public ResponseEntity<List<AddingRequest>>getBusiness(){
        List<AddingRequest> all=this.repo.findAll();
        return ResponseEntity.ok().body(all);
    }

}
