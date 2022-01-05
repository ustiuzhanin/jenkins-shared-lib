def call(repo, environment) {
  return "${ECR_DOMAIN}/${repo}:${environment}-GIT_COMMIT"
}