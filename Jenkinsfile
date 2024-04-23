pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/bin/java'
    }

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
    }
}