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
                    // Récupérez l'emplacement de SonarQube Scanner
                    def scannerHome = tool 'Sonar 1'
                    // Exécutez SonarQube Scanner avec l'emplacement récupéré
                    withSonarQubeEnv('Sonar 1') {
                        sh "/opt/sonarqube"
                    }
                }
            }
        }
    }
}
