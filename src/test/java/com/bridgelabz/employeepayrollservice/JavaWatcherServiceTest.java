package com.bridgelabz.employeepayrollservice;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class JavaWatcherServiceTest {
	public static final String HOME = System.getProperty("user.home");
	public static final String PLAY_WITH_FILES = "\\Dev\\eclipse-workspace\\EmployeePayrollService\\TempFiles";
	
	@Test
	public void givenDirectoryWhenWatchedListAllActivities() throws IOException {
		Path dir=Paths.get(HOME+PLAY_WITH_FILES);
		Files.list(dir).filter(Files::isRegularFile).forEach(System.out::println);
		new JavaWatcherService(dir).processEvents();
	}

}
