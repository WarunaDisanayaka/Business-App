package com.aus.Aus.controllers;

import com.aus.Aus.httpentities.AddingRequest;
import com.aus.Aus.httpentities.Address;
import com.aus.Aus.httpentities.Location;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class BussinessController {

    @RequestMapping(method = RequestMethod.POST,path = "/add")
    public ResponseEntity<String> AddBusiness(@RequestBody AddingRequest addingRequest)
    {
       return  ResponseEntity.ok("" +
               "Busniess Name: "+addingRequest.getName()+"\n"+
               "Phone :"+addingRequest.getPhone()+"\n"+
               "Address :"+addingRequest.getAddress().getLine1()+""+addingRequest.getAddress().getLine2()+""+addingRequest.getAddress().getState()+"\n"+
               "location :"+addingRequest.getLocation().getLat()+" "+addingRequest.getLocation().getLon());
    }

//    @GetMapping("/show")
//    public ResponseEntity<AddingRequest> showBusiness(){
//        AddingRequest addingRequest = new AddingRequest();
//
//        addingRequest.setName("Teravle");
//        addingRequest.setPhone(+438940233);
//
//        Address address = new Address();
//        address.setLine1("Galle road");
//        address.setLine2("Colombo 2");
//
//        addingRequest.setAddress(address);
//
//        Location location = new Location();
//        location.setLat(1.23434F);
//        location.setLon(2.34343F);
//
//        addingRequest.setLocation(location);
//
//        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(addingRequest);
//
//    }
}
