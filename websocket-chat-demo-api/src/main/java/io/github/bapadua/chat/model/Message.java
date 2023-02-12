package io.github.bapadua.chat.model;

import io.github.bapadua.chat.enums.MessageStatus;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String data;
    private MessageStatus status;
}
