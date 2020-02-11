package io.partha.domain;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements ObjectRepository<User> {

	private Map<Long, User> repository;
	

	public UserRepository() {
		this.repository = new HashMap<>();
		User partha = User.builder().active(true).id(1).userName("partha").databaseToUse("database1").build();
		User maitra = User.builder().active(false).id(2).userName("maitra").databaseToUse("database2").build();
		this.repository.put(partha.getId(), partha);
		this.repository.put(maitra.getId(), maitra);
	}

	@Override
	public void store(User user) {
		repository.put(user.getId(), user);
	}

	@Override
	public User retrieve(int id) {
		return repository.get(id);
	}

	@Override
	public User search(String name) {
		Collection<User> users = repository.values();
		for (User user : users) {
			if (user.getUserName().equalsIgnoreCase(name))
				return user;
		}
		return null;
	}

	@Override
	public User delete(int id) {
		User user = repository.get(id);
		this.repository.remove(id);
		return user;
	}

}