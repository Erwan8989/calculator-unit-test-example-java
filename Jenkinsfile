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
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}