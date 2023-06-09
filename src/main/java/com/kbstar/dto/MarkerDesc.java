package com.kbstar.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MarkerDesc {
    private int id;
    private int marker_id;
    private String item;
    private double price;
    private String imgname;
}
