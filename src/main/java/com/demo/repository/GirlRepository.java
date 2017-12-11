package com.demo.repository;

import com.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wal
 * @date 2017/12/8
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{

    public List<Girl> findByAge(Integer age);
}
