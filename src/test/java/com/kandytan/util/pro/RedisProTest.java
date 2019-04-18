package com.kandytan.util.pro;

import com.kandytan.test.model.TestVO;
import com.kandytan.util.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class RedisProTest extends TestBase {

    @Test
    public void testGetPro(){
        Assert.assertNotNull(RedisPro.getMaxIdle());
    }

}
