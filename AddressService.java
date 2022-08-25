package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Address;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface AddressService {
    public Integer saveAddress(Address address);

    public List<Address> getAllAddress();

    public Address getAddressById(Integer aid);

    public void deleteAddress(Integer aid);
}