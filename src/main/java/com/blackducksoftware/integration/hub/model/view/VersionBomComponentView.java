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
/*
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.blackducksoftware.integration.hub.model.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blackducksoftware.integration.hub.model.HubView;
import com.blackducksoftware.integration.hub.model.enumeration.MatchedFileUsageEnum;
import com.blackducksoftware.integration.hub.model.view.components.ActivityDataView;
import com.blackducksoftware.integration.hub.model.view.components.RiskProfileView;
import com.blackducksoftware.integration.hub.model.view.components.VersionBomLicenseView;
import com.google.gson.annotations.SerializedName;

public class VersionBomComponentView extends HubView {
    @SerializedName("activityData")
    public ActivityDataView activityData = null;

    @SerializedName("activityRiskProfile")
    public RiskProfileView activityRiskProfile = null;

    @SerializedName("component")
    public String component = null;

    @SerializedName("componentName")
    public String componentName = null;

    @SerializedName("componentVersion")
    public String componentVersion = null;

    @SerializedName("componentVersionName")
    public String componentVersionName = null;

    @SerializedName("licenseRiskProfile")
    public RiskProfileView licenseRiskProfile = null;

    @SerializedName("licenses")
    public List<VersionBomLicenseView> licenses = new ArrayList<>();

    @SerializedName("operationalRiskProfile")
    public RiskProfileView operationalRiskProfile = null;

    @SerializedName("releasedOn")
    public Date releasedOn = null;

    @SerializedName("securityRiskProfile")
    public RiskProfileView securityRiskProfile = null;

    @SerializedName("usages")
    public List<MatchedFileUsageEnum> usages = new ArrayList<>();

    @SerializedName("versionRiskProfile")
    public RiskProfileView versionRiskProfile = null;
}
