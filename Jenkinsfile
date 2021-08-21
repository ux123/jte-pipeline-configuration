def a = 1
def b = 2
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "no\nyes", description: 'Make decision', name:'updateValues'],
  [$class: 'ChoiceParameterDefinition', choices: "dance\nsing", description: 'Make decision', name:'module']

  ])
  return(selectedEnvs)  
}
}

def getInputss(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "some java option", description: 'Make decision', name:'javaOpts'],
  [$class: 'StringParameterDefinition', defaultValue: "1", description: 'Make decision', name:'replicaCount']

  ])
  return(selectedInputs)  
}
}
    node{
      
      stage('Something cooking'){
      getEnvs()
      if (a<b){
      selectedEnvs['updateValues'] = "maybe"
      newChoice = "${selectedEnvs['updateValues']}"
      //echo "input : ${selectedEnvs['updateValues']}"
      echo "new choice: ${newChoice}" 
      }
      }
    }








