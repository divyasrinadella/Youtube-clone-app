def call() {
  withsonarQubeEnv('sonar-scanner') {
      sh '''$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=Netflix \
      -Dsonar.projectkey=Netflix '''
  }
}

  
