package seymacelebi.northwind.core.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import seymacelebi.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
