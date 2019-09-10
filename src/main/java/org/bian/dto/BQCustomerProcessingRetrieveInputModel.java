package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis;
import org.bian.dto.BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveInputModel
 */
public class BQCustomerProcessingRetrieveInputModel   {
  private Object customerProcessingRetrieveActionTaskRecord = null;

  private String customerProcessingRetrieveActionRequest = null;

  private BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport customerProcessingInstanceReport = null;

  private BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis customerProcessingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerProcessingRetrieveActionTaskRecord
  **/

  public Object getCustomerProcessingRetrieveActionTaskRecord() {
    return customerProcessingRetrieveActionTaskRecord;
  }

  public void setCustomerProcessingRetrieveActionTaskRecord(Object customerProcessingRetrieveActionTaskRecord) {
    this.customerProcessingRetrieveActionTaskRecord = customerProcessingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerProcessingRetrieveActionRequest
  **/

  public String getCustomerProcessingRetrieveActionRequest() {
    return customerProcessingRetrieveActionRequest;
  }

  public void setCustomerProcessingRetrieveActionRequest(String customerProcessingRetrieveActionRequest) {
    this.customerProcessingRetrieveActionRequest = customerProcessingRetrieveActionRequest;
  }


  /**
   * Get customerProcessingInstanceReport
   * @return customerProcessingInstanceReport
  **/

  public BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport getCustomerProcessingInstanceReport() {
    return customerProcessingInstanceReport;
  }

  public void setCustomerProcessingInstanceReport(BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceReport customerProcessingInstanceReport) {
    this.customerProcessingInstanceReport = customerProcessingInstanceReport;
  }


  /**
   * Get customerProcessingInstanceAnalysis
   * @return customerProcessingInstanceAnalysis
  **/

  public BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis getCustomerProcessingInstanceAnalysis() {
    return customerProcessingInstanceAnalysis;
  }

  public void setCustomerProcessingInstanceAnalysis(BQCustomerProcessingRetrieveInputModelCustomerProcessingInstanceAnalysis customerProcessingInstanceAnalysis) {
    this.customerProcessingInstanceAnalysis = customerProcessingInstanceAnalysis;
  }


}

