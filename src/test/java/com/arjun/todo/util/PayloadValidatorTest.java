package com.arjun.todo.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arjun.todo.model.ToDo;

public class PayloadValidatorTest {

	@Test
	public void validatePayload() {
		ToDo todo = new ToDo(1, "Sample ToDo 1", true);
		assertEquals(false, PayloadValidator.validateCreatePayload(todo));
	}
	
	@Test
	public void validateInvalidPayload() {
		ToDo todo = new ToDo(0, "Sample ToDo 1", true);
		assertEquals(true, PayloadValidator.validateCreatePayload(todo));
	}

}
