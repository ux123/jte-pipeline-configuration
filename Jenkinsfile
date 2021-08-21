def a = 1
def b = 2
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "dance\nsing", description: 'Make decision', name:'module']
  ])
  return(selectedEnvs)  
}
}
    node{
      
      stage('Something cooking'){
      getEnvs()
      if (a<b){
      selectedEnvs['updateValues'] = "yes"
      newChoice = "${selectedEnvs['updateValues']}"
      //echo "input : ${selectedEnvs['updateValues']}"
      echo "new choice: ${newChoice}" 
      }
      }
    }


