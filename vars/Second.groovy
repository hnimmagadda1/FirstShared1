def call(){
    ["git", "clone", "https://github.com/arnaud-deprez/demo-jenkins-pipeline-gradle.git",  "/Baseline/Package/Logistics/"].execute()
    sh "./gradlew clean build -x test"
}