def scmVars
def jobBranch
def shortCommit
@merge libraries{
  sonarqube{   
    test
    docker_branch2
  }
  gradle
  maven
}
