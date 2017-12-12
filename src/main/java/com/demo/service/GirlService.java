package com.demo.service;

import com.demo.domain.Girl;
import com.demo.enums.ResultEnum;
import com.demo.exception.GirlException;
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

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        System.out.println(girl);
        Integer age = girl.getAge();
        if (age < 10) {
            //返回“你还在上小学”
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16) {
            //返回“你可能在上初中”
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

        //如果>16岁，价钱
        //....
    }
}
