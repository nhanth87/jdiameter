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

package org.jdiameter.common.impl.app.slg;

import org.jdiameter.api.Answer;
import org.jdiameter.api.Request;
import org.jdiameter.api.slg.events.LocationAnswer;
import org.jdiameter.common.impl.app.AppRequestEventImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public class LocationAnswerImpl extends AppRequestEventImpl implements LocationAnswer {

  private static final long serialVersionUID = 1L;

  protected static final Logger logger = LoggerFactory.getLogger(LocationAnswerImpl.class);

  public LocationAnswerImpl(Answer answer) {
    super(answer);
  }

  public LocationAnswerImpl(Request request, long resultCode) {
    super(request.createAnswer(resultCode));
  }

  @Override
  public org.jdiameter.api.Avp getResultCodeAvp() throws org.jdiameter.api.AvpDataException {
    return null;
  }

}
