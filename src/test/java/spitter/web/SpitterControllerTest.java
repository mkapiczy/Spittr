package spitter.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SpitterControllerTest {
	
	@Test
	public void shouldShowRegistration() throws Exception{
		SpitterController controller = new SpitterController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
	}
}