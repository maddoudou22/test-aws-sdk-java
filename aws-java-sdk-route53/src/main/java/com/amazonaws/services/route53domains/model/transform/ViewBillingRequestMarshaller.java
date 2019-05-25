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
package com.amazonaws.services.route53domains.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ViewBillingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ViewBillingRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> START_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Start").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> END_BINDING = MarshallingInfo.builder(MarshallingType.DATE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("End").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marker").build();
    private static final MarshallingInfo<Integer> MAXITEMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxItems").build();

    private static final ViewBillingRequestMarshaller instance = new ViewBillingRequestMarshaller();

    public static ViewBillingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ViewBillingRequest viewBillingRequest, ProtocolMarshaller protocolMarshaller) {

        if (viewBillingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(viewBillingRequest.getStart(), START_BINDING);
            protocolMarshaller.marshall(viewBillingRequest.getEnd(), END_BINDING);
            protocolMarshaller.marshall(viewBillingRequest.getMarker(), MARKER_BINDING);
            protocolMarshaller.marshall(viewBillingRequest.getMaxItems(), MAXITEMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}