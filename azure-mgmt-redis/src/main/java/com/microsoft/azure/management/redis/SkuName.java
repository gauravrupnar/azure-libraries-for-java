/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuName.
 */
public final class SkuName {
    /** Static value Basic for SkuName. */
    public static final SkuName BASIC = new SkuName("Basic");

    /** Static value Standard for SkuName. */
    public static final SkuName STANDARD = new SkuName("Standard");

    /** Static value Premium for SkuName. */
    public static final SkuName PREMIUM = new SkuName("Premium");

    private String value;

    /**
     * Creates a custom value for SkuName.
     * @param value the custom value
     */
    public SkuName(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SkuName)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SkuName rhs = (SkuName) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
