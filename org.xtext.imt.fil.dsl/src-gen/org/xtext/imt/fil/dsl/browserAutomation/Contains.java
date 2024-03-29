/**
 * generated by Xtext 2.19.0
 */
package org.xtext.imt.fil.dsl.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Contains#getVarContains <em>Var Contains</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Contains#getVarContained <em>Var Contained</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends Action
{
  /**
   * Returns the value of the '<em><b>Var Contains</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Contains</em>' containment reference.
   * @see #setVarContains(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getContains_VarContains()
   * @model containment="true"
   * @generated
   */
  VarReference getVarContains();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Contains#getVarContains <em>Var Contains</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Contains</em>' containment reference.
   * @see #getVarContains()
   * @generated
   */
  void setVarContains(VarReference value);

  /**
   * Returns the value of the '<em><b>Var Contained</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Contained</em>' containment reference.
   * @see #setVarContained(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getContains_VarContained()
   * @model containment="true"
   * @generated
   */
  VarReference getVarContained();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Contains#getVarContained <em>Var Contained</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Contained</em>' containment reference.
   * @see #getVarContained()
   * @generated
   */
  void setVarContained(VarReference value);

} // Contains
