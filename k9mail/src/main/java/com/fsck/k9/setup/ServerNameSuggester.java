package com.fsck.k9.setup;


import com.fsck.k9.mail.ServerSettings.Type;


public class ServerNameSuggester {
    public String suggestServerName(Type serverType, String domainPart) {
        switch (serverType) {
            case IMAP: {
                return "mail." + domainPart;
            }
            case SMTP: {
                return "mail." + domainPart;
            }
            case WebDAV: {
                return "exchange." + domainPart;
            }
            case POP3: {
                return "mail." + domainPart;
            }
        }

        throw new AssertionError("Missed case: " + serverType);
    }
}
