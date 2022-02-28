package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.person.domain.Tarnished;

@Service
public class TarnishedService {

	private List<Tarnished> fools = new ArrayList<>();

	// CREATE
	public Tarnished createTarnished(Tarnished t) {
		this.fools.add(t);
		Tarnished created = this.fools.get(this.fools.size() - 1);
		return created;
	}

	// READ
	public List<Tarnished> getAllFools() {
		return this.fools;
	}

	public Tarnished getTarnished(Integer id) {
		return this.fools.get(id);
	}

	// UPDATE
	public Tarnished replaceTarnished(Integer id, Tarnished newTarnished) {
		Tarnished body = this.fools.set(id, newTarnished);
		return body;
	}

	// DELETE
	public void removePerson(@PathVariable Integer id) {
		this.fools.remove(id.intValue());
	}
}
