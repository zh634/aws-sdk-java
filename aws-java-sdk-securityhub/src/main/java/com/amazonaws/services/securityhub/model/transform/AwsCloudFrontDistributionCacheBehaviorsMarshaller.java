/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsCloudFrontDistributionCacheBehaviorsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudFrontDistributionCacheBehaviorsMarshaller {

    private static final MarshallingInfo<List> ITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Items").build();

    private static final AwsCloudFrontDistributionCacheBehaviorsMarshaller instance = new AwsCloudFrontDistributionCacheBehaviorsMarshaller();

    public static AwsCloudFrontDistributionCacheBehaviorsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudFrontDistributionCacheBehaviors awsCloudFrontDistributionCacheBehaviors, ProtocolMarshaller protocolMarshaller) {

        if (awsCloudFrontDistributionCacheBehaviors == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudFrontDistributionCacheBehaviors.getItems(), ITEMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
