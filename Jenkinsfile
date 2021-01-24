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
                    sh 'mvn -Dtest=UnitTestsSuite test'
                }
            }
        }
        stage('Integration Testing'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn -Dtest=IntegrationsTestsSuite test'
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