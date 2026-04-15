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

package org.jdiameter.api.slg;

import org.jdiameter.api.app.AppSession;

/**
 * Base SLg Session interface for 3GPP SLg Diameter Application (3GPP TS 29.172).
 * The SLg interface is used between the GMLC and the MME/SGSN for location services.
 *
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public interface SLgSession extends AppSession {

  /**
   * Application-Id for 3GPP SLg Application (16777255)
   */
  int SLG_APPLICATION_ID = 16777255;

  /**
   * Vendor-Id for 3GPP (10415)
   */
  int _3GPP_VENDOR_ID = 10415;

}
