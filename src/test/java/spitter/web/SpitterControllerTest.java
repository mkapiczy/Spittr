package spitter.web;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spitter.data.Spitter;
import spitter.data.SpitterRepository;

public class SpitterControllerTest {

	@Test
	public void shouldShowRegistration() throws Exception {
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
	}

	@Test
	public void shouldProcessRegistration() throws Exception {
		SpitterRepository mockRepository = mock(SpitterRepository.class);

		Spitter unsaved = new Spitter("jbauer", "24hours", "Jacki", "Bauer");
		Spitter saved = new Spitter(25l, "jbauer", "24hours", "Jacki", "Bauer");

		when(mockRepository.save(unsaved)).thenReturn(saved);

		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc =  MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(post("/spitter/register").param("firstName", "Jacki").param("lastName", "Bauer")
				.param("username", "jbauer").param("password", "24hours")).andExpect(redirectedUrl("/spitter/jbauer"));
		
		verify(mockRepository, atLeastOnce()).save(unsaved);
	}
}