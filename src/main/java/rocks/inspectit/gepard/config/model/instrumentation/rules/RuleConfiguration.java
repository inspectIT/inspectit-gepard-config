/* (C) 2024 */
package rocks.inspectit.gepard.config.model.instrumentation.rules;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Represents a rule in the instrumentation configuration. A rule should combine defined scopes with
 * actions. Thus, it tells us WHAT should be instrumented HOW.<br>
 * Additionally, we handle data extraction within rules. If data was extracted from the application
 * via actions, we can use this data for other actions or in metrics or traces. All actions of a
 * rule will be executed for each call of a method within the included scopes. If a rule does have
 * no scopes, or no actions, nothing will happen.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class RuleConfiguration {

  private boolean enabled = true;

  /**
   * Defines, which scope is used by this rule and whether it is enabled or not. The key references
   * the scope. The value specify whether the scope is enabled or not.
   */
  @Valid @NotNull private Map<@NotNull @NotEmpty String, @NotNull Boolean> scopes = Map.of();

  /** Stores all configuration options related to tracing. */
  @Valid @NotNull private RuleTracingConfiguration tracing = RuleTracingConfiguration.NO_TRACING;
}
