package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis;
import org.bian.dto.CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceRecord;
import org.bian.dto.CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveOutputModel
 */
public class CRMarketOrderTransactionRetrieveOutputModel   {
  private CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord = null;

  private String marketOrderTransactionRetrieveActionTaskReference = null;

  private Object marketOrderTransactionRetrieveActionTaskRecord = null;

  private String marketOrderTransactionRetrieveActionResponse = null;

  private CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord marketOrderTransactionInstanceReportRecord = null;

  private CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis marketOrderTransactionInstanceAnalysis = null;


  /**
   * Get marketOrderTransactionInstanceRecord
   * @return marketOrderTransactionInstanceRecord
  **/

  public CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceRecord getMarketOrderTransactionInstanceRecord() {
    return marketOrderTransactionInstanceRecord;
  }

  public void setMarketOrderTransactionInstanceRecord(CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceRecord marketOrderTransactionInstanceRecord) {
    this.marketOrderTransactionInstanceRecord = marketOrderTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Order Transaction instance retrieve service call 
   * @return marketOrderTransactionRetrieveActionTaskReference
  **/

  public String getMarketOrderTransactionRetrieveActionTaskReference() {
    return marketOrderTransactionRetrieveActionTaskReference;
  }

  public void setMarketOrderTransactionRetrieveActionTaskReference(String marketOrderTransactionRetrieveActionTaskReference) {
    this.marketOrderTransactionRetrieveActionTaskReference = marketOrderTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return marketOrderTransactionRetrieveActionTaskRecord
  **/

  public Object getMarketOrderTransactionRetrieveActionTaskRecord() {
    return marketOrderTransactionRetrieveActionTaskRecord;
  }

  public void setMarketOrderTransactionRetrieveActionTaskRecord(Object marketOrderTransactionRetrieveActionTaskRecord) {
    this.marketOrderTransactionRetrieveActionTaskRecord = marketOrderTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return marketOrderTransactionRetrieveActionResponse
  **/

  public String getMarketOrderTransactionRetrieveActionResponse() {
    return marketOrderTransactionRetrieveActionResponse;
  }

  public void setMarketOrderTransactionRetrieveActionResponse(String marketOrderTransactionRetrieveActionResponse) {
    this.marketOrderTransactionRetrieveActionResponse = marketOrderTransactionRetrieveActionResponse;
  }


  /**
   * Get marketOrderTransactionInstanceReportRecord
   * @return marketOrderTransactionInstanceReportRecord
  **/

  public CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord getMarketOrderTransactionInstanceReportRecord() {
    return marketOrderTransactionInstanceReportRecord;
  }

  public void setMarketOrderTransactionInstanceReportRecord(CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceReportRecord marketOrderTransactionInstanceReportRecord) {
    this.marketOrderTransactionInstanceReportRecord = marketOrderTransactionInstanceReportRecord;
  }


  /**
   * Get marketOrderTransactionInstanceAnalysis
   * @return marketOrderTransactionInstanceAnalysis
  **/

  public CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis getMarketOrderTransactionInstanceAnalysis() {
    return marketOrderTransactionInstanceAnalysis;
  }

  public void setMarketOrderTransactionInstanceAnalysis(CRMarketOrderTransactionRetrieveOutputModelMarketOrderTransactionInstanceAnalysis marketOrderTransactionInstanceAnalysis) {
    this.marketOrderTransactionInstanceAnalysis = marketOrderTransactionInstanceAnalysis;
  }


}

