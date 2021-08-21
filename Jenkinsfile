def a =1
def b =2
def getEnvs(){
  timeout(time:10,unit:'MINUTES'){
      selectedEnvs = input(
  id: 'Proceed', message:'Choose value', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "NO\nYES", description: 'Make decision', name:'updateValues']
  ])
  return(selectedEnvs)  
  }
}
def getInputs(){
  timeout(time:60,unit:'MINUTES'){
      selectedInputs = input(
  id: 'Proceed', message:"Choose module", parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "sing", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
  }
}
  node{
      
      stage('Something cooking'){
      getInputs()
      if (a<b){
      selectedInputs['module'] = "yes"
      newChoice = "${selectedInputs['module']}"
      //echo "input : ${selectedInputs['module']}"
      echo "new choice: ${newChoice}" 
      }
      }
    }
    

