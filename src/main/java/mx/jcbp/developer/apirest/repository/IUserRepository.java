package mx.jcbp.developer.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.jcbp.developer.apirest.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
