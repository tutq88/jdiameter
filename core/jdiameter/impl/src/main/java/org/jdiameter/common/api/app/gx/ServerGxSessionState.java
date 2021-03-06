/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jdiameter.common.api.app.gx;

import org.jdiameter.common.api.app.IAppSessionState;

/**
 * Diameter Gx Server states
 * 
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a> 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a> 
 */
public enum ServerGxSessionState implements IAppSessionState<ServerGxSessionState> {

  IDLE(0),
  OPEN(1);

  private int stateRepresentation = -1;

  ServerGxSessionState(int v) {
    this.stateRepresentation=v;
  }

  public ServerGxSessionState fromInt(int v) throws IllegalArgumentException {
    switch(v)
    {
    case 0:
      return IDLE;

    case 1:
      return OPEN;

    default:
      throw new IllegalArgumentException("Illegal value of int representation!!!!");
    }
  }

  public int getValue() {
    return stateRepresentation;
  }

}
