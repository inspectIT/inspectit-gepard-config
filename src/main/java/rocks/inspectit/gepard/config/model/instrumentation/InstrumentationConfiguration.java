/* (C) 2024 */
package rocks.inspectit.gepard.config.model.instrumentation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The instrumentation configuration contains all configurations related to instrumentation. e.g.
 * scopes, rules, actions.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InstrumentationConfiguration {

  @Valid @NotNull private List<@NotNull ScopeConfiguration> scopes = List.of();

  /**
   * @param fqn the fully qualified name of a class
   * @return the list of scopes, which address the provided fqn
   */
  public List<ScopeConfiguration> getAllMatchingScopes(@NotNull String fqn) {
    return scopes.stream().filter(scope -> scope.getFqn().equals(fqn)).toList();
  }
}
