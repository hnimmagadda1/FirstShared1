def call(){
    checkout("https://github.com/arnaud-deprez/demo-jenkins-pipeline-gradle.git", master, NewDir )
    sh "./gradlew clean build -x test"
}