/**
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl;

import org.xtext.imt.fil.dsl.BrowserAutomationStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BrowserAutomationStandaloneSetup extends BrowserAutomationStandaloneSetupGenerated {
  public static void doSetup() {
    new BrowserAutomationStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
