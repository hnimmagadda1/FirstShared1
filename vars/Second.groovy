def call(){
    //def PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
    gitCheckOut("https://github.com/arnaud-deprez/demo-jenkins-pipeline-gradle.git", "master", "First")


       // compileSource("${PIPELINE_PROPS["PROJECT_NAME"]}",
          //      "${PIPELINE_PROPS["BUILD_COMMAND"]}",
           //     "${PIPELINE_PROPS["CLASSIFIER"]}", "${PIPELINE_PROPS["GRADLE_VERSION"]}")
}