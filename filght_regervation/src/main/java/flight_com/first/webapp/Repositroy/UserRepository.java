package flight_com.first.webapp.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_com.first.webapp.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {



	User getByEmail(String email);


}
