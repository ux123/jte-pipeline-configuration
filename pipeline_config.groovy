def scmVars
def jobBranch
def shortCommit
@merge libraries{
  sonarqube{   
    test
    newDate = "date"
    newertDate = "{pipelineConfig.jobBranch}"
  }
  gradle
  maven
}
