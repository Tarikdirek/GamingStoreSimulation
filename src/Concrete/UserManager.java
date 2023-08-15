package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entity.Concrete.Gamer;

public class UserManager implements UserService {
	
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	
	@Override
	public void add(Gamer gamer) {
		if (userCheckService.CheckIfUserReal()) {
			System.out.println(gamer.getFirstName() +" your account created");
		}else {
			System.out.println("Invalid national id");
		}
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" your account deleted");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" your account updated");
		
	}

	

}
