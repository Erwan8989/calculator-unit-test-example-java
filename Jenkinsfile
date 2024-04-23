pipeline {
    agent any

    tools {
        maven 'Maven' // Utilise la version par défaut de Maven
        jdk 'JDK' // Utilise la version par défaut de JDK
        // Ajoutez ici la configuration de SonarQube Scanner si nécessaire
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
                    // Exécutez SonarQube Scanner avec les paramètres nécessaires
                    withSonarQubeEnv('Sonar 1') {
                        sh 'sonar-scanner'
                    }
                }
            }
        }
    }
}
