/**
 * generated by Xtext 2.19.0
 */
package org.xtext.imt.fil.dsl.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getAttrVal <em>Attr Val</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet()
 * @model
 * @generated
 */
public interface Get extends Statement
{
  /**
   * Returns the value of the '<em><b>Var Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Ref</em>' containment reference.
   * @see #setVarRef(Variable)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_VarRef()
   * @model containment="true"
   * @generated
   */
  Variable getVarRef();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getVarRef <em>Var Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Ref</em>' containment reference.
   * @see #getVarRef()
   * @generated
   */
  void setVarRef(Variable value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(Order)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_Order()
   * @model containment="true"
   * @generated
   */
  Order getOrder();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(Order value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

  /**
   * Returns the value of the '<em><b>Attr Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Val</em>' containment reference.
   * @see #setAttrVal(AttributeValue)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_AttrVal()
   * @model containment="true"
   * @generated
   */
  AttributeValue getAttrVal();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getAttrVal <em>Attr Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Val</em>' containment reference.
   * @see #getAttrVal()
   * @generated
   */
  void setAttrVal(AttributeValue value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getGet_From()
   * @model containment="true"
   * @generated
   */
  VarReference getFrom();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Get#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(VarReference value);

} // Get
