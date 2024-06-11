package org.example.designpatterns.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodeMessage implements Message {
    private Message message;

    public HtmlEncodeMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
