/* (C) 2024 */
package rocks.inspectit.gepard.config.model;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rocks.inspectit.gepard.config.model.instrumentation.InstrumentationConfiguration;

/** Model of the inspectIT Gepard configuration. */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InspectitConfiguration {

  @Valid private InstrumentationConfiguration instrumentation = new InstrumentationConfiguration();
}
