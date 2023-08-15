package Concrete;

import Abstract.CampaignService;
import Abstract.SalesService;
import Entity.Concrete.Campaign;
import Entity.Concrete.Gamer;

public class SalesManager implements SalesService {
	CampaignService campaignService;
	Campaign campaign;
	public SalesManager(CampaignService campaignService,Campaign campaign) {
		this();
		this.campaignService = campaignService;
		this.campaign = campaign;
	}
	public SalesManager() {
		
	}
	@Override
	public void add(Gamer entity) {
		System.out.println(entity.getFirstName() +" your payment added");
		campaignService.add(campaign);
	}
	

	@Override
	public void delete(Gamer entity) {
		System.out.println(entity.getFirstName() +" your payment deleted");
		campaignService.delete(campaign);
	}

	@Override
	public void update(Gamer entity) {
		System.out.println(entity.getFirstName() +" your payment updated");
		campaignService.update(campaign); 
	}


}
