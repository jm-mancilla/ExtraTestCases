package org.ExtraTestCases.Operation;

public enum OperationTypes {
    GET,
    POST,
    PUT,
    DELETE;

    OperationTypes() {}

    public String getOperationName(){
        return this.name();
    }
}
