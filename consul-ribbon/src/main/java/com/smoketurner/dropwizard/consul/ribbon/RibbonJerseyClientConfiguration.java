/*
 * Copyright © 2019 Smoke Turner, LLC (github@smoketurner.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.smoketurner.dropwizard.consul.ribbon;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.util.Duration;
import io.dropwizard.validation.MinDuration;
import java.util.concurrent.TimeUnit;
import javax.validation.constraints.NotNull;

public class RibbonJerseyClientConfiguration extends JerseyClientConfiguration {

  @NotNull
  @MinDuration(value = 1, unit = TimeUnit.SECONDS)
  private Duration refreshInterval = Duration.seconds(10);

  @JsonProperty
  public Duration getRefreshInterval() {
    return refreshInterval;
  }

  @JsonProperty
  public void setRefreshInterval(Duration interval) {
    refreshInterval = interval;
  }
}
