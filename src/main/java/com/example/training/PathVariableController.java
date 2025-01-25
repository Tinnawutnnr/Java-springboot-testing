package com.example.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {


    @GetMapping("/posts/{id}/comments/{commentsId}")
    public String getPostId(
            @PathVariable("id") String postId,
            @PathVariable("commentsId") String inputCommentsId) {

        return String.format("Post ID: %s Comments ID: %s", postId, inputCommentsId);
    }
}
