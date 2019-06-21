/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.provisioning.connector.sample;/**
 * This class contains the constant values required for the sample provisioning connector.
 */
public class SampleConnectorConstants {

    public static final String OFFICE365_CLIENT_ID = "client_id";
    public static final String OFFICE365_CLIENT_SECRET = "client_secret";
    public static final String OFFICE365_UPN = "userPrincipalName";
    public static final String OFFICE365_IMMUTABLE_ID = "onPremisesImmutableId";
    public static final String OFFICE365_DISPLAY_NAME = "displayName";
    public static final String OFFICE365_EMAIL_NICKNAME = "mailNickname";
    public static final String OFFICE365_ENABLE_DOMAIN = "office365-enable-domain-in-upn";
    public static final String OFFICE365_TENANT = "office365-tenant";
    public static final String OFFICE365_DOMAIN = "office365-domain";
    public static final String OFFICE365_MEMBERSHIP_ATTRIBUTE = "office-365-membership-rule-attribute";
    public static final String OFFICE365_MEMBERSHIP_VALUE = "office-365-membership-rule-value";

    public static final String WSO2_ROLE_CLAIM = "http://wso2.org/claims/role";

    public static final String OFFICE365_BASE_URL = "https://login.microsoftonline.com";
    public static final String OFFICE365_TOKEN_ENDPOINT = "/oauth2/v2.0/token";
    public static final String OFFICE365_USER_ENDPOINT = "https://graph.microsoft.com/v1.0/users";
    public static final String OFFICE365_DELETE_ENDPOINT = "https://graph.microsoft.com/beta/directory/deleteditems";

    public static final String OFFICE365_OAUTH_SCOPE = "scope";
    public static final String OFFICE365_OAUTH_GRANT = "grant_type";
    public static final String CLIENT_CREDENTIALS = "client_credentials";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";

    public static final String AUTHORIZATION_HEADER_NAME = "Authorization";
    public static final String AUTHORIZATION_HEADER_BEARER = "Bearer";

    public static final String ACCOUNT_ENABLED = "accountEnabled";
    public static final String PASSWORD_PROFILE = "passwordProfile";
    public static final String FORCE_CHANGE_PASSWORD = "forceChangePasswordNextSignIn";
    public static final String PASSWORD = "password";

    public static final String PROPERTY_VALUE_TRUE = "1";
}
