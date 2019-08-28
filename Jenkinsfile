pipeline {
  agent any
  stages {
    stage('pull') {
      steps {
        git(url: 'https://github.com/dkozhinov/AlgorithmsJava.git', branch: 'master')
        bat 'echo Hello!'
      }
    }
  }
}