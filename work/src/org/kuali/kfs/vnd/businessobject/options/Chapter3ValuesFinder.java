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
package org.kuali.kfs.vnd.businessobject.options;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.kfs.vnd.businessobject.Chapter3Status;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KeyValuesService;

/**
 * Values Finder for <code>VendorType</code>.
 *
 * @see org.kuali.kfs.vnd.businessobject.VendorType
 */
public class Chapter3ValuesFinder extends KeyValuesBase {

    /*
     * @see org.kuali.keyvalues.KeyValuesFinder#getKeyValues()
     */
    @Override
    public List<KeyValue> getKeyValues() {
        KeyValuesService boService = SpringContext.getBean(KeyValuesService.class);
        Collection<Chapter3Status> statuses = boService.findAll(Chapter3Status.class);
        List<KeyValue> tempLabels = new ArrayList<KeyValue>();
        tempLabels.add(new ConcreteKeyValue("", ""));
        for (Chapter3Status status : statuses) {
            if (status.isActive()) {
                tempLabels.add(new ConcreteKeyValue(status.getVendorChapter3StatusCode(), status.getVendorChapter3StatusDescription()));

            }
        }

        return tempLabels;
    }
}
