#!/usr/bin/env groovy
package com.sampleSL

class mavn1 {
   String test
   //Integer age
      def SCM (String name) {
           script {
            git "${name}"
           }
           this.test = name
}
}