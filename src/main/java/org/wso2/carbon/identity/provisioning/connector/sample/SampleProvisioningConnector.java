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

package org.wso2.carbon.identity.provisioning.connector.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.provisioning.AbstractOutboundProvisioningConnector;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningConstants;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningException;
import org.wso2.carbon.identity.provisioning.ProvisionedIdentifier;
import org.wso2.carbon.identity.provisioning.ProvisioningEntity;

import java.util.Properties;

/**
 * This class handles the user provisioning operations to the desired system.
 */
public class SampleProvisioningConnector extends AbstractOutboundProvisioningConnector {

    private static final Log log = LogFactory.getLog(SampleProvisioningConnector.class);
    private SampleProvisioningConnectorConfig configHolder;

    @Override
    public void init(Property[] provisioningProperties) throws IdentityProvisioningException {

        Properties configs = new Properties();

        if (provisioningProperties != null && provisioningProperties.length > 0) {
            for (Property property : provisioningProperties) {
                configs.put(property.getName(), property.getValue());
                if (IdentityProvisioningConstants.JIT_PROVISIONING_ENABLED.equals(property
                        .getName())) {
                    if (SampleConnectorConstants.PROPERTY_VALUE_TRUE.equals(property.getValue())) {
                        jitProvisioningEnabled = true;
                    }
                }
            }
        }

        configHolder = new SampleProvisioningConnectorConfig(configs);
    }

    @Override
    public ProvisionedIdentifier provision(ProvisioningEntity provisioningEntity)
            throws IdentityProvisioningException {

        String provisionedId = null;
//
//        if (provisioningEntity != null) {
//
//            if (provisioningEntity.isJitProvisioning() && !isJitProvisioningEnabled()) {
//                log.debug("JIT provisioning disabled for Office365 connector");
//                return null;
//            }
//
//            if (ProvisioningEntityType.USER == provisioningEntity.getEntityType()) {
//                if (ProvisioningOperation.DELETE == provisioningEntity.getOperation()) {
//                    deleteUser(provisioningEntity);
//                    deleteUserPermanently(provisioningEntity);
//                } else if (ProvisioningOperation.POST == provisioningEntity.getOperation()) {
//                    provisionedId = createUser(provisioningEntity);
//                } else if (ProvisioningOperation.PUT == provisioningEntity.getOperation()) {
//                    updateUser();
//                } else {
//                    log.warn("Unsupported provisioning operation " + provisioningEntity.getOperation() +
//                            " for entity type " + provisioningEntity.getEntityType());
//                }
//            } else {
//                log.warn("Unsupported provisioning entity type " + provisioningEntity.getEntityType());
//            }
//        }
//
//        // Creates a provisioned identifier for the provisioned user.
        ProvisionedIdentifier identifier = new ProvisionedIdentifier();
        identifier.setIdentifier(provisionedId);
        return identifier;
    }

//    /**
//     * Call the create user endpoint of Azure AD and provision the user.
//     *
//     * @param provisioningEntity user to be provisioned
//     * @return string id for the provisioned user
//     * @throws IdentityProvisioningException if the user can not be created in the Azure AD
//     */
//    protected String createUser(ProvisioningEntity provisioningEntity) throws IdentityProvisioningException {
//
//        String provisionedId = null;
////
////        try (CloseableHttpClient httpclient = HttpClientBuilder.create().useSystemProperties().build()) {
////
////            JSONObject user = buildUserAsJson(provisioningEntity);
////            HttpPost post = new HttpPost(SampleConnectorConstants.OFFICE365_USER_ENDPOINT);
////            setAuthorizationHeader(post);
////
////            StringEntity requestBody = new StringEntity(user.toString());
////            requestBody.setContentType(SampleConnectorConstants.CONTENT_TYPE_APPLICATION_JSON);
////            post.setEntity(requestBody);
////            post.setHeader(SampleConnectorConstants.CONTENT_TYPE, SampleConnectorConstants
////                    .CONTENT_TYPE_APPLICATION_JSON);
////
////            try (CloseableHttpResponse response = httpclient.execute(post)) {
////
////                JSONObject jsonResponse = new JSONObject(new JSONTokener(new InputStreamReader(
////                        response.getEntity().getContent())));
////                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_CREATED) {
////                    provisionedId = jsonResponse.getString("id");
////
////                    if (log.isDebugEnabled()) {
////                        log.debug("Successfully created an user in the Azure Active Directory. Server responds with
//// " +
////                                jsonResponse.toString());
////                    }
////                } else {
////                    String errorMessage = jsonResponse.getJSONObject("error").getString("message");
////                    log.error("Received response status code: " + response.getStatusLine().getStatusCode() + " "
////                            + response.getStatusLine().getReasonPhrase() + " with the message '" + errorMessage +
////                            "' while creating the user " + user.getString(SampleConnectorConstants.OFFICE365_UPN) +
////                            " in the Azure Active Directory.");
////
////                    if (log.isDebugEnabled()) {
////                        log.debug("The response received from server : " + jsonResponse.toString());
////                    }
////                }
////            } catch (IOException | JSONException e) {
////                throw new IdentityProvisioningException("Error while executing the create operation in user " +
////                        "provisioning", e);
////            }
////
////            if (log.isDebugEnabled()) {
////                log.debug("Returning provisioned user's ID: " + provisionedId);
////            }
////        } catch (IOException e) {
////            log.error("Error while closing HttpClient.");
////        }
////        return provisionedId;
//    }

    protected void updateUser() {

        // TODO: 8/14/18 Implement update user logic
    }

    /**
     * Delete provisioned users from the Azure AD.
     *
     * @param provisioningEntity the user being removed
     * @throws IdentityProvisioningException if the user deletion is failed.
     */
//    protected void deleteUser(ProvisioningEntity provisioningEntity) throws IdentityProvisioningException {
//
//        // Get the provisioned id of deleted user. (Unassigned role)
//        // User's UPN can not be considered here because if the user himself is deleted, UPN will be null.
//        String provisionedUserId = provisioningEntity.getIdentifier().getIdentifier();
//
//        try (CloseableHttpClient httpclient = HttpClientBuilder.create().useSystemProperties().build()) {
//
//            String deleteUserEndpoint = SampleConnectorConstants.OFFICE365_USER_ENDPOINT + '/' + provisionedUserId;
//            HttpDelete delete = new HttpDelete(deleteUserEndpoint);
//            setAuthorizationHeader(delete);
//
//            try (CloseableHttpResponse response = httpclient.execute(delete)) {
//
//                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_NO_CONTENT) {
//                    if (log.isDebugEnabled()) {
//                        log.debug("Successfully deleted the provisioned user with id " + provisionedUserId + " from
// " +
//                                "the Azure Active Directory");
//                    }
//                } else {
//                    JSONObject jsonResponse = new JSONObject(new JSONTokener(new InputStreamReader(
//                            response.getEntity().getContent())));
//                    String errorMessage = jsonResponse.getJSONObject("error").getString("message");
//
//                    log.error("Received response status code: " + response.getStatusLine().getStatusCode() + " "
//                            + response.getStatusLine().getReasonPhrase() + " with the message '" + errorMessage +
//                            "' while deleting the user with id " + provisionedUserId + " from the Azure Active " +
//                            "Directory.");
//
//                    if (log.isDebugEnabled()) {
//                        log.debug("The response received from server : " + jsonResponse.toString());
//                    }
//                }
//            } catch (IOException | JSONException e) {
//                throw new IdentityProvisioningException("Error while executing the delete operation in user " +
//                        "provisioning", e);
//            }
//        } catch (IOException e) {
//            log.error("Error while closing HttpClient.");
//        }
//    }
}
