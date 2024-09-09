package com.exceptionhandling.demo.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HitMeService {

    public String hitMe(){
        log.debug("HitMe called!!");
        int hitMeCount = 10/0;
        return "HitMe";
    }
}
