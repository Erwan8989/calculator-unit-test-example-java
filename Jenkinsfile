pipeline {
    agent any

    tools {
        maven 'Maven' // Utilise la version par défaut de Maven
        jdk 'JDK' // Utilise la version par défaut de JDK
    }

    stages {
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SonarQube analysis') {
        steps {
            script {
                def scannerHome = tool 'Sonar 1'
                withSonarQubeEnv('Sonar 1') {
                    sh """
                    ${scannerHome}/bin/sonar-scanner \
                    -Dsonar.login=sqa_801b0b467b976971ad38a440a26f933b4b1882c9 \
                    -Dsonar.projectKey=TP-integration-continue \
                    -Dsonar.sources=src \
                    -Dsonar.java.binaries=target/classes
                    """
                }
            }
        }
    }

    }
    post {
        always {
            cleanWs()
        }
    }
}
