package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
        Long id,

        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivoCancelamento) {
}
