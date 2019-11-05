/**
 * generated by Xtext 2.19.0
 */
package org.xtext.imt.fil.dsl.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage;
import org.xtext.imt.fil.dsl.browserAutomation.Get;
import org.xtext.imt.fil.dsl.browserAutomation.Order;
import org.xtext.imt.fil.dsl.browserAutomation.VarReference;
import org.xtext.imt.fil.dsl.browserAutomation.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getAttrVal <em>Attr Val</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getAttrVar <em>Attr Var</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.GetImpl#getVarRef <em>Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetImpl extends StatementImpl implements Get
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Variable var;

  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected Order order;

  /**
   * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected static final String ATTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected String attr = ATTR_EDEFAULT;

  /**
   * The default value of the '{@link #getAttrVal() <em>Attr Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrVal()
   * @generated
   * @ordered
   */
  protected static final String ATTR_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttrVal() <em>Attr Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrVal()
   * @generated
   * @ordered
   */
  protected String attrVal = ATTR_VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttrVar() <em>Attr Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrVar()
   * @generated
   * @ordered
   */
  protected VarReference attrVar;

  /**
   * The cached value of the '{@link #getVarRef() <em>Var Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarRef()
   * @generated
   * @ordered
   */
  protected VarReference varRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BrowserAutomationPackage.Literals.GET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Variable newVar, NotificationChain msgs)
  {
    Variable oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(Variable newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Order getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs)
  {
    Order oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrder(Order newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ORDER, newOrder, newOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttr(String newAttr)
  {
    String oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ATTR, oldAttr, attr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAttrVal()
  {
    return attrVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttrVal(String newAttrVal)
  {
    String oldAttrVal = attrVal;
    attrVal = newAttrVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ATTR_VAL, oldAttrVal, attrVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarReference getAttrVar()
  {
    return attrVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrVar(VarReference newAttrVar, NotificationChain msgs)
  {
    VarReference oldAttrVar = attrVar;
    attrVar = newAttrVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ATTR_VAR, oldAttrVar, newAttrVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttrVar(VarReference newAttrVar)
  {
    if (newAttrVar != attrVar)
    {
      NotificationChain msgs = null;
      if (attrVar != null)
        msgs = ((InternalEObject)attrVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__ATTR_VAR, null, msgs);
      if (newAttrVar != null)
        msgs = ((InternalEObject)newAttrVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__ATTR_VAR, null, msgs);
      msgs = basicSetAttrVar(newAttrVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__ATTR_VAR, newAttrVar, newAttrVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarReference getVarRef()
  {
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarRef(VarReference newVarRef, NotificationChain msgs)
  {
    VarReference oldVarRef = varRef;
    varRef = newVarRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__VAR_REF, oldVarRef, newVarRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarRef(VarReference newVarRef)
  {
    if (newVarRef != varRef)
    {
      NotificationChain msgs = null;
      if (varRef != null)
        msgs = ((InternalEObject)varRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__VAR_REF, null, msgs);
      if (newVarRef != null)
        msgs = ((InternalEObject)newVarRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.GET__VAR_REF, null, msgs);
      msgs = basicSetVarRef(newVarRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.GET__VAR_REF, newVarRef, newVarRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.GET__VAR:
        return basicSetVar(null, msgs);
      case BrowserAutomationPackage.GET__ORDER:
        return basicSetOrder(null, msgs);
      case BrowserAutomationPackage.GET__ATTR_VAR:
        return basicSetAttrVar(null, msgs);
      case BrowserAutomationPackage.GET__VAR_REF:
        return basicSetVarRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.GET__VAR:
        return getVar();
      case BrowserAutomationPackage.GET__ELEMENT:
        return getElement();
      case BrowserAutomationPackage.GET__ORDER:
        return getOrder();
      case BrowserAutomationPackage.GET__ATTR:
        return getAttr();
      case BrowserAutomationPackage.GET__ATTR_VAL:
        return getAttrVal();
      case BrowserAutomationPackage.GET__ATTR_VAR:
        return getAttrVar();
      case BrowserAutomationPackage.GET__VAR_REF:
        return getVarRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.GET__VAR:
        setVar((Variable)newValue);
        return;
      case BrowserAutomationPackage.GET__ELEMENT:
        setElement((String)newValue);
        return;
      case BrowserAutomationPackage.GET__ORDER:
        setOrder((Order)newValue);
        return;
      case BrowserAutomationPackage.GET__ATTR:
        setAttr((String)newValue);
        return;
      case BrowserAutomationPackage.GET__ATTR_VAL:
        setAttrVal((String)newValue);
        return;
      case BrowserAutomationPackage.GET__ATTR_VAR:
        setAttrVar((VarReference)newValue);
        return;
      case BrowserAutomationPackage.GET__VAR_REF:
        setVarRef((VarReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.GET__VAR:
        setVar((Variable)null);
        return;
      case BrowserAutomationPackage.GET__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case BrowserAutomationPackage.GET__ORDER:
        setOrder((Order)null);
        return;
      case BrowserAutomationPackage.GET__ATTR:
        setAttr(ATTR_EDEFAULT);
        return;
      case BrowserAutomationPackage.GET__ATTR_VAL:
        setAttrVal(ATTR_VAL_EDEFAULT);
        return;
      case BrowserAutomationPackage.GET__ATTR_VAR:
        setAttrVar((VarReference)null);
        return;
      case BrowserAutomationPackage.GET__VAR_REF:
        setVarRef((VarReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BrowserAutomationPackage.GET__VAR:
        return var != null;
      case BrowserAutomationPackage.GET__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case BrowserAutomationPackage.GET__ORDER:
        return order != null;
      case BrowserAutomationPackage.GET__ATTR:
        return ATTR_EDEFAULT == null ? attr != null : !ATTR_EDEFAULT.equals(attr);
      case BrowserAutomationPackage.GET__ATTR_VAL:
        return ATTR_VAL_EDEFAULT == null ? attrVal != null : !ATTR_VAL_EDEFAULT.equals(attrVal);
      case BrowserAutomationPackage.GET__ATTR_VAR:
        return attrVar != null;
      case BrowserAutomationPackage.GET__VAR_REF:
        return varRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (element: ");
    result.append(element);
    result.append(", attr: ");
    result.append(attr);
    result.append(", attrVal: ");
    result.append(attrVal);
    result.append(')');
    return result.toString();
  }

} //GetImpl
