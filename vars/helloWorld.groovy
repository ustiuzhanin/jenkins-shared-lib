def call() {
  sh 'echo Hello World'
  sh 'env'
  sh 'echo $DOCKER_BUILDKIT'
}