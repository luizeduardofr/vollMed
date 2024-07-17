package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonCreator;
import med.voll.api.domain.ValidacaoException;


public enum MotivoCancelamento {

    PACIENTE_DESISTIU,
    MEDICO_CANCELOU,
    OUTROS;

    @JsonCreator
    public static MotivoCancelamento fromString(String value) {
        for (MotivoCancelamento motivoCancelamento : MotivoCancelamento.values()) {
            if (motivoCancelamento.name().equalsIgnoreCase(value)) {
                return motivoCancelamento;
            }
        }
        throw new ValidacaoException("Motivo de cancelamento inválido: " + value);
    }
}
