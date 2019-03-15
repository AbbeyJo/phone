package com.phone.service;

import com.phone.model.ReceiveAddress;

import java.util.List;

public interface ReceiveAddressService {

    int addAddress(ReceiveAddress address);

    int updateAddress(ReceiveAddress address);

    List<ReceiveAddress> getAllAddress(Integer userId);

    int delAddress(Integer... addressIds);
}
