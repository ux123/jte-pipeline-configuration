def a = 1
def b = 2
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "no", description: 'Make decision', name:'updateValues']
  ])
  return(selectedEnvs)  
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


