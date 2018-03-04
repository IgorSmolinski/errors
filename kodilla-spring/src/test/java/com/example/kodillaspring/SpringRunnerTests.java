package com.example.kodillaspring;

import com.example.spring.shape.Shape;
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
		Shape shape = (Shape)context.getBean("circle");
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
		Shape shape = (Shape)context.getBean("triangle");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This triangle which implements Shape", name);
	}

	@Test
	public void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example");
		Shape shape = (Shape)context.getBean("createSquare");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("This is square which implements interface Shape.", name);
	}

	@Test
	public void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example");
		Shape shape = (Shape)context.getBean("choosenShape");
		//When
		String name = shape.getShapeName();
		//Then
		System.out.println("Choosen shape says: " + name);
	}
}
