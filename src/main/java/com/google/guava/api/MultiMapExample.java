/*
 * Copyright (c) 2015, Xemoc and/or its affiliates. All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 	- Redistributions of source code must retain the above copyright
 * 	  notice, this list of conditions and the following disclaimer.
 *
 * 	- Redistributions in binary form must reproduce the above copyright
 * 	  notice, this list of conditions and the following disclaimer in the
 * 	  documentation and/or other materials provided with the distribution.
 *
 * 	- Neither the name of Oracle or the names of its
 * 	  contributors may be used to endorse or promote products derived
 * 	  from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.google.guava.api;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

/**
 * @author ajay
 */
public class MultiMapExample {

    public static void main(String args[]) {
        Multimap<String, String> multimap = ArrayListMultimap.create();

        // Adding some key/value

        multimap.put("Fruits", "Bannana");
        multimap.put("Fruits", "Apple");
        multimap.put("Fruits", "Pear");
        multimap.put("Vegetables", "Carrot");

        // Getting the size

        int size = multimap.size();
        System.out.println("size of the map is : "+size);  // 4

        // Getting values

        Collection<String> fruits = multimap.get("Fruits");
        System.out.println(fruits); // [Bannana, Apple, Pear]

        Collection<String> vegetables = multimap.get("Vegetables");
        System.out.println(vegetables); // [Carrot]

        // Iterating over entire Mutlimap
        for (String value : multimap.values()) {
            System.out.println(value);
        }

        // Removing a single value
        multimap.remove("Fruits", "Pear");
        System.out.println(multimap.get("Fruits")); // [Bannana, Pear]

        // Remove all values for a key
        multimap.removeAll("Fruits");
        System.out.println(multimap.get("Fruits")); // [] (Empty Collection!)
    }
}
