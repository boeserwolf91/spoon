/* 
 * Spoon - http://spoon.gforge.inria.fr/
 * Copyright (C) 2006 INRIA Futurs <renaud.pawlak@inria.fr>
 * 
 * This software is governed by the CeCILL-C License under French law and
 * abiding by the rules of distribution of free software. You can use, modify 
 * and/or redistribute the software under the terms of the CeCILL-C license as 
 * circulated by CEA, CNRS and INRIA at http://www.cecill.info. 
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *  
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C license and that you accept its terms.
 */

package spoon.reflect.visitor.filter;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.Filter;

/**
 * This simple filter matches all the accesses to a given executable or any
 * executable that overrides it.
 */
public class InvocationFilter implements Filter<CtInvocation<?>> {
	
	private CtExecutableReference<?> executable;

	/**
	 * Creates a new invocation filter.
	 * 
	 * @param executable
	 *            the executable to be tested for being invoked
	 */
	public InvocationFilter(CtExecutableReference<?> executable) {
		this.executable = executable;
	}

	@Override
	public boolean matches(CtInvocation<?> invocation) {
		return invocation.getExecutable().isOverriding(executable);
	}
}