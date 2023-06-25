package com.mhh.Service;

import com.mhh.Entity.Link;
import com.mhh.Repository.LinkRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LinkService {
    @Autowired
    private LinkRepo linkRepo;

    public Link save_Link(Link link) {
        log.info("save_Link Method At LinkService called => "+link);
        return linkRepo.save(link);
    }

    public List<Link> findByUrl(String Url){
        log.info("findByUrl Method At LinkService called => "+Url);
        return linkRepo.findByUrl(Url);
    }


}
