package com.eric.mp.mapper;

import com.eric.mp.pojo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2022-03-15 18:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    public static final Logger LOGGER = LogManager.getLogger();

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Test
    public void findSelectList()
    {
        List<User> userList = userMapper.selectList(null);
        for (User user : userList)
        {
            LOGGER.info(user);
        }
    }
}
