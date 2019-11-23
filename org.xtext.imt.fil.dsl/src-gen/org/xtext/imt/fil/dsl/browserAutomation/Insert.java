/**
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getAttrVal <em>Attr Val</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getVarToInsert <em>Var To Insert</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getVarInserted <em>Var Inserted</em>}</li>
 * </ul>
 *
 * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getInsert()
 * @model
 * @generated
 */
public interface Insert extends Action
{
  /**
   * Returns the value of the '<em><b>Attr Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Val</em>' attribute.
   * @see #setAttrVal(String)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getInsert_AttrVal()
   * @model
   * @generated
   */
  String getAttrVal();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getAttrVal <em>Attr Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Val</em>' attribute.
   * @see #getAttrVal()
   * @generated
   */
  void setAttrVal(String value);

  /**
   * Returns the value of the '<em><b>Var To Insert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var To Insert</em>' containment reference.
   * @see #setVarToInsert(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getInsert_VarToInsert()
   * @model containment="true"
   * @generated
   */
  VarReference getVarToInsert();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getVarToInsert <em>Var To Insert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var To Insert</em>' containment reference.
   * @see #getVarToInsert()
   * @generated
   */
  void setVarToInsert(VarReference value);

  /**
   * Returns the value of the '<em><b>Var Inserted</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Inserted</em>' containment reference.
   * @see #setVarInserted(VarReference)
   * @see org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage#getInsert_VarInserted()
   * @model containment="true"
   * @generated
   */
  VarReference getVarInserted();

  /**
   * Sets the value of the '{@link org.xtext.imt.fil.dsl.browserAutomation.Insert#getVarInserted <em>Var Inserted</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Inserted</em>' containment reference.
   * @see #getVarInserted()
   * @generated
   */
  void setVarInserted(VarReference value);

} // Insert
