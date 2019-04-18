package com.kandytan.util.redis;

import com.kandytan.base.model.BaseUserQueryVO;
import com.kandytan.base.model.BaseUserVO;
import com.kandytan.util.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class RedisUtilsTest extends TestBase {

    @Test
    public void testGetKey() {
        RedisUtils.setKey("test1", "yes1");
        Assert.assertTrue(RedisUtils.getKey("test1").equals("yes1"));
    }

}
