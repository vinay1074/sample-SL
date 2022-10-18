#!/usr/bin/env groovy
package com.sampleSL

class mavn2 {
   String name
   Integer age
    def call () {
        git "${age}"
        mvn clean package
}
}
