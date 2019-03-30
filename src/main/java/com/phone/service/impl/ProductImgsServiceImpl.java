package com.phone.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.dao.ProductImgsDao;
import com.phone.model.Images;
import com.phone.service.ProductImgsService;

@Service
public class ProductImgsServiceImpl implements ProductImgsService {

	@Autowired
	private ProductImgsDao productImgsDao;
	
	@Override
	public int addProImgs(Images images) {
		// TODO Auto-generated method stub
		return productImgsDao.insertSelective(images);
	}

	@Override
	public int updateProImgs(Images images) {
		// TODO Auto-generated method stub
		return productImgsDao.updateByPrimaryKeySelective(images);
	}

	@Override
	public int delProImgs(Integer[] ids) {
		// TODO Auto-generated method stub
		String join = StringUtils.join(ids,",");
		return productImgsDao.deleteByIds(join);
	}

}
