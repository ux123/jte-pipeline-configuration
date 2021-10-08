def scmVars
def jobBranch
def shortCommit
@merge libraries{
  sonarqube{
     docker_branch = "test"
  }
  gradle
  maven
}
