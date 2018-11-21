package com.catchzeng.refactoringdemos;

import android.support.test.runner.AndroidJUnit4;

import com.catchzeng.refactoringdemos.r2_long_method.LongMethod;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class LongMethodTest {
    @Test
    public void process() {
        LongMethod longMethod = new LongMethod();

        String[] words = new String[]{"ekam", "kcolb"};
        assertTrue(longMethod.isReverseMakeblock(words));

        String[] words2 = new String[]{"make", "block"};
        assertFalse(longMethod.isReverseMakeblock(words2));

        String[] words3 = new String[]{"ekam"};
        assertFalse(longMethod.isReverseMakeblock(words3));

        String[] words4 = new String[]{"ekam", "kcolb", "kcolb"};
        assertFalse(longMethod.isReverseMakeblock(words4));
    }
}