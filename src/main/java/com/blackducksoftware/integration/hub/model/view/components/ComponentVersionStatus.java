/**
 * Hub Common Response
 *
 * Copyright (C) 2017 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.blackducksoftware.integration.hub.model.view.components;

import java.util.List;

import com.blackducksoftware.integration.hub.model.HubComponent;
import com.google.gson.annotations.SerializedName;

public class ComponentVersionStatus extends HubComponent {
    public String componentName;

    // If version is specified, componentVersionLink will be populated
    // otherwise it will be null
    @SerializedName("componentVersion")
    public String componentVersionLink;

    // If version is not specified, componentLink will be populated
    // otherwise it will be null
    @SerializedName("component")
    public String componentLink;

    @SerializedName("bomComponentVersionPolicyStatus")
    public String bomComponentVersionPolicyStatusLink;

    public List<String> policies;

    public String componentIssueLink;

}
