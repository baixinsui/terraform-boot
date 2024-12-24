/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.terraform.boot.models.request.scripts;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.util.Map;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.xpanse.terraform.boot.models.request.directory.TerraformModifyFromDirectoryRequest;

/** Terraform uses the request object modify by the script. */
@EqualsAndHashCode(callSuper = true)
@Data
public class TerraformModifyWithScriptsRequest extends TerraformModifyFromDirectoryRequest {

    @Schema(description = "Id of the request.")
    private UUID taskId;

    @NotNull
    @Schema(description = "Map of script files for modify requests deployed via scripts")
    private Map<String, String> scriptsMap;

    @NotNull
    @Schema(description = "The .tfState file content after deployment")
    private String tfState;
}
