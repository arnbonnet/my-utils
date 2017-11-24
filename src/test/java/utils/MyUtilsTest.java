package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;

public class MyUtilsTest {

	@Test
	public void sumTest() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum = MyUtils.sum(list);
		
		Assert.assertEquals(15, sum);
		Assert.assertNotEquals(14, sum);
	}
	
	@Test
	public void sumNullListTest() {
		List<Integer> list = null;
		int sum = MyUtils.sum(list);
		
		Assert.assertThat(sum, Is.is(0));
	}
	
	@Test
	public void sumEmptyListTest() {
		List<Integer> list = new ArrayList<>();
		int sum = MyUtils.sum(list);
		
		Assert.assertThat(sum, Is.is(0));
	}
	
	@Test
	public void sumNullIntInListTest() {
		List<Integer> list = Arrays.asList(1,null,3,4,5);
		int sum = MyUtils.sum(list);
		
		Assert.assertEquals(13, sum);
		
	}
	
	@Test
	public void emptyToNullTest() {
		String s1 = "";
		String s2 = "Hello world";
		
		Assert.assertNull(MyUtils.emptyToNull(s1));
		Assert.assertEquals("Hello world", MyUtils.emptyToNull(s2));
		
	}
	
	@Test
	public void filterEvenNumbersTest() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> evenList = MyUtils.filterEvenNumbers(list);

		List<Integer> expectedList = Arrays.asList(2,4);
		
		
		Assert.assertThat(evenList, IsEqual.equalTo(expectedList));
		
	}

	@Test
	public void filterEvenNumbers_NullListTest() {
		List<Integer> evenList = MyUtils.filterEvenNumbers(null);

		List<Integer> expectedList = new ArrayList<>();
		
		
		Assert.assertThat(evenList, IsEqual.equalTo(expectedList));
		
	}

	@Test
	public void filterEvenNumbers_EmptyListTest() {
		List<Integer> evenList = MyUtils.filterEvenNumbers(new ArrayList<>());

		List<Integer> expectedList = new ArrayList<>();
		
		
		Assert.assertThat(evenList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void filterEvenNumbers_EmptyEvenListTest() {
		List<Integer> evenList = MyUtils.filterEvenNumbers(Arrays.asList(1,3,5));

		List<Integer> expectedList = new ArrayList<>();
		
		
		Assert.assertThat(evenList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void filterEvenNumbers_NullValueInListTest() {
		List<Integer> evenList = MyUtils.filterEvenNumbers(Arrays.asList(1,null,3,4,5));

		List<Integer> expectedList = Arrays.asList(4);
		
		
		Assert.assertThat(evenList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void transformSquarePlusPointFiveTest() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Float> transformedList = MyUtils.transformSquarePlusPointFive(list);
		
		List<Float> expectedList = Arrays.asList(1.5F,4.5F,9.5F,16.5F,25.5F);
		
		Assert.assertThat(transformedList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void transformSquarePlusPointFive_EmptyListTest() {
		List<Integer> list = Arrays.asList();
		List<Float> transformedList = MyUtils.transformSquarePlusPointFive(list);
		
		List<Float> expectedList = Arrays.asList();
		
		Assert.assertThat(transformedList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void transformSquarePlusPointFive_NullListTest() {
		List<Integer> list = null;
		List<Float> transformedList = MyUtils.transformSquarePlusPointFive(list);
		
		List<Float> expectedList = Arrays.asList();
		
		Assert.assertThat(transformedList, IsEqual.equalTo(expectedList));
	}
	
	@Test
	public void transformSquarePlusPointFive_NullValueInListTest() {
		List<Integer> list = Arrays.asList(1,null,3,null,5);
		List<Float> transformedList = MyUtils.transformSquarePlusPointFive(list);
		
		List<Float> expectedList = Arrays.asList(1.5F,9.5F,25.5F);
		
		Assert.assertThat(transformedList, IsEqual.equalTo(expectedList));
	}
	
	
}
