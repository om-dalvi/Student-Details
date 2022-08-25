package com.javaeplanet.project.controller;

import com.javaeplanet.project.entity.Address;
import com.javaeplanet.project.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Component
@ResponseBody
@RestController
@RequestMapping("/addressDetails")
public class AddressController {

    @Autowired(required = false)
    private AddressService service;

    @PostMapping("/saveAddress")
    public ResponseEntity<String> saveAddress( @RequestBody Address address){
        Integer aid = service.saveAddress(address);
        return  new ResponseEntity<String>("Address with '"+aid+"' has been saved", HttpStatus.OK);
    }

    @GetMapping("/addressList")
    public ResponseEntity<List<Address>> getAllAddressDetails(){
        List<Address> list = service.getAllAddress();
        return new ResponseEntity<List<Address>>(list,HttpStatus.OK);
    }

    @GetMapping("/getAddressById/{aid}")
    public ResponseEntity<Address> getAddressById( @PathVariable("aid")  Integer aid){
        Address std = service.getAddressById(aid);
        return new ResponseEntity<Address>(std,HttpStatus.OK);
    }
    @PutMapping("/updateAddress/{aid}")
    public ResponseEntity<String> updateAddress( @PathVariable("aid") Integer aid,  @RequestBody Address address){
        Address stdFromDb = service.getAddressById(aid);
        stdFromDb.setCity(address.getCity());
        stdFromDb.setPin_code(address.getPin_code());
        Integer id = service.saveAddress(stdFromDb);
        return new ResponseEntity<String>("Address with '"+id+"' has been updated",HttpStatus.OK);

    }
    @DeleteMapping("deleteAddress/{aid}")
    public ResponseEntity<String> deleteAddress(@PathVariable("aid") Integer aid){
        service.deleteAddress(aid);
        return new ResponseEntity<String>("Address with '"+aid+"' has been deleted",HttpStatus.OK);
    }
}
