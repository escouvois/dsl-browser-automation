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
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Check#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Action
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getCheck_Var()
   * @model containment="true"
   * @generated
   */
  VarReference getVar();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Check#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VarReference value);

} // Check
