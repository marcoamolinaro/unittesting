package com.scm.unittesting.unittesting.spike;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {
	
	@Test
	public void learning() {
		String responseForService = "[\r\n"
				+ "{\"id\":100001, \"name\": \"Pencil\", \"quantity\": 5},"
				+ "{\"id\":100002, \"name\": \"Pen\", \"quantity\": 15},"
				+ "{\"id\":100003, \"name\": \"Eraser\", \"quantity\": 1}]";
		
		DocumentContext context = JsonPath.parse(responseForService);
		
		int length = context.read("$.length()");
		
		assertThat(length).isEqualTo(3);
		
		List<Integer> ids = context.read("$..id");
		assertThat(ids).containsExactly(100001,100002,100003);
		
		System.out.println(context.read("$.[1]").toString());
		System.out.println(context.read("$.[0:1]").toString());
		System.out.println(context.read("$.[?(@.name=='Eraser')]").toString());
		System.out.println(context.read("$.[?(@.quantity==5)]").toString());
	}

}
