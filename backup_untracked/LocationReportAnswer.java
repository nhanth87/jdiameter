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

package org.jdiameter.api.slh.events;

import org.jdiameter.api.app.AppAnswerEvent;

/**
 * The Location-Report-Answer (LRA) command, indicated by the Command-Code field set to 8388621 
 * and the "R" bit cleared in the Command Flags field, is sent by the GMLC to the MME 
 * or SGSN in response to the Location-Report-Request command.
 * 
 * As per 3GPP TS 29.173 (via SLh interface for certain scenarios).
 *
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public interface LocationReportAnswer extends AppAnswerEvent {

  String _SHORT_NAME = "LRA";
  String _LONG_NAME = "Location-Report-Answer";

  int code = 8388621;

}
