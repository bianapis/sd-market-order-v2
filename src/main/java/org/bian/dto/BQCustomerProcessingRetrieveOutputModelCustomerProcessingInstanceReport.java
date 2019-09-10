package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport
 */
public class BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport   {
  private Object customerProcessingInstanceReportRecord = null;

  private String customerProcessingInstanceReportType = null;

  private String customerProcessingInstanceReportParameters = null;

  private Object customerProcessingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerProcessingInstanceReportRecord
  **/

  public Object getCustomerProcessingInstanceReportRecord() {
    return customerProcessingInstanceReportRecord;
  }

  public void setCustomerProcessingInstanceReportRecord(Object customerProcessingInstanceReportRecord) {
    this.customerProcessingInstanceReportRecord = customerProcessingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerProcessingInstanceReportType
  **/

  public String getCustomerProcessingInstanceReportType() {
    return customerProcessingInstanceReportType;
  }

  public void setCustomerProcessingInstanceReportType(String customerProcessingInstanceReportType) {
    this.customerProcessingInstanceReportType = customerProcessingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerProcessingInstanceReportParameters
  **/

  public String getCustomerProcessingInstanceReportParameters() {
    return customerProcessingInstanceReportParameters;
  }

  public void setCustomerProcessingInstanceReportParameters(String customerProcessingInstanceReportParameters) {
    this.customerProcessingInstanceReportParameters = customerProcessingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerProcessingInstanceReport
  **/

  public Object getCustomerProcessingInstanceReport() {
    return customerProcessingInstanceReport;
  }

  public void setCustomerProcessingInstanceReport(Object customerProcessingInstanceReport) {
    this.customerProcessingInstanceReport = customerProcessingInstanceReport;
  }


}

