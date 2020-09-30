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
 * The connection endpoint for an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS address of the cluster.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The port that the database engine listens on.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The DNS address of the cluster.
     * </p>
     * 
     * @param address
     *        The DNS address of the cluster.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The DNS address of the cluster.
     * </p>
     * 
     * @return The DNS address of the cluster.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The DNS address of the cluster.
     * </p>
     * 
     * @param address
     *        The DNS address of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterEndpoint withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The port that the database engine listens on.
     * </p>
     * 
     * @param port
     *        The port that the database engine listens on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the database engine listens on.
     * </p>
     * 
     * @return The port that the database engine listens on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the database engine listens on.
     * </p>
     * 
     * @param port
     *        The port that the database engine listens on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterEndpoint withPort(Integer port) {
        setPort(port);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterEndpoint == false)
            return false;
        AwsRedshiftClusterEndpoint other = (AwsRedshiftClusterEndpoint) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterEndpoint clone() {
        try {
            return (AwsRedshiftClusterEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
