/*
 * Copyright 2007 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl2.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kfs.gl.batch.service.impl;

/**
 * An status object that signifies the status of the enterprise feeder process
 */
public interface EnterpriseFeederStatus {
    /**
     * Returns whether this event represents an error.
     * 
     * @return
     */
    public boolean isErrorEvent();

    /**
     * Returns a String providing a human-readable description of this status
     * 
     * @return
     */
    public String getStatusDescription();
}
