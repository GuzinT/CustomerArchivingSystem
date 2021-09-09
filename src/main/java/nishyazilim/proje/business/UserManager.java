package nishyazilim.proje.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nishyazilim.proje.core.dataAccess.UserDao;
import nishyazilim.proje.core.entities.User;
import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.core.utilities.result.SuccessDataResult;
import nishyazilim.proje.core.utilities.result.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email),"Kullanıcı bulundu.");
	}


}
