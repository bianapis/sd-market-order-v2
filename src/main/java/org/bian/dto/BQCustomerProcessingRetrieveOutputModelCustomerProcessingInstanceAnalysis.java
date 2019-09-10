package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis
 */
public class BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis   {
  private Object customerProcessingInstanceAnalysisRecord = null;

  private String customerProcessingInstanceAnalysisReportType = null;

  private String customerProcessingInstanceAnalysisParameters = null;

  private Object customerProcessingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerProcessingInstanceAnalysisRecord
  **/

  public Object getCustomerProcessingInstanceAnalysisRecord() {
    return customerProcessingInstanceAnalysisRecord;
  }

  public void setCustomerProcessingInstanceAnalysisRecord(Object customerProcessingInstanceAnalysisRecord) {
    this.customerProcessingInstanceAnalysisRecord = customerProcessingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerProcessingInstanceAnalysisReportType
  **/

  public String getCustomerProcessingInstanceAnalysisReportType() {
    return customerProcessingInstanceAnalysisReportType;
  }

  public void setCustomerProcessingInstanceAnalysisReportType(String customerProcessingInstanceAnalysisReportType) {
    this.customerProcessingInstanceAnalysisReportType = customerProcessingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerProcessingInstanceAnalysisParameters
  **/

  public String getCustomerProcessingInstanceAnalysisParameters() {
    return customerProcessingInstanceAnalysisParameters;
  }

  public void setCustomerProcessingInstanceAnalysisParameters(String customerProcessingInstanceAnalysisParameters) {
    this.customerProcessingInstanceAnalysisParameters = customerProcessingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerProcessingInstanceAnalysisReport
  **/

  public Object getCustomerProcessingInstanceAnalysisReport() {
    return customerProcessingInstanceAnalysisReport;
  }

  public void setCustomerProcessingInstanceAnalysisReport(Object customerProcessingInstanceAnalysisReport) {
    this.customerProcessingInstanceAnalysisReport = customerProcessingInstanceAnalysisReport;
  }


}

