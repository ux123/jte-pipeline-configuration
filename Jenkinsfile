def a =1
def b =2
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose value', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "No\nYes", description: 'Make decision', name:'updateValues']
  ])
  return(selectedEnvs)  
}
}
def getInputs(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:"Choose module", parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "sing", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
}
}
    node{
      stage('Something cooking'){
      getEnvs()
      getInputs()
        if ("${selectedEnvs['updateValues']}" == "yes"){
        if (a<b){
          selectedInputs['module'] == "dance"
      defaultInput = "${selectedInputs['module']}"
      echo "default input: ${defaultInput}" 
        }
      }
      }
    }
