package nishyazilim.proje.business;

import nishyazilim.proje.core.entities.User;
import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> getByEmail(String email);

}
