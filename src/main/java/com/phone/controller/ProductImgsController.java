package com.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phone.model.Images;
import com.phone.service.ProductImgsService;

@RestController
public class ProductImgsController {
	
	@Autowired
	private ProductImgsService productImgsService;

	/**
	 * URL http://localhost:8001/phone/addProImgs
	 * @param images
	 * @return
	 */
	@RequestMapping("/addProImgs")
	public int addProImgs(@RequestBody Images images) {
		
		return productImgsService.addProImgs(images);
	}
	
	/**
	 * URL http://localhost:8001/phone/updateProImgs
	 * @param images
	 * @return
	 */
	@RequestMapping("/updateProImgs")
	public int updateProImgs(@RequestBody Images images) {
		
		return productImgsService.updateProImgs(images);
	}
	
	/**
	 * URL http://localhost:8001/phone/delProImgs
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delProImgs")
	public int delProImgs(@RequestParam("ids") Integer... ids) {
		
		return productImgsService.delProImgs(ids);
	}
}
