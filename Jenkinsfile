pipeline {
    agent any
    stages {
        stage('Compiling'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Unit Testing'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn -Dtest=com.sridhar.pipeline.unit.tests.MessageControllerTest test'
                }
            }
        }
        stage('Integration Testing'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn -Dtest=com.sridhar.pipeline.integration.tests.MessageControllerIntegrationTest test'
                }
            }
        }
        stage('Deployment'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}