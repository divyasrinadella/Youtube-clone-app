def call() {
  withSonarQubeEnv('sonar-scanner') {
      sh '''$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=Netflix \
      -Dsonar.projectkey=Netflix '''
  }
}

  
