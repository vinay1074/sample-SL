#!/usr/bin/env groovy
package com.sampleSL

class mavn1 {
   String test
   //Integer age
      def SCM (String name) {
           git "${name}"
           this.test = name
}
}