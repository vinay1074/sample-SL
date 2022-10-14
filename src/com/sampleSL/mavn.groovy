#!/usr/bin/env groovy
package com.sampleSL

class SampleClass {
   String name
        pipeline {
        agent any
            stages {
                stage ('SCM') {
                    steps {
                        echo "SCM URL, ${name}."
                        git "${name}";
                    }
                    
                }
               stage ('Build') {
                    steps {
                        sh 'mvn clean package';
                    }
                    
                } 
            }
        }
    }

