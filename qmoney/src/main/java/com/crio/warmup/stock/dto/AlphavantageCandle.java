package com.crio.warmup.stock.dto;

import java.sql.Date;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


 @JsonIgnoreProperties(ignoreUnknown = true)
public class AlphavantageCandle implements Candle 
{
  @JsonProperty("1. open")
  private Double open;

  @JsonProperty("4. close")
  private Double close;

  @JsonProperty("2. high")
  private Double high;

  @JsonProperty("3. low")
  private Double low;

  @JsonProperty("5. date")
  private LocalDate date;
  
  @Override
  public Double getOpen() {
   
    return open;
  }
  public void setOpen(Double open) {
   
    this.open= open;
  }
  @Override
  public Double getClose() {
   
    return close;
  }
  public void setClose(Double close) {
  
    this.close= close;
  }
  @Override
  public Double getHigh() {
  
    return high;
  }
  public void High(Double high) 
  {
    this.high=high;
  }
  @Override
  public Double getLow() {
 
    return low;
  }
  public void setLow(Double low) 
  {
    this.low=low;
  }
  @Override
  public LocalDate getDate() 
  {
  
    return date;
  }
  public void setDate(LocalDate date) 
  {
    this.date=date;
  }
}




