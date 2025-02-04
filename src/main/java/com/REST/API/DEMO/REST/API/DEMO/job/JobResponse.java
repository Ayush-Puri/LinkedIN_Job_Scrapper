/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.REST.API.DEMO.REST.API.DEMO.job;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ayushpuri
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class JobResponse {

    private boolean success;
    private String message;
    private List<Datum> data;
    private int total;
}
