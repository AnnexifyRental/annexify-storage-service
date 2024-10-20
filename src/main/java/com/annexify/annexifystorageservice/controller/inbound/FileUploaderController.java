package com.annexify.annexifystorageservice.controller.inbound;


import com.annexify.annexifystorageservice.service.FileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file-uploader")
public class FileUploaderController {

    @Autowired
    private FileUploaderService fileUploaderService;

    @PostMapping
    public String uploadImage(@RequestParam("image") MultipartFile file) {
        return fileUploaderService.uploadFile(file);
    }

    @GetMapping
    public ResponseEntity<byte[]> getImage(@RequestParam String fileName) {
        return fileUploaderService.getFile(fileName);
    }


}
