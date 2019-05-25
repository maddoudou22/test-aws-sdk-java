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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEventSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event subscription to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String subscriptionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN is
     * created by Amazon SNS when you create a topic and subscribe to it.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceIds;
    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to create
     * the subscription but not activate it.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the event subscription to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subscriptionName
     *        The name of the event subscription to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the event subscription to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the event subscription to be created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot be null, empty, or blank.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the event subscription to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subscriptionName
     *        The name of the event subscription to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN is
     * created by Amazon SNS when you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN
     *        is created by Amazon SNS when you create a topic and subscribe to it.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN is
     * created by Amazon SNS when you create a topic and subscribe to it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN
     *         is created by Amazon SNS when you create a topic and subscribe to it.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN is
     * created by Amazon SNS when you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN
     *        is created by Amazon SNS when you create a topic and subscribe to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     * </p>
     * 
     * @param sourceType
     *        The type of source that will be generating the events. For example, if you want to be notified of events
     *        generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *        are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *        to specify source IDs.</p>
     *        <p>
     *        Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     * </p>
     * 
     * @return The type of source that will be generating the events. For example, if you want to be notified of events
     *         generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *         are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *         to specify source IDs.</p>
     *         <p>
     *         Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     * </p>
     * 
     * @param sourceType
     *        The type of source that will be generating the events. For example, if you want to be notified of events
     *        generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *        are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *        to specify source IDs.</p>
     *        <p>
     *        Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @return A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *         same type as was specified in the source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are returned for all objects within the
     *         source type specified.</p>
     *         <p>
     *         Example: my-cluster-1, my-cluster-2
     *         </p>
     *         <p>
     *         Example: my-snapshot-20131010
     */

    public java.util.List<String> getSourceIds() {
        if (sourceIds == null) {
            sourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceIds;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     */

    public void setSourceIds(java.util.Collection<String> sourceIds) {
        if (sourceIds == null) {
            this.sourceIds = null;
            return;
        }

        this.sourceIds = new com.amazonaws.internal.SdkInternalList<String>(sourceIds);
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIds(java.util.Collection)} or {@link #withSourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceIds(String... sourceIds) {
        if (this.sourceIds == null) {
            setSourceIds(new com.amazonaws.internal.SdkInternalList<String>(sourceIds.length));
        }
        for (String ele : sourceIds) {
            this.sourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceIds(java.util.Collection<String> sourceIds) {
        setSourceIds(sourceIds);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @return Specifies the Amazon Redshift event categories to be published by the event notification
     *         subscription.</p>
     *         <p>
     *         Values: configuration, management, monitoring, security
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @return Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *         <p>
     *         Values: ERROR, INFO
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to create
     * the subscription but not activate it.
     * </p>
     * 
     * @param enabled
     *        A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to
     *        create the subscription but not activate it.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to create
     * the subscription but not activate it.
     * </p>
     * 
     * @return A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to
     *         create the subscription but not activate it.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to create
     * the subscription but not activate it.
     * </p>
     * 
     * @param enabled
     *        A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to
     *        create the subscription but not activate it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to create
     * the subscription but not activate it.
     * </p>
     * 
     * @return A boolean value; set to <code>true</code> to activate the subscription, and set to <code>false</code> to
     *         create the subscription but not activate it.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceIds() != null)
            sb.append("SourceIds: ").append(getSourceIds()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSubscriptionRequest == false)
            return false;
        CreateEventSubscriptionRequest other = (CreateEventSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceIds() == null ^ this.getSourceIds() == null)
            return false;
        if (other.getSourceIds() != null && other.getSourceIds().equals(this.getSourceIds()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceIds() == null) ? 0 : getSourceIds().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSubscriptionRequest clone() {
        return (CreateEventSubscriptionRequest) super.clone();
    }

}