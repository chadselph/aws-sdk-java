/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;
import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>RequestCancelExternalWorkflowExecutionFailed</code> event.
 * </p>
 */
public class RequestCancelExternalWorkflowExecutionFailedEventAttributes  implements Serializable  {

    /**
     * The <code>workflowId</code> of the external workflow to which the
     * cancel request was to be delivered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The <code>runId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     */
    private String cause;

    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     */
    private Long initiatedEventId;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    private String control;

    /**
     * The <code>workflowId</code> of the external workflow to which the
     * cancel request was to be delivered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>workflowId</code> of the external workflow to which the
     *         cancel request was to be delivered.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow to which the
     * cancel request was to be delivered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow to which the
     *         cancel request was to be delivered.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the external workflow to which the
     * cancel request was to be delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the external workflow to which the
     *         cancel request was to be delivered.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    
    /**
     * The <code>runId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The <code>runId</code> of the external workflow execution.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The <code>runId</code> of the external workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The <code>runId</code> of the external workflow execution.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     *
     * @return The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see RequestCancelExternalWorkflowExecutionFailedCause
     */
    public String getCause() {
        return cause;
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see RequestCancelExternalWorkflowExecutionFailedCause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see RequestCancelExternalWorkflowExecutionFailedCause
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withCause(String cause) {
        this.cause = cause;
        return this;
    }
    
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see RequestCancelExternalWorkflowExecutionFailedCause
     */
    public void setCause(RequestCancelExternalWorkflowExecutionFailedCause cause) {
        this.cause = cause.toString();
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see RequestCancelExternalWorkflowExecutionFailedCause
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withCause(RequestCancelExternalWorkflowExecutionFailedCause cause) {
        this.cause = cause.toString();
        return this;
    }
    
    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @return The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public Long getInitiatedEventId() {
        return initiatedEventId;
    }
    
    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @param initiatedEventId The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }
    
    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initiatedEventId The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
        return this;
    }
    
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelExternalWorkflowExecution</code> decision for this
     * cancellation request. This information can be useful for diagnosing
     * problems by tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision for this
     *         cancellation request. This information can be useful for diagnosing
     *         problems by tracing back the cause of events.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }
    
    
    /**
     * Returns the value of the Control property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The value of the Control property for this object.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * Sets the value of the Control property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control The new value for the Control property for this object.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * Sets the value of the Control property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control The new value for the Control property for this object.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes withControl(String control) {
        this.control = control;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkflowId() != null) sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getRunId() != null) sb.append("RunId: " + getRunId() + ",");
        if (getCause() != null) sb.append("Cause: " + getCause() + ",");
        if (getInitiatedEventId() != null) sb.append("InitiatedEventId: " + getInitiatedEventId() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getControl() != null) sb.append("Control: " + getControl() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RequestCancelExternalWorkflowExecutionFailedEventAttributes == false) return false;
        RequestCancelExternalWorkflowExecutionFailedEventAttributes other = (RequestCancelExternalWorkflowExecutionFailedEventAttributes)obj;
        
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        if (other.getCause() == null ^ this.getCause() == null) return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false) return false; 
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null) return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        return true;
    }
    
}
    