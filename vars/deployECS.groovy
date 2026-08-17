def call(String clusterName, String serviceName) {

    sh """
    aws ecs update-service \
      --cluster ${clusterName} \
      --service ${serviceName} \
      --force-new-deployment
    """
}
