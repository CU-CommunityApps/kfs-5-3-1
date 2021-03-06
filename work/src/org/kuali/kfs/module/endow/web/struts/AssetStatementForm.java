/*
 * Copyright 2011 The Kuali Foundation.
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
package org.kuali.kfs.module.endow.web.struts;

public class AssetStatementForm extends EndowmentReportBaseForm {
    
    protected String monthEndDate;
    protected String reportOption;
    protected String printFileOption;
    
    /**
     * Clears all the fields
     */
    public void clear() {
        super.clear();
        this.monthEndDate = null;
        this.reportOption = "B";
        this.printFileOption = "Y";
    }

    public String getMonthEndDate() {
        return monthEndDate;
    }

    public void setMonthEndDate(String monthEndDate) {
        this.monthEndDate = monthEndDate;
    }

    public String getReportOption() {
        return reportOption;
    }

    public void setReportOption(String reportOption) {
        this.reportOption = reportOption;
    }

    public String getPrintFileOption() {
        return printFileOption;
    }

    public void setPrintFileOption(String printFileOption) {
        this.printFileOption = printFileOption;
    }

}
