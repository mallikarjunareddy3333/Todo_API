node {
  stage('SCM Checkout'){
    git 'https://github.com/mallikarjunareddy3333/Todo_API'
  }
  stage('Compile-Package'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
