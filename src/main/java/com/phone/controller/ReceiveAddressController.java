package com.phone.controller;

import com.phone.model.ReceiveAddress;
import com.phone.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ra")
public class ReceiveAddressController {

    @Autowired
    private ReceiveAddressService addressService;

    @RequestMapping("/addAddress")
    public int addAddress(@RequestBody ReceiveAddress address){
        return addressService.addAddress(address);
    }

    @RequestMapping("/updateAddress")
    public int updateAddress(@RequestBody ReceiveAddress address){
        return addressService.updateAddress(address);
    }

    @RequestMapping("/getAllAddress")
    public List<ReceiveAddress> getAllAddress(@RequestParam Integer userId){
        return addressService.getAllAddress(userId);
    }

    @RequestMapping("/delAddress")
    public int delAddress(@RequestParam Integer... addressIds){

        return addressService.delAddress(addressIds);
    }
}
