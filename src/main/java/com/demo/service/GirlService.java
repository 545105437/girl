package com.demo.service;

import com.demo.domain.Girl;
import com.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wal
 * @date 2017/12/8
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 添加两个对象
     */
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBB");
        girlB.setAge(19);
        girlRepository.save(girlB);

    }
}
