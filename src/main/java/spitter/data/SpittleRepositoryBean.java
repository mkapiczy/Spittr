package spitter.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpittleRepositoryBean implements SpittleRepository {

	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittleList = new ArrayList<Spittle>();
		Spittle spittle = new Spittle("Hey I'm first Spittle", new Date(), 20.58, 41.43);
		
		spittleList.add(spittle);
		return spittleList;
	}

}
