import java.util.Date;


import Abstract.UserCheckService;
import Concrete.CampaignManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entity.Concrete.Campaign;
import Entity.Concrete.Game;
import Entity.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		Game callOfDuty = new Game(1, "CallOfDuty", "ModernWareFare 3", 1000);
		Gamer tarik = new Gamer(1, "Tarik", "Direk", new Date(1994,1,8), "123456");
		
		Campaign campaign = new Campaign(1, "SummerSale", "NewOfferForSummer", new Date(8,15,2023)
				, new Date(8,20,2023), 100);
		CampaignManager campaignManager = new CampaignManager();
		
		SalesManager salesManager = new SalesManager(campaignManager,campaign);
		
		UserManager userManager = new UserManager(new UserCheckService() {
			
			@Override
			public boolean CheckIfUserReal() {
				// TODO Auto-generated method stub
				return true;
			}
		});
		userManager.add(tarik);
		
		salesManager.add(tarik);

	}

}
