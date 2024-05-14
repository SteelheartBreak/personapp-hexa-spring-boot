package co.edu.javeriana.as.personapp.terminal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelefonoModelCli {
    private String phoneNumber; // Número de teléfono
    private String phoneCompany; // Compañía telefónica
    private String idPerson;
}