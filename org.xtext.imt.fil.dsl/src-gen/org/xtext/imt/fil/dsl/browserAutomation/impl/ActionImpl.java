/**
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl.browserAutomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.imt.fil.dsl.browserAutomation.Action;
import org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage;
import org.xtext.imt.fil.dsl.browserAutomation.Get;
import org.xtext.imt.fil.dsl.browserAutomation.VarReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.ActionImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.xtext.imt.fil.dsl.browserAutomation.impl.ActionImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getGet() <em>Get</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGet()
   * @generated
   * @ordered
   */
  protected Get get;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VarReference var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return BrowserAutomationPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Get getGet()
  {
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGet(Get newGet, NotificationChain msgs)
  {
    Get oldGet = get;
    get = newGet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.ACTION__GET, oldGet, newGet);
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
  public void setGet(Get newGet)
  {
    if (newGet != get)
    {
      NotificationChain msgs = null;
      if (get != null)
        msgs = ((InternalEObject)get).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.ACTION__GET, null, msgs);
      if (newGet != null)
        msgs = ((InternalEObject)newGet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.ACTION__GET, null, msgs);
      msgs = basicSetGet(newGet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.ACTION__GET, newGet, newGet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarReference getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(VarReference newVar, NotificationChain msgs)
  {
    VarReference oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.ACTION__VAR, oldVar, newVar);
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
  public void setVar(VarReference newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.ACTION__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserAutomationPackage.ACTION__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserAutomationPackage.ACTION__VAR, newVar, newVar));
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
      case BrowserAutomationPackage.ACTION__GET:
        return basicSetGet(null, msgs);
      case BrowserAutomationPackage.ACTION__VAR:
        return basicSetVar(null, msgs);
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
      case BrowserAutomationPackage.ACTION__GET:
        return getGet();
      case BrowserAutomationPackage.ACTION__VAR:
        return getVar();
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
      case BrowserAutomationPackage.ACTION__GET:
        setGet((Get)newValue);
        return;
      case BrowserAutomationPackage.ACTION__VAR:
        setVar((VarReference)newValue);
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
      case BrowserAutomationPackage.ACTION__GET:
        setGet((Get)null);
        return;
      case BrowserAutomationPackage.ACTION__VAR:
        setVar((VarReference)null);
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
      case BrowserAutomationPackage.ACTION__GET:
        return get != null;
      case BrowserAutomationPackage.ACTION__VAR:
        return var != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
