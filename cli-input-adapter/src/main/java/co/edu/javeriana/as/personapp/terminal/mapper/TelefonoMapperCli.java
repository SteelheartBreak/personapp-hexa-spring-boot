package co.edu.javeriana.as.personapp.terminal.mapper;

import co.edu.javeriana.as.personapp.common.annotations.Mapper;
import co.edu.javeriana.as.personapp.domain.Person;
import co.edu.javeriana.as.personapp.domain.Phone;
import co.edu.javeriana.as.personapp.terminal.model.TelefonoModelCli;

@Mapper
public class TelefonoMapperCli {

    public TelefonoModelCli fromDomainToAdapterCli(Phone phone) {
        TelefonoModelCli telefonoModelCli = new TelefonoModelCli();
        telefonoModelCli.setPhoneNumber(phone.getNumber());
        telefonoModelCli.setPhoneCompany(phone.getCompany());
        telefonoModelCli.setIdPerson(String.valueOf(phone.getOwner().getIdentification()));
        return telefonoModelCli;
    }

        public Phone fromAdapterCliToDomain(TelefonoModelCli telefonoModelCli, Person Owner) {
        Phone phone = new Phone();
        phone.setNumber(telefonoModelCli.getPhoneNumber());
        phone.setCompany(telefonoModelCli.getPhoneCompany());
        phone.setOwner(Owner);
        return phone;
    }
}