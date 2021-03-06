/**
 * Copyright 2010 OpenEngSB Division, Vienna University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openengsb.connector.promreport.internal.model;

import org.openengsb.domain.report.model.ReportPart;

public class ProcessInstancePointer extends ReportPart {
    
    private Long processId;
    private String processInstanceId;
    
    public ProcessInstancePointer(String partName) {
        super(partName, "text/plain");
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Override
    public byte[] getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("processId=").append(processId).append("\n");
        sb.append("instanceId=").append(processInstanceId).append("\n");
        return sb.toString().getBytes();
    }

}
