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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Scte35TimeSignalScheduleActionSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller implements Unmarshaller<Scte35TimeSignalScheduleActionSettings, JsonUnmarshallerContext> {

    public Scte35TimeSignalScheduleActionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Scte35TimeSignalScheduleActionSettings scte35TimeSignalScheduleActionSettings = new Scte35TimeSignalScheduleActionSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("scte35Descriptors", targetDepth)) {
                    context.nextToken();
                    scte35TimeSignalScheduleActionSettings.setScte35Descriptors(new ListUnmarshaller<Scte35Descriptor>(Scte35DescriptorJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scte35TimeSignalScheduleActionSettings;
    }

    private static Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller instance;

    public static Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}