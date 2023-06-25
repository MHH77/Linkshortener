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

    public Link insert(Link link) {
        return linkService.save_Link(link);
    }

    public void finByurl(String Url) {
        linkService.findByUrl(Url);
    }


}
