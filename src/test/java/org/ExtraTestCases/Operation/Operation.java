package org.ExtraTestCases.Operation;

import lombok.Getter;

@Getter
public class Operation {
    protected OperationTypes operationType = OperationTypes.GET;
    protected String endpoint = "";
    protected String contentType = "application/json";
    protected String domain = "";

    public OperationTypes getOperationType() {
        return operationType;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getContentType() {
        return contentType;
    }

    public String getDomain() {
        return domain;
    }
}




