package com.scm.unittesting.unittesting.spike;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HamcrestMatchersTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void learning() {
		List<Integer> numbers = Arrays.asList(12,15,25);
		
		assertThat(numbers, hasSize(3));
		assertThat(numbers, hasItems(12,25));
		assertThat(numbers, everyItem(greaterThan(10)));
		assertThat(numbers, everyItem(lessThan(200)));
		
		assertThat("", isEmptyString());
		assertThat("ABCDE", containsString("BC"));
		assertThat("ABCDE", endsWith("DE"));
	}
}
