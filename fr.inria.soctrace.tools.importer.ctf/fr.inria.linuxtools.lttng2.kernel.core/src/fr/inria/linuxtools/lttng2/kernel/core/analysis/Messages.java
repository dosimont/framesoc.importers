/*******************************************************************************
 * Copyright (c) 2014 École Polytechnique de Montréal
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Geneviève Bastien - Initial API and implementation
 *******************************************************************************/

package fr.inria.linuxtools.lttng2.kernel.core.analysis;

import org.eclipse.osgi.util.NLS;

/**
 * Externalized message strings from the LTTng Kernel Analysis
 *
 * @author Geneviève Bastien
 * @since 3.0
 */
@SuppressWarnings("javadoc")
public class Messages extends NLS {
    private static final String BUNDLE_NAME = "fr.inria.linuxtools.lttng2.kernel.core.analysis.messages"; //$NON-NLS-1$

    public static String LttngKernelAnalysisModule_Help;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
