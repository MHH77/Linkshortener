package com.mhh.Controller;

import com.mhh.Entity.Link;
import com.mhh.Service.LinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class LinKController {
    @Autowired
    private LinkService linkService;
    public void insert(Link link) {
        linkService.save_Link(link);
        log.info("insert Method At linkService called.");
    }
}
