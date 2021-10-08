def scmVars
def jobBranch
def shortCommit
@merge libraries{
  sonarqube{   
    test
    newDate = "date"
    newertDate = "${newDate}"
  }
  gradle
  maven
}
