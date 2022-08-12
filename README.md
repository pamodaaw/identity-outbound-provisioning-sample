# Custom Outbound Provisioning Connector for WSO2 IS

A outbound provisioning connector allows you to provision the users from WSO2 Identity Server to other external systems. For example, you can configure Salesforce connector as provisioning connector for your identity provider to provision the users to your Salesforce app from the WSO2 Identity Server.

Outbound provisioning talks about provisioning users to external systems. You need to configure one or more outbound provisioning connectors with a given identity provider. This can be initiated by any of the following.

Inbound provisioning request
Just-In-Time(JIT) provisioning
Adding a user via the management console
Assigning a user to a provisioning role

You can develop your own provisioning connectors and plug them into the Identity Server.


Refer this blog on "[Writing an Outbound Provisioning Connector for WSO2 IS](https://medium.com/identity-beyond-borders/writing-an-outbound-provisioning-connector-4a3450d0e7a2)" to check the implementation details of the sample given in this repository.
