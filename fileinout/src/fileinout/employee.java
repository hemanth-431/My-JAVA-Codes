/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinout;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class employee implements Serializable {
    int id;
    String name;
  transient  double salary;
}
