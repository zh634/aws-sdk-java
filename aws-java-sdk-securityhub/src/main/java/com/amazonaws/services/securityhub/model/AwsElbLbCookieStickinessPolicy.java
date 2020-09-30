/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a stickiness policy that was created using <code>CreateLBCookieStickinessPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLbCookieStickinessPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLbCookieStickinessPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     */
    private Long cookieExpirationPeriod;
    /**
     * <p>
     * The name of the policy. The name must be unique within the set of policies for the load balancer.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     *        specified, the stickiness session lasts for the duration of the browser session.
     */

    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @return The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is
     *         not specified, the stickiness session lasts for the duration of the browser session.
     */

    public Long getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     * specified, the stickiness session lasts for the duration of the browser session.
     * </p>
     * 
     * @param cookieExpirationPeriod
     *        The amount of time, in seconds, after which the cookie is considered stale. If an expiration period is not
     *        specified, the stickiness session lasts for the duration of the browser session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLbCookieStickinessPolicy withCookieExpirationPeriod(Long cookieExpirationPeriod) {
        setCookieExpirationPeriod(cookieExpirationPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the policy. The name must be unique within the set of policies for the load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy. The name must be unique within the set of policies for the load balancer.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy. The name must be unique within the set of policies for the load balancer.
     * </p>
     * 
     * @return The name of the policy. The name must be unique within the set of policies for the load balancer.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy. The name must be unique within the set of policies for the load balancer.
     * </p>
     * 
     * @param policyName
     *        The name of the policy. The name must be unique within the set of policies for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLbCookieStickinessPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCookieExpirationPeriod() != null)
            sb.append("CookieExpirationPeriod: ").append(getCookieExpirationPeriod()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLbCookieStickinessPolicy == false)
            return false;
        AwsElbLbCookieStickinessPolicy other = (AwsElbLbCookieStickinessPolicy) obj;
        if (other.getCookieExpirationPeriod() == null ^ this.getCookieExpirationPeriod() == null)
            return false;
        if (other.getCookieExpirationPeriod() != null && other.getCookieExpirationPeriod().equals(this.getCookieExpirationPeriod()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCookieExpirationPeriod() == null) ? 0 : getCookieExpirationPeriod().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLbCookieStickinessPolicy clone() {
        try {
            return (AwsElbLbCookieStickinessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLbCookieStickinessPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
