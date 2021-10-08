def scmVars
def jobBranch
def shortCommit
@merge libraries{
  sonarqube{   
    test
    newDate = "date"
    newertDate = "${config.newDate}"
  }
  gradle
  maven
}
