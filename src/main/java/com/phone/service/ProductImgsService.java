package com.phone.service;

import com.phone.model.Images;

public interface ProductImgsService {

	public int addProImgs(Images images);

	public int updateProImgs(Images images);

	public int delProImgs(Integer[] ids);
}
