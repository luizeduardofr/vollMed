package med.voll.api.domain.medico;

import com.fasterxml.jackson.annotation.JsonCreator;
import med.voll.api.domain.ValidacaoException;

public enum Especialidade {

    ORTOPEDIA,
    CARDIOLOGIA,
    GINECOLOGIA,
    DERMATOLOGIA;

    @JsonCreator
    public static Especialidade fromString(String value) {
        for (Especialidade especialidade : Especialidade.values()) {
            if (especialidade.name().equalsIgnoreCase(value)) {
                return especialidade;
            }
        }
        throw new ValidacaoException("Especialidade inválida: " + value);
    }
}
