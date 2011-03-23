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

package org.eclipse.ecr.core.model;

import org.eclipse.ecr.core.api.DocumentException;

/**
 * @author <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 *
 */
public class DocumentExistsException extends DocumentException {

    private static final long serialVersionUID = 5877553029055132076L;

    public DocumentExistsException() {
        super("The document already exists");
    }

    public DocumentExistsException(String path) {
        super("The document at '" + path + "' already exists");
    }

    public DocumentExistsException(String path, Throwable cause) {
        super("The document at '" + path + "' already exists", cause);
    }

}
