def call() {
  sh 'trivy image nadella143/youtube:latest > trivyimage.txt'
}
