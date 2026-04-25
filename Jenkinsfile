pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/vamsipraneeth115/devopspg1.git'
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Results') {
            steps {
                junit '*/target/surefire-reports/.xml'
            }
        }

        stage('Gradle Build') {
            steps {
                bat 'gradle build'
            }
        }

        stage('Run App') {
            steps {
                bat 'gradle run'
            }
        }
    }
}
