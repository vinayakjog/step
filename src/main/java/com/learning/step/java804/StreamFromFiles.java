package com.learning.step.java804;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


////////////Needs some work to be done .
public class StreamFromFiles {
	public static void main(String[] args) {
	    Path path = Paths.get("./StreamFromFiles.java");
	    try (Stream<String> lines = Files.lines(path)) {
	      lines.forEach(System.out::println);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}
