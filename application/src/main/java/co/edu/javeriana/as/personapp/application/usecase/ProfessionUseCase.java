package co.edu.javeriana.as.personapp.application.usecase;

import co.edu.javeriana.as.personapp.application.port.in.ProfessionInputPort;
import co.edu.javeriana.as.personapp.application.port.out.ProfessionOutputPort;
import co.edu.javeriana.as.personapp.common.annotations.UseCase;
import co.edu.javeriana.as.personapp.common.exceptions.NoExistException;
import co.edu.javeriana.as.personapp.domain.Profession;
import co.edu.javeriana.as.personapp.domain.Study;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;

@Slf4j
@UseCase
public class ProfessionUseCase implements ProfessionInputPort {

    private ProfessionOutputPort professionPersistence;

    public ProfessionUseCase(@Qualifier("professionOutputAdapterMaria") ProfessionOutputPort professionPersistence) {
        this.professionPersistence = professionPersistence;
    }

    @Override
    public void setPersistence(ProfessionOutputPort professionPersistence) {
        this.professionPersistence = professionPersistence;
    }

    @Override
    public Profession create(Profession profession) {
        log.debug("Into Profession create on Application Domain");
        return professionPersistence.save(profession);
    }

    @Override
    public Profession edit(Integer identification, Profession profession) throws NoExistException {
        return Optional.ofNullable(professionPersistence.findById(identification))
                .map(existingProfession -> professionPersistence.save(profession))
                .orElseThrow(() -> new NoExistException(
                        "The profession with identification " + identification + " does not exist into db, cannot be edited"));
    }

    @Override
    public Boolean drop(Integer identification) throws NoExistException {
        return Optional.ofNullable(professionPersistence.findById(identification))
                .map(existingProfession -> professionPersistence.delete(identification))
                .orElseThrow(() -> new NoExistException(
                        "The profession with identification " + identification + " does not exist into db, cannot be dropped"));
    }

    @Override
    public List<Profession> findAll() {
        return professionPersistence.find();
    }

    @Override
    public Profession findOne(Integer identification) throws NoExistException {
        return Optional.ofNullable(professionPersistence.findById(identification))
                .orElseThrow(() -> new NoExistException(
                        "The profession with identification " + identification + " does not exist into db, cannot be found"));
    }

    @Override
    public Integer count() {
        return findAll().size();
    }

    @Override
    public List<Study> getStudies(Integer identification) throws NoExistException {
        return Optional.ofNullable(professionPersistence.findById(identification))
                .map(Profession::getStudies)
                .orElseThrow(() -> new NoExistException(
                        "The profession with identification " + identification + " does not exist into db, cannot be found"));
    }
}
