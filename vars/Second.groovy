def call(){
    def PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
    gitCheckOut("${PIPELINE_PROPS["REPO_URL"]}", "$params.Branch", "${PIPELINE_PROPS["PROJECT_NAME"]}")
    //Compile build as per module defined in reading from pipeline.property file

        compileSource("${PIPELINE_PROPS["PROJECT_NAME"]}",
                "${PIPELINE_PROPS["BUILD_COMMAND"]}",
                "${PIPELINE_PROPS["CLASSIFIER"]}", "${PIPELINE_PROPS["GRADLE_VERSION"]}")
}