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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>SignalExternalWorkflowExecutionFailed</code> event.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/SignalExternalWorkflowExecutionFailedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalExternalWorkflowExecutionFailedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     */
    private String cause;
    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long initiatedEventId;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;
    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * workflow execution.
     * </p>
     */
    private String control;

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @return The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution that the signal was being delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @return The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution that the signal was being delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @see SignalExternalWorkflowExecutionFailedCause
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *         purposes.</p> <note>
     *         <p>
     *         If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *         lacked sufficient permissions. For details and example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *         Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *         </p>
     * @see SignalExternalWorkflowExecutionFailedCause
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalExternalWorkflowExecutionFailedCause
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @see SignalExternalWorkflowExecutionFailedCause
     */

    public void setCause(SignalExternalWorkflowExecutionFailedCause cause) {
        withCause(cause);
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalExternalWorkflowExecutionFailedCause
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withCause(SignalExternalWorkflowExecutionFailedCause cause) {
        this.cause = cause.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *         useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getInitiatedEventId() {
        return this.initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withInitiatedEventId(Long initiatedEventId) {
        setInitiatedEventId(initiatedEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful
     *        for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be
     *         useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful
     *        for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
        return this;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * workflow execution.
     * </p>
     * 
     * @param control
     *        The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent
     *        to the workflow execution.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * workflow execution.
     * </p>
     * 
     * @return The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't
     *         sent to the workflow execution.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the
     * workflow execution.
     * </p>
     * 
     * @param control
     *        The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent
     *        to the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes withControl(String control) {
        setControl(control);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause()).append(",");
        if (getInitiatedEventId() != null)
            sb.append("InitiatedEventId: ").append(getInitiatedEventId()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalExternalWorkflowExecutionFailedEventAttributes == false)
            return false;
        SignalExternalWorkflowExecutionFailedEventAttributes other = (SignalExternalWorkflowExecutionFailedEventAttributes) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null)
            return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getInitiatedEventId() == null) ? 0 : getInitiatedEventId().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        return hashCode;
    }

    @Override
    public SignalExternalWorkflowExecutionFailedEventAttributes clone() {
        try {
            return (SignalExternalWorkflowExecutionFailedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.SignalExternalWorkflowExecutionFailedEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
