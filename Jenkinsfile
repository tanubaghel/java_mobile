pipeline {

  agent any

  stages {

    stage('Checkout') {

      steps {

        checkout([$class: 'GitSCM',

                  branches: [[name: '*/main']],

                  userRemoteConfigs: [[url: 'https://github.com/tanubaghel/java_mobile']]])

      }

    }

    stage('Test') {

      steps {

        bat 'mvn clean install'

        bat 'mvn test -P android'

      }

    }

  }

}
