package Concrete;

import Abstract.UserCheckService;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean CheckIfUserReal() {
		
		return true;
	}

}
