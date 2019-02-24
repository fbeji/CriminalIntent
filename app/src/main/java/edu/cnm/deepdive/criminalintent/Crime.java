package edu.cnm.deepdive.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

  private UUID mId;
  private String mTitle;
  private Date mDate;
  private boolean mSolved;

  public Crime(){


    mId = UUID.randomUUID();
    mDate = new Date();
  }

  public UUID getId() {
    return mId;
  }

  public String getTitle() {
    return mTitle;
  }

  public void setTitle(String Title) {
    this.mTitle = Title;
  }

  public Date getDate() {
    return mDate;
  }

  public void setDate(Date Date) {
    this.mDate = Date;
  }

  public boolean isSolved() {
    return mSolved;
  }

  public void setSolved(boolean Solved) {
    this.mSolved = Solved;
  }
}
