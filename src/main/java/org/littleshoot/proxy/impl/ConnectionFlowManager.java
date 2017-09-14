package org.littleshoot.proxy.impl;

/**
 * Created by @AlmogBaku on 13/09/2017.
 */

public interface ConnectionFlowManager {
    /**
     * Steps that should be executed before initializing the transport connection
     * @return array of steps
     */
    ConnectionFlowStep[] beforeSteps(ProxyToServerConnection connection);

    /**
     * Steps that should be executed after transport connection has established
     * @return array of steps
     */
    ConnectionFlowStep[] afterSteps(ProxyToServerConnection connection);
}
