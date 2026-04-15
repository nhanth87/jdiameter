/*
 *
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2024, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.jdiameter.common.api.app.slh;

import org.jdiameter.api.app.StateChangeListener;
import org.jdiameter.api.slh.ClientSLhSession;
import org.jdiameter.api.slh.ClientSLhSessionListener;
import org.jdiameter.api.slh.ServerSLhSession;
import org.jdiameter.api.slh.ServerSLhSessionListener;
import org.jdiameter.common.api.app.IAppSessionFactory;

/**
 * SLh Session Factory interface for creating SLh client and server sessions.
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public interface SLhSessionFactory extends IAppSessionFactory {

  /**
   * Get stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
   * However clustered session use this value when recreated!
   *
   * @return the serverSessionListener
   */
  ServerSLhSessionListener getServerSessionListener();

  /**
   * Set stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
   * However clustered session use this value when recreated!
   *
   * @param serverSessionListener the serverSessionListener to set
   */
  void setServerSessionListener(ServerSLhSessionListener serverSessionListener);

  /**
   * Get stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
   * However clustered session use this value when recreated!
   *
   * @return the clientSessionListener
   */
  ClientSLhSessionListener getClientSessionListener();

  /**
   * Set stack wide listener for sessions. In local mode it has similar effect as setting this directly in app session.
   * However clustered session use this value when recreated!
   *
   * @param clientSessionListener the clientSessionListener to set
   */
  void setClientSessionListener(ClientSLhSessionListener clientSessionListener);

  /**
   * @return the messageFactory
   */
  ISLhMessageFactory getMessageFactory();

  /**
   * @param messageFactory the messageFactory to set
   */
  void setMessageFactory(ISLhMessageFactory messageFactory);

  /**
   * @return the stateListener
   */
  StateChangeListener getStateListener();

  /**
   * @param stateListener the stateListener to set
   */
  void setStateListener(StateChangeListener stateListener);

  /**
   * Create a new client SLh session
   *
   * @return a new client SLh session
   */
  ClientSLhSession getNewClientSession();

  /**
   * Create a new server SLh session
   *
   * @return a new server SLh session
   */
  ServerSLhSession getNewServerSession();

}
