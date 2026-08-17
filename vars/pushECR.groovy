def call() {
    sh '''
    aws ecr get-login-password --region ap-south-2 | \
    docker login --username AWS --password-stdin \
    641134884964.dkr.ecr.ap-south-2.amazonaws.com

    docker tag bankapp:latest \
    641134884964.dkr.ecr.ap-south-2.amazonaws.com/bankapp:latest

    docker push \
    641134884964.dkr.ecr.ap-south-2.amazonaws.com/bankapp:latest
    '''
}
