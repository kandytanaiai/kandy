package com.kandytan.util;

import org.junit.Assert;
import org.junit.Test;

public class PagerTest {

    @Test
    public void testPager() {
        Pager<Object> pager = new Pager<Object>(0, 2);

        Assert.assertTrue(2==pager.getNextPage());
    }

}
