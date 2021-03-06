/*
 * PwnFilter -- Regex-based User Filter Plugin for Bukkit-based Minecraft servers.
 * Copyright (c) 2013 Pwn9.com. Tremor77 <admin@pwn9.com> & Sage905 <patrick@toal.ca>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 */

package com.pwn9.PwnFilter.util;

import com.pwn9.PwnFilter.PwnFilter;
import org.bukkit.ChatColor;

/**
 * Simple helper to get default messages from the PwnFilter config.yml
 * User: ptoal
 * Date: 13-10-01
 * Time: 3:56 PM
 */

public class DefaultMessages {

    /**
     * Selects string from the first not null of: message, default from config.yml or null.
     * Converts & to u00A7
     * Used by Action.init() methods.
     * @return String containing message to be used.
     */
    public static String prepareMessage(String message, String configVarName) {
        String result;
        if ( message == null || message.isEmpty()) {
            String defmsg = PwnFilter.getInstance().getConfig().getString(configVarName);
            result = (defmsg != null) ? defmsg : "";
        } else {
            result = message;
        }
        return ChatColor.translateAlternateColorCodes('&',result);
    }

}
