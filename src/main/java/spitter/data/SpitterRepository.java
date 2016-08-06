package spitter.data;

import java.util.ArrayList;
import java.util.List;

public interface SpitterRepository {
	
	public Spitter findSpitterByUsername(String userName);
	
	public Spitter save(Spitter spitterToSave);
}
