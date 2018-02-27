package com.example.kodillaspring;


import com.example.spring.shape.Circle;
import com.example.spring.shape.Shape;
import com.example.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTests {
	@Test
	public void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example");
		Shape shape = context.getBean(Circle.class);
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This circle which implement Shape", name);
	}

	@Test
	public void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example");
		Shape shape = context.getBean(Triangle.class);
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This triangle which implement Shape", name);
	}
}