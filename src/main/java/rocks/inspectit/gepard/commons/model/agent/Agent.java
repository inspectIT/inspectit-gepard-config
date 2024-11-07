/* (C) 2024 */
package rocks.inspectit.gepard.commons.model.agent;

import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/** Meta-information about an inspectIT Gepard agent. */
@AllArgsConstructor
@ToString
@Getter
public class Agent {

  /** The name of the service, which is running the agent. */
  @NotNull private String serviceName;

  /** The id of the JVM, which carries the agent. */
  @NotNull private String vmId;

  /** The inspectIT-Gepard version. */
  @NotNull private String gepardVersion;

  /** The OpenTelemetry-Java-instrumentation-version. */
  @NotNull private String otelVersion;

  /** The start time of the JVM, which carries the agent. */
  @NotNull private Instant startTime;

  /** The Java version of the JVM, which carries the agent. */
  @NotNull private String javaVersion;

  /** The custom attributes of the agent. */
  @NotNull private Map<String, String> attributes;
}
