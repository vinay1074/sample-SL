#!/usr/bin/env groovy
package com.sampleSL

class mavn2 {
   String name
   Integer age

    script {
        git "${age}";
        mvn clean package
    }
}
