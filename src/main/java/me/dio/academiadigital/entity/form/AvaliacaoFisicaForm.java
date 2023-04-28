package me.dio.academiadigital.entity.form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Campo deve ser preenchido.")
  @Positive(message = "O Id do aluno deve ser positivo!")
  private Long alunoId;

  @NotNull(message = "Campo deve ser preenchido.")
  @Positive(message = "O Id do aluno deve ser positivo!")
  private double peso;

  @NotNull(message = "Campo deve ser preenchido.")
  @Positive(message = "O Id do aluno deve ser positivo!")
  @DecimalMin(value="40", message = "'${validatedValue}' deve ser no mínimo {value}")
  private double altura;
}
