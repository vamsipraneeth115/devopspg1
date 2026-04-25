pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/vamsipraneeth115/devopspg1.git'
            }
        }

        stage('Permissions') {
            steps {
                sh 'chmod +x gradlew'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
            }
        }
    }
}
