/**
 * generated by Xtext 2.19.0
 */
package org.xtext.imt.fil.dsl.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Check#getVarCheck <em>Var Check</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Action
{
  /**
   * Returns the value of the '<em><b>Var Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Check</em>' containment reference.
   * @see #setVarCheck(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getCheck_VarCheck()
   * @model containment="true"
   * @generated
   */
  VarReference getVarCheck();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Check#getVarCheck <em>Var Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Check</em>' containment reference.
   * @see #getVarCheck()
   * @generated
   */
  void setVarCheck(VarReference value);

} // Check
