package com.example.training;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

//Controller for return content type
@RestController
public class DownloadFileController {

    @GetMapping("/download-file")
    public ResponseEntity<InputStreamResource> downloadFile() {

        ByteArrayInputStream byteInputStream = new ByteArrayInputStream("Data input".getBytes());
        InputStreamResource inputStreamResource = new InputStreamResource(byteInputStream);

        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=\"data.txt\"")
                .contentType(MediaType.TEXT_PLAIN)
                .body(inputStreamResource);
    }
}
