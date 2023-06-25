package com.mhh.Repository;

import com.mhh.Entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepo extends JpaRepository<Link, Long> {
    List<Link> findByUrl(String url);
}
