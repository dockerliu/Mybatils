package com.liu.pojo;

import lombok.Data;

import java.text.DateFormat;

@Data
public class Books {
    private int BookId;
    private  String BarCode;
    private String BookName;
    private String Author;
    private Publishers publishers;
    private DateFormat PublishDate;
    private Categories categories;
    private int UnitPrice;
    private String BookImage;
    private int BookCount;
    private int Remainder;
    private String BookPosition;
    private DateFormat RegTime;
}
