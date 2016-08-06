package spitter.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpitterRepositoryBean implements SpitterRepository {
	
	private List<Spitter> repository = new ArrayList<Spitter>();

	public Spitter findSpitterByUsername(String userName) {
		for (Spitter spitter : repository){
			if(spitter.getUsername().equals(userName)){
				return spitter;
			}
		}
		return null;
	}

	public Spitter save(Spitter spitterToSave) {
		spitterToSave.setId(25l);
		repository.add(spitterToSave);
		return spitterToSave;
	}
	
	
	
}
