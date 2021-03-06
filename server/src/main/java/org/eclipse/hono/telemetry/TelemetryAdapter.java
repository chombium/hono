/**
 * Copyright (c) 2016 Bosch Software Innovations GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bosch Software Innovations GmbH - initial creation
 */
package org.eclipse.hono.telemetry;

import org.apache.qpid.proton.message.Message;

/**
 * A strategy for processing downstream telemetry data.
 *
 */
public interface TelemetryAdapter {

    /**
     * Processes a message containing telemetry data produced by a device.
     * 
     * @param telemetryData the message containing the data.
     * @param clientId the ID of the client that has sent the message.
     * @param resultHandler the handler to invoke with the outcome of the operation. The result will be returned
     *        to the sender of the message.
     * @throws NullPointerException if any of the parameters is {@code null}.
     */
    void processTelemetryData(Message telemetryData, String clientId);
}
