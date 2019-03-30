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

    /**
     * 天机收货地址
     * http://localhost:8001/phone/ra/addAddress
     * @param address
     * @return
     */
    @RequestMapping("/addAddress")
    public int addAddress(@RequestBody ReceiveAddress address){
        return addressService.addAddress(address);
    }

    /**
     * 更新收获地址
     * http://localhost:8001/phone/ra/updateAddress
     * @param address
     * @return
     */
    @RequestMapping("/updateAddress")
    public int updateAddress(@RequestBody ReceiveAddress address){
        return addressService.updateAddress(address);
    }

    /**
     * 获取收货地址
     * http://localhost:8001/phone/ra/getAllAddress
     * @param userId
     * @return
     */
    @RequestMapping("/getAllAddress")
    public List<ReceiveAddress> getAllAddress(@RequestParam Integer userId){
        return addressService.getAllAddress(userId);
    }

    /**
     * 删除收货地址
     * http://localhost:8001/phone/ra/delAddress
     * @param addressIds
     * @return
     */
    @RequestMapping("/delAddress")
    public int delAddress(@RequestParam Integer... addressIds){

        return addressService.delAddress(addressIds);
    }
}
