/*
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.imt.fil.dsl.ui.internal.DslActivator;

public class BrowserAutomationUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.xtext.imt.fil.dsl.BrowserAutomation");
	}

}