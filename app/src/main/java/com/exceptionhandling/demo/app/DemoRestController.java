package com.exceptionhandling.demo.app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoRestController {

    private final HitMeService hmService;

    @GetMapping("/hitme")
    public ResponseEntity<String> hitMe(){
        return new ResponseEntity<String>(hmService.hitMe(), HttpStatus.OK);
    }


}
