package mx.jcbp.developer.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.jcbp.developer.apirest.entity.User;
import mx.jcbp.developer.apirest.repository.IUserRepository;


@Service
public class UserService {

	@Autowired
	private IUserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> getById(Integer id) {
		return userRepository.findById(id);
	}
	
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}
