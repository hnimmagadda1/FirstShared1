def call(final String ScmURL, String BranchName, String DirName) {
    checkout([$class           : 'GitSCM',
              branches         : [[name: "$BranchName"]],
              extensions       : [[$class: 'CloneOption', timeout: 60,]],
              extensions       : [[$class: 'RelativeTargetDirectory', relativeTargetDir: CUSTOM_WORKSPACE + "$DirName" + "${env.JOB_BASE_NAME}"]],
              userRemoteConfigs: [[credentialsId: None, url: "$ScmURL"]]])
}