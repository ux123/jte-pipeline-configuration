echo "I am the second branch"
echo "using current build method: ${currentBuild.projectName}"
name= currentBuild.projectName
echo "project name from var: $name"
if (env.JOB_NAME== "choice_multi/subbranch"){
  println"Yes! $name!!!"
  
}
if (env.JOB_NAME == currentBuild.projectName){
  println"Yes! $name!!!"
  
}
