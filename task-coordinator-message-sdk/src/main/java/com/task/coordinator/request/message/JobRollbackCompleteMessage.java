package com.task.coordinator.request.message;

import com.task.coordinator.base.message.TcsAsyncCtrlMessage;

public class JobRollbackCompleteMessage extends TcsAsyncCtrlMessage {

    private String jobName;
    private String jobId;

    public JobRollbackCompleteMessage(String jobName, String jobId) {
        this.jobName = jobName;
        this.jobId = jobId;
    }

    public JobRollbackCompleteMessage() {
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "JobRollbackCompleteMessage [jobName=" + jobName + ", jobId=" + jobId + "]";
    }
}
