/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.terraform.boot.models.request.async;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.eclipse.xpanse.terraform.boot.models.enums.AuthType;

/**
 * Configuration information class of webhook.
 */
@Data
public class WebhookConfig {

    @NotNull
    @Schema(description = "Callback address after deployment/destroy is completed.")
    private String url;

    @NotNull
    @Schema(description = "The permission type when calling back.")
    private AuthType authType;
}
