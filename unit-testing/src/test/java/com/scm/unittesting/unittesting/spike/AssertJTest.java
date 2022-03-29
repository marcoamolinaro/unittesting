package com.scm.unittesting.unittesting.spike;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertJTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void learning() {
		List<Integer> numbers = Arrays.asList(12,15,25);
		
		assertThat(numbers)
			.hasSize(3)
			.contains(12,25)
			.allMatch(x -> x > 10)
			.allMatch(x -> x < 100)
			.noneMatch(x -> x < 0);
		
		assertThat("").isEmpty();
		assertThat("ABCDE")
			.contains("BCD")
			.startsWith("ABC")
			.endsWith("DE");
	}
}
