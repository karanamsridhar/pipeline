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
        stage('Testing'){
            steps {
                withMaven(maven: 'Maven-3.6.3.1'){
                    sh 'mvn test'
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