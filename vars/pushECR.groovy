def call(String imageName, String accountId, String region) {

    sh """
    aws ecr get-login-password --region ${region} | \
    docker login --username AWS --password-stdin \
    ${accountId}.dkr.ecr.${region}.amazonaws.com

    docker tag ${imageName}:latest \
    ${accountId}.dkr.ecr.${region}.amazonaws.com/${imageName}:latest

    docker push \
    ${accountId}.dkr.ecr.${region}.amazonaws.com/${imageName}:latest
    """
}
