package com.example.gupao.principle.celve2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MsgResult {
    private int code;
    private String msg;
    private Object data;
}
