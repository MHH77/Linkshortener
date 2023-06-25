package com.mhh.Controller;

import com.mhh.Entity.Link;
import com.mhh.Service.LinkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class LinKControllerTest {
    @Autowired
    private LinkService linkService;

    @Test
    void insert() {
        Link link = new Link();
        link.setUrl("test.com");
        linkService.save_Link(link);
    }

    @Test
    void findByUrl() {
        System.out.println(linkService.findByUrl("test.com"));
    }
}