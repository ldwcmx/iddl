/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
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
package com.it.iddl.idatasource.resource.adapter.jdbc.vendor;

import java.io.Serializable;
import java.sql.SQLException;

import com.it.iddl.idatasource.resource.adapter.jdbc.ExceptionSorter;


/**
 * InformixExceptionSorter.java
 * 
 * This is a basic exception sorter for the IBM INFORMIX 9.4 RDBMS. All error
 * codes are taken from the IBM INFORMIX JDBC driver programmer's guide of the 
 * 2.21.JC6 JDBC driver. 
 *
 * @author <a href="mailto:u.schroeter@mobilcom.de">Ulf Schroeter</a>
 */
public class InformixExceptionSorter implements ExceptionSorter, Serializable
{
   static final long serialVersionUID = -7135889081050258852L;

   public boolean isExceptionFatal(SQLException e)
   {
      switch (e.getErrorCode())
	  {
         case -710:   //Table has been dropped, altered or renamed JBAS-3120
         case -79716: // System or internal error
         case -79730: // Connection not established
         case -79734: // INFORMIXSERVER has to be specified
         case -79735: // Can't instantiate protocol
         case -79736: // No connection/statement established yet
         case -79756: // Invalid connection URL
         case -79757: // Invalid subprotocol
         case -79758: // Invalid IP address
         case -79759: // Invalid port nnumber
         case -79760: // Invalid database name
         case -79788: // User name must be specified
         case -79811: // Connection without user/password not supported
         case -79812: // User/password does not match with datasource
         case -79836: // Proxy error: no database connection
         case -79837: // Proxy error: IO error
         case -79879: // Unexpected exception
        
           return true;
      }

      return false;
   }

} // InformixExceptionSorter
