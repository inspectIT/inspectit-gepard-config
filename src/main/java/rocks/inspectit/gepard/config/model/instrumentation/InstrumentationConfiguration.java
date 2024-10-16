/* (C) 2024 */
package rocks.inspectit.gepard.config.model.instrumentation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rocks.inspectit.gepard.config.model.instrumentation.rules.RuleConfiguration;
import rocks.inspectit.gepard.config.model.instrumentation.scopes.ScopeConfiguration;

/**
 * The instrumentation configuration contains all configurations related to instrumentation. e.g.
 * scopes, rules, actions.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class InstrumentationConfiguration {

  /**
   * The set of defined scopes. The keys represent their name, which will be used for references.
   */
  @Valid @NotNull private Map<@NotNull @NotEmpty String, @NotNull ScopeConfiguration> scopes = Map.of();

  /** The set of defined ruled. The keys represent their name, which will be used for references. */
  @Valid @NotNull private Map<@NotNull @NotEmpty String, @NotNull RuleConfiguration> rules = Map.of();

  /**
   * @param fqn the fully qualified name of a class
   * @return the list of scopes, which address the provided fqn
   */
  public List<ScopeConfiguration> getAllMatchingScopes(@NotNull String fqn) {
    return scopes.values().stream().filter(scope -> scope.getFqn().equals(fqn)).toList();
  }
}
