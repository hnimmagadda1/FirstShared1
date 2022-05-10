def call(){
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/arnaud-deprez/demo-jenkins-pipeline-gradle.git']]])
    sh './gradlew clean build'
}