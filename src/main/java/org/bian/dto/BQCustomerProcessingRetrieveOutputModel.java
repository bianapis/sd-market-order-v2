package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis;
import org.bian.dto.BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord;
import org.bian.dto.BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport;
import org.bian.dto.BQCustomerProcessingRetrieveOutputModelMarketOrderTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerProcessingRetrieveOutputModel
 */
public class BQCustomerProcessingRetrieveOutputModel   {
  private BQCustomerProcessingRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord customerProcessingInstanceRecord = null;

  private String customerProcessingRetrieveActionTaskReference = null;

  private Object customerProcessingRetrieveActionTaskRecord = null;

  private String customerProcessingRetrieveActionResponse = null;

  private BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport customerProcessingInstanceReport = null;

  private BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis customerProcessingInstanceAnalysis = null;


  /**
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public BQCustomerProcessingRetrieveOutputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(BQCustomerProcessingRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


  /**
   * Get customerProcessingInstanceRecord
   * @return customerProcessingInstanceRecord
  **/

  public BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord getCustomerProcessingInstanceRecord() {
    return customerProcessingInstanceRecord;
  }

  public void setCustomerProcessingInstanceRecord(BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceRecord customerProcessingInstanceRecord) {
    this.customerProcessingInstanceRecord = customerProcessingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Processing instance retrieve service call 
   * @return customerProcessingRetrieveActionTaskReference
  **/

  public String getCustomerProcessingRetrieveActionTaskReference() {
    return customerProcessingRetrieveActionTaskReference;
  }

  public void setCustomerProcessingRetrieveActionTaskReference(String customerProcessingRetrieveActionTaskReference) {
    this.customerProcessingRetrieveActionTaskReference = customerProcessingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerProcessingRetrieveActionResponse
  **/

  public String getCustomerProcessingRetrieveActionResponse() {
    return customerProcessingRetrieveActionResponse;
  }

  public void setCustomerProcessingRetrieveActionResponse(String customerProcessingRetrieveActionResponse) {
    this.customerProcessingRetrieveActionResponse = customerProcessingRetrieveActionResponse;
  }


  /**
   * Get customerProcessingInstanceReport
   * @return customerProcessingInstanceReport
  **/

  public BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport getCustomerProcessingInstanceReport() {
    return customerProcessingInstanceReport;
  }

  public void setCustomerProcessingInstanceReport(BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceReport customerProcessingInstanceReport) {
    this.customerProcessingInstanceReport = customerProcessingInstanceReport;
  }


  /**
   * Get customerProcessingInstanceAnalysis
   * @return customerProcessingInstanceAnalysis
  **/

  public BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis getCustomerProcessingInstanceAnalysis() {
    return customerProcessingInstanceAnalysis;
  }

  public void setCustomerProcessingInstanceAnalysis(BQCustomerProcessingRetrieveOutputModelCustomerProcessingInstanceAnalysis customerProcessingInstanceAnalysis) {
    this.customerProcessingInstanceAnalysis = customerProcessingInstanceAnalysis;
  }


}

