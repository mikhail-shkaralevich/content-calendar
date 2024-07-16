package com.mikhail.content_calendar;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.mikhail.content_calendar.config.ContentCalendarProperties;
import com.mikhail.content_calendar.model.Content;
import com.mikhail.content_calendar.model.Status;
import com.mikhail.content_calendar.model.Type;
import com.mikhail.content_calendar.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner (ContentRepository repository) {
		return args -> {
			// insert some data into the db.
			Content content = new Content(null,
					"New content",
					"New content",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}*/

}
