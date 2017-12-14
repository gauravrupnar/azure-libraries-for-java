/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.batchai;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.batchai.implementation.BatchAIManager;
import com.microsoft.azure.management.batchai.implementation.JobInner;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasParent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.IndependentChildResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;

/**
 * Client-side representation of Batch AI Job object, associated with Batch AI Cluster.
 */
@Fluent
@Beta
public interface Job extends
        IndependentChildResource<BatchAIManager, JobInner>,
        Refreshable<Job>,
        Updatable<Job.Update>,
        HasParent<Cluster> {

    /**
     * The entirety of the virtual network gateway connection definition.
     */
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of virtual network gateway connection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of virtual network gateway connection definition.
         */
        interface Blank extends DefinitionWithRegion<WithCreate> {
        }


        /**
         * The stage of a virtual network gateway connection definition with sufficient inputs to create a new connection in the cloud,
         * but exposing additional optional settings to specify.
         */
        interface WithCreate extends
                Creatable<Job>,
                Resource.DefinitionWithTags<WithCreate> {
        }
    }

    /**
     * Grouping of virtual network gateway connection update stages.
     */
    interface Update extends
            Appliable<Job>,
            Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of virtual network gateway connection update stages.
     */
    interface UpdateStages {

    }
}
