package com.phone.service.impl;

import com.phone.dao.ReceiveAddressDao;
import com.phone.model.ReceiveAddress;
import com.phone.service.ReceiveAddressService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiveAddressServiceImpl implements ReceiveAddressService {

    @Autowired
    private ReceiveAddressDao addressDao;

    @Override
    public int addAddress(ReceiveAddress address) {
        return addressDao.insertSelective(address);
    }

    @Override
    public int updateAddress(ReceiveAddress address) {
        return addressDao.updateByPrimaryKeySelective(address);
    }

    @Override
    public List<ReceiveAddress> getAllAddress(Integer userId) {
        ReceiveAddress address = new ReceiveAddress();
        address.setUserId(userId);
        return addressDao.select(address);
    }

    @Override
    public int delAddress(Integer... addressIds) {

        String join = StringUtils.join(addressIds, ',');
        return addressDao.deleteByIds(join);
    }
}
