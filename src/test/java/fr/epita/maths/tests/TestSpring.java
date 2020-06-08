package fr.epita.maths.tests;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")

public class TestSpring {

	@Inject
	@Named("firstQuery")
	private String myQuery;

	@Inject
	private DataSource ds;

	@Test
	public void idleTest() {

		System.out.println(myQuery);

	}

	@Test
	public void testConnection() {
		try {
			Connection c = ds.getConnection();
			Assert.assertTrue("PUBLIC".equals(c.getSchema()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
