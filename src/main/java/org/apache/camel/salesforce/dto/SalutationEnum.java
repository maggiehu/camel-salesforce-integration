/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Salutation
 */
public enum SalutationEnum {

    // Mr.
    MR_("Mr."),
    // Ms.
    MS_("Ms."),
    // Mrs.
    MRS_("Mrs."),
    // Dr.
    DR_("Dr."),
    // Prof.
    PROF_("Prof.");

    final String value;

    private SalutationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SalutationEnum fromValue(String value) {
        for (SalutationEnum e : SalutationEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}