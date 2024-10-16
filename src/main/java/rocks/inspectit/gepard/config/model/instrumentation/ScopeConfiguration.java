/* (C) 2024 */
package rocks.inspectit.gepard.config.model.instrumentation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Represents a scope in the instrumentation configuration. A scope defines a set of methods which
 * should be instrumented.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ScopeConfiguration {

  private boolean enabled = false;

  @NotNull(message = "Fqn is missing.") private String fqn;

  @Valid @NotNull private List<@NotNull String> methods = List.of();
}
