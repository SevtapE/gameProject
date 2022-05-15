package gameProject.adaptors;

import gameProject.abstracts.Person;
import gameProject.abstracts.PersonCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements PersonCheckService{

	@Override
	public Boolean checkIfRealPerson(Person person) throws Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(person.getNationalityId()), person.getFirstName().toUpperCase(), person.getLastName().toUpperCase(), person.getdateofBirthYear());
	}

}
