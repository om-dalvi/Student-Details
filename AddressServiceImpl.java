package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Address;
import com.javaeplanet.project.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository repository;

    @Override
    public Integer saveAddress(Address address) {
        return repository.save(address).getAid();
    }

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) repository.findAll();
    }

    @Override
    public Address getAddressById(Integer aid) {
        return repository.findById(aid).get();
    }

    @Override
    public void deleteAddress(Integer aid) {
        repository.deleteById(aid);
    }

    //@RequestMapping
    public void setrepository(AddressRepository repository) {
        this.repository = repository;
    }
}


