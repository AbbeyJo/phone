package com.phone.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.phone.vo.ResponseVo;

@RestController
public class UploadController {
	/**
	 * http://localhost:8001/phone/uploadImg
	 * @param file
	 * @return
	 */
	@RequestMapping("/uploadImg")
	public ResponseVo uploadImg(@RequestParam("file") MultipartFile file) {
		
		FileOutputStream out = null;
        try {
        	
        	byte[] bytes = file.getBytes();
            String path = "F:\\imgs\\"+file.getOriginalFilename();
            File newFile = new File(path);
            out = new FileOutputStream(newFile);
            out.write(bytes);
            out.flush();
            return ResponseVo.OK(path,200, "上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
		return null;
	}

}
