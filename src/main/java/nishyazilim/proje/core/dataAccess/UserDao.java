package nishyazilim.proje.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import nishyazilim.proje.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmail(String email);

}
