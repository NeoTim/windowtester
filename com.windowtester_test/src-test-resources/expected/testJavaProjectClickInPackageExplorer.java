/*******************************************************************************
 *  Copyright (c) 2012 Google, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Google, Inc. - initial API and implementation
 *******************************************************************************/
package expected;

import com.windowtester.runtime.swt.UITestCaseSWT;
import com.windowtester.runtime.swt.locator.MenuItemLocator;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swt.condition.shell.ShellShowingCondition;
import com.windowtester.runtime.swt.locator.FilteredTreeItemLocator;
import com.windowtester.runtime.swt.locator.ButtonLocator;
import com.windowtester.runtime.swt.condition.shell.ShellDisposedCondition;
import com.windowtester.runtime.swt.locator.TreeItemLocator;
import com.windowtester.runtime.swt.locator.eclipse.ViewLocator;

public class testJavaProjectClickInPackageExplorer extends UITestCaseSWT {

	/**
	 * Main test method.
	 */
	public void testtestJavaProjectClickInPackageExplorer() throws Exception {
		IUIContext ui = getUI();
		ui.click(new MenuItemLocator("File/New/Project..."));
		ui.wait(new ShellShowingCondition("New Project"));
		ui.click(new FilteredTreeItemLocator("Java")); // ? only generated if not expanded
		ui.enterText("+"); // ? only generated if not expanded
		ui.click(new FilteredTreeItemLocator("Java/Java Project"));
		ui.click(new ButtonLocator("&Next >"));
		ui.enterText("EclipseRecorderSmokeTest_JPClickTestProject");
		ui.click(new ButtonLocator("&Finish"));
		ui.wait(new ShellDisposedCondition("New Java Project"));
		ui.click(new TreeItemLocator(
				"EclipseRecorderSmokeTest_JPClickTestProject", new ViewLocator(
						"org.eclipse.jdt.ui.PackageExplorer")));
	}

}