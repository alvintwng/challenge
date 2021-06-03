package problem2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class dateTest {
	//@Disabled 
	@Test
	void contextLoads() {
		
	    String text = "26/4/2021 13:00"; 					// text in dTF pattern
	    DateTimeFormatter dTF;  						// Declare dateTime formatter
	    dTF = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
	    LocalDateTime parsedDate = LocalDateTime.parse(text, dTF);
	    System.out.println("parsedDate:" + parsedDate);		// parsedDate:2021-04-26T13:00
	    
	    DateTimeFormatter tF = DateTimeFormatter.ofPattern("hh:mm a");	// Declare Time format
	    assertEquals( parsedDate.format(tF), "01:00 pm");
	    
	    parsedDate = parsedDate.plusMinutes(240);
	    assertEquals( parsedDate.format(tF), "05:00 pm");

	}

}
