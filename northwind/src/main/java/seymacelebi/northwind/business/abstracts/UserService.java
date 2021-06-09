package seymacelebi.northwind.business.abstracts;


import seymacelebi.northwind.core.entities.User;
import seymacelebi.northwind.core.utilities.results.DataResult;
import seymacelebi.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}