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

package spoon.processing;

import org.apache.log4j.Level;
import spoon.compiler.Environment;

/**
 * Enumeration that specifies the severity of the message reported by processors
 *
 * @see Environment#report(Processor, Severity,
 * spoon.reflect.declaration.CtElement, String)
 */
@Deprecated
public enum Severity {
	/**
	 * Error-level severity.
	 */
	ERROR(Level.ERROR),
	/**
	 * Warning-level severity.
	 */
	WARNING(Level.WARN),
	/**
	 * Message-level severity.
	 */
	MESSAGE(Level.INFO);

	private Level level;

	Severity(Level level) {
		this.level = level;
	}

	public Level toLevel() {
		return level;
	}
}
