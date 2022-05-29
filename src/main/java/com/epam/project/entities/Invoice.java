package com.epam.project.entities;

import java.io.Serializable;
import java.sql.Timestamp;

public class Invoice implements Serializable {
    private Integer id;
    private Integer code;
    private String name;
    private Boolean isPaid;
    private InvoiceStatus status;
    private Timestamp date;

}
