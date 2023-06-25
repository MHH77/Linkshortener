package com.mhh.Service;

import com.mhh.Entity.Link;
import com.mhh.Repository.LinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {
    @Autowired
    private LinkRepo linkRepo;

    public Link save_Link(Link link) {
        return linkRepo.save(link);
    }

}
