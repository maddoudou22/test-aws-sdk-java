/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.licensemanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * License Manager cannot allocate a license to a resource because of its state.
 * </p>
 * <p>
 * For example, you cannot allocate a license to an instance in the process of shutting down.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidResourceStateException extends com.amazonaws.services.licensemanager.model.AWSLicenseManagerException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidResourceStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidResourceStateException(String message) {
        super(message);
    }

}
