pipeline {
    agent any

    tools {
        maven 'Maven' // Utilise la version par défaut de Maven
        jdk 'JDK' // Utilise la version par défaut de JDK
    }

    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SonarQube analysis') {
            steps {
                script {
                    // Exécute SonarQube Scanner avec les paramètres nécessaires
                    //def scannerHome = tool 'SonarQube Scanner';
                    withSonarQubeEnv('Sonar 1') {
                        sh "/opt/sonarqube"
                    }
                }
            }
        }
    }
}