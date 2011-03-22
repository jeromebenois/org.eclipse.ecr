/*
 * Copyright (c) 2006-2011 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 * $Id$
 */

package org.eclipse.ecr.convert.api;

public class ConverterNotAvailable extends ConversionException {

    private static final long serialVersionUID = 1L;

    public ConverterNotAvailable(String message) {
        super("Converter " + message + " is not available");
    }

}
