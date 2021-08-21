def environment = ['dev', 'test']
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "No\nYes", description: 'Make decision', name:'updateValues']
  ])
  return(selectedEnvs)  
}
}
def getInputs(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:"Select for ${env}", parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "sing", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
}
}
    node{
      stage('Something cooking'){
      getEnvs()
      getInputs
      if (selectedEnvs['updateValues'] == "yes"){
        for (env in environment){
          selectedInputs['module'] == "dance"
      defaultInput = "${selectedInputs['module']}"
      echo "default input: ${defaultInput}" 
        }
      }
      }
    }
