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
package com.windowtester.runtime.gef.internal;

import com.windowtester.runtime.gef.internal.finder.GEFFinder;

/**
 * A facade for access to core WindowTester GEF support features.
 *
 */
public class GEF {

	//TODO: consider renaming this class
	
	public static IGEFFinder getFinder() {
		return GEFFinder.getDefault();
	}
		
}
