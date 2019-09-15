node {
  stage('SCM Checkout'){
    git 'https://github.com/mallikarjunareddy3333/Todo_API'
  }
  state('Compile-Package'){
    sh 'mvn package'
  }
}
