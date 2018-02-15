/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markm.jipapi;

import java.io.IOException;

/**
 *
 * @author markl
 */
public class Jpaipi_test {

    public static void main(String[] args) {

        Jipapi jip = new Jipapi();
        try {
            System.out.println(jip.Request("marklevie.com"));
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
