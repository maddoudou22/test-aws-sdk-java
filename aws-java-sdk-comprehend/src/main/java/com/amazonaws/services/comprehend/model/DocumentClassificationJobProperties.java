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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a document classification job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassificationJobProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassificationJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The current status of the document classification job. If the status is <code>FAILED</code>, the
     * <code>Message</code> field shows the reason for the failure.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * A description of the status of the job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the document classification job was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     */
    private String documentClassifierArn;
    /**
     * <p>
     * The input data configuration that you supplied when you created the document classification job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The output data configuration that you supplied when you created the document classification job.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the document classification job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * 
     * @return The identifier assigned to the document classification job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the document classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * 
     * @param jobName
     *        The name that you assigned to the document classification job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * 
     * @return The name that you assigned to the document classification job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * 
     * @param jobName
     *        The name that you assigned to the document classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is <code>FAILED</code>, the
     * <code>Message</code> field shows the reason for the failure.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the document classification job. If the status is <code>FAILED</code>, the
     *        <code>Message</code> field shows the reason for the failure.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is <code>FAILED</code>, the
     * <code>Message</code> field shows the reason for the failure.
     * </p>
     * 
     * @return The current status of the document classification job. If the status is <code>FAILED</code>, the
     *         <code>Message</code> field shows the reason for the failure.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is <code>FAILED</code>, the
     * <code>Message</code> field shows the reason for the failure.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the document classification job. If the status is <code>FAILED</code>, the
     *        <code>Message</code> field shows the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DocumentClassificationJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is <code>FAILED</code>, the
     * <code>Message</code> field shows the reason for the failure.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the document classification job. If the status is <code>FAILED</code>, the
     *        <code>Message</code> field shows the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DocumentClassificationJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     * 
     * @param message
     *        A description of the status of the job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     * 
     * @return A description of the status of the job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     * 
     * @param message
     *        A description of the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the document classification job was submitted for processing.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for processing.
     * </p>
     * 
     * @return The time that the document classification job was submitted for processing.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the document classification job was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     * 
     * @param endTime
     *        The time that the document classification job completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     * 
     * @return The time that the document classification job completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     * 
     * @param endTime
     *        The time that the document classification job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier.
     */

    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the document classifier.
     */

    public String getDocumentClassifierArn() {
        return this.documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withDocumentClassifierArn(String documentClassifierArn) {
        setDocumentClassifierArn(documentClassifierArn);
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the document classification job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @return The input data configuration that you supplied when you created the document classification job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the document classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that you supplied when you created the document classification job.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @return The output data configuration that you supplied when you created the document classification job.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the document classification job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that you supplied when you created the document classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend
     * read access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon
     *        Comprehend read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: ").append(getDocumentClassifierArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassificationJobProperties == false)
            return false;
        DocumentClassificationJobProperties other = (DocumentClassificationJobProperties) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassificationJobProperties clone() {
        try {
            return (DocumentClassificationJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassificationJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}