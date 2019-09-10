package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis;
import org.bian.dto.CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMarketOrderTransactionRetrieveInputModel
 */
public class CRMarketOrderTransactionRetrieveInputModel   {
  private Object marketOrderTransactionRetrieveActionTaskRecord = null;

  private String marketOrderTransactionRetrieveActionRequest = null;

  private CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord marketOrderTransactionInstanceReportRecord = null;

  private CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis marketOrderTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return marketOrderTransactionRetrieveActionRequest
  **/

  public String getMarketOrderTransactionRetrieveActionRequest() {
    return marketOrderTransactionRetrieveActionRequest;
  }

  public void setMarketOrderTransactionRetrieveActionRequest(String marketOrderTransactionRetrieveActionRequest) {
    this.marketOrderTransactionRetrieveActionRequest = marketOrderTransactionRetrieveActionRequest;
  }


  /**
   * Get marketOrderTransactionInstanceReportRecord
   * @return marketOrderTransactionInstanceReportRecord
  **/

  public CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord getMarketOrderTransactionInstanceReportRecord() {
    return marketOrderTransactionInstanceReportRecord;
  }

  public void setMarketOrderTransactionInstanceReportRecord(CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceReportRecord marketOrderTransactionInstanceReportRecord) {
    this.marketOrderTransactionInstanceReportRecord = marketOrderTransactionInstanceReportRecord;
  }


  /**
   * Get marketOrderTransactionInstanceAnalysis
   * @return marketOrderTransactionInstanceAnalysis
  **/

  public CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis getMarketOrderTransactionInstanceAnalysis() {
    return marketOrderTransactionInstanceAnalysis;
  }

  public void setMarketOrderTransactionInstanceAnalysis(CRMarketOrderTransactionRetrieveInputModelMarketOrderTransactionInstanceAnalysis marketOrderTransactionInstanceAnalysis) {
    this.marketOrderTransactionInstanceAnalysis = marketOrderTransactionInstanceAnalysis;
  }


}

