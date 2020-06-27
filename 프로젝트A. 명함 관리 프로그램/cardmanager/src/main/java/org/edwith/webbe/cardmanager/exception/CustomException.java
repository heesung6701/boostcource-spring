package org.edwith.webbe.cardmanager.exception;

public class CustomException extends Exception {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private final String errorMessage;
  public CustomException(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    return errorMessage;
  }
  
}
