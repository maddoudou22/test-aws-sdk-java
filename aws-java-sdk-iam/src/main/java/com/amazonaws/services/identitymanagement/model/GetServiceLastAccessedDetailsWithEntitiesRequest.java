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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLastAccessedDetailsWithEntities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLastAccessedDetailsWithEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     * attempted to access the specified service.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the name of
     * the service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     * </p>
     * 
     * @param jobId
     *        The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     * </p>
     * 
     * @return The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     * </p>
     * 
     * @param jobId
     *        The ID of the request generated by the <code>GenerateServiceLastAccessedDetails</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsWithEntitiesRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     * attempted to access the specified service.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the name of
     * the service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     *        attempted to access the specified service.</p>
     *        <p>
     *        To learn the service namespace for a service, go to <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the
     *        name of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     * attempted to access the specified service.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the name of
     * the service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     *         attempted to access the specified service.</p>
     *         <p>
     *         To learn the service namespace for a service, go to <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the
     *         name of the service to view details for that service. In the first paragraph, find the service prefix.
     *         For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *         href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     * attempted to access the specified service.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the name of
     * the service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last
     *        attempted to access the specified service.</p>
     *        <p>
     *        To learn the service namespace for a service, go to <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i> and choose the
     *        name of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsWithEntitiesRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum number of items you want in the response.
     *         If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *         fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *         response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *         subsequent call that tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsWithEntitiesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceLastAccessedDetailsWithEntitiesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLastAccessedDetailsWithEntitiesRequest == false)
            return false;
        GetServiceLastAccessedDetailsWithEntitiesRequest other = (GetServiceLastAccessedDetailsWithEntitiesRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceLastAccessedDetailsWithEntitiesRequest clone() {
        return (GetServiceLastAccessedDetailsWithEntitiesRequest) super.clone();
    }

}