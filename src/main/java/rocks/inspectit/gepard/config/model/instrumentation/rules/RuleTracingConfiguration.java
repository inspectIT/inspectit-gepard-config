/* (C) 2024 */
package rocks.inspectit.gepard.config.model.instrumentation.rules;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** Represents the tracing configuration for a rule. */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class RuleTracingConfiguration {

  /** The configuration representing that no tracing will be done by inspectIT */
  public static final RuleTracingConfiguration NO_TRACING = new RuleTracingConfiguration();

  /** If true, the methods, which are matched by the rule will appear in traces. */
  @Valid @NotNull private boolean startSpan = false;
}
