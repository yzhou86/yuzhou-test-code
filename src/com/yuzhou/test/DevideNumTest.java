package com.yuzhou.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DevideNumTest {

	
	@Test
	public void test() {
		assert(DevideNum.devide(1).size()==0);
		
		Assert.assertArrayEquals(new Integer[]{2}, DevideNum.devide(2).toArray(new Integer[DevideNum.devide(2).size()]));
		Assert.assertArrayEquals(new Integer[]{2,2,3}, DevideNum.devide(12).toArray(new Integer[DevideNum.devide(12).size()]));
		Assert.assertArrayEquals(new Integer[]{233}, DevideNum.devide(233).toArray(new Integer[DevideNum.devide(233).size()]));
		Assert.assertArrayEquals(new Integer[]{2,2,2,2}, DevideNum.devide(16).toArray(new Integer[DevideNum.devide(16).size()]));
		Assert.assertArrayEquals(new Integer[]{2,2,2,2,2,2,2,2}, DevideNum.devide(256).toArray(new Integer[DevideNum.devide(256).size()]));

	}

}
