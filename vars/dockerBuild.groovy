def call(String dockerHubUsername, String imageName) {
  sh "docker build --build-arg REACT_APP_RAPID_API_KEY=a999cf73b0msheff995319530b6dp1de10bjsn1c33561be4cf -t ${imageName} ."
  sh "docker tag $(imageName} ${dockerHubUsername}/${imageName}:latest"
  withDockerRegistry([url: 'https::/index.docker.io/v1/', credentialsId: 'docker']) {
     sh "docker push ${dockerHubUsername}/${imageName}:latest" 
 }
}

