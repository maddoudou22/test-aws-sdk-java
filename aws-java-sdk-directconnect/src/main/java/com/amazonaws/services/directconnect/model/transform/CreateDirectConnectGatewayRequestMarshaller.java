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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDirectConnectGatewayRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDirectConnectGatewayRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayName").build();
    private static final MarshallingInfo<Long> AMAZONSIDEASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amazonSideAsn").build();

    private static final CreateDirectConnectGatewayRequestMarshaller instance = new CreateDirectConnectGatewayRequestMarshaller();

    public static CreateDirectConnectGatewayRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDirectConnectGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDirectConnectGatewayRequest.getDirectConnectGatewayName(), DIRECTCONNECTGATEWAYNAME_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayRequest.getAmazonSideAsn(), AMAZONSIDEASN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}