package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrdemItem;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrdemItem, Integer> {

}
