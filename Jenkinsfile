def a = 1
def b = 2
def getInputs(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "no", description: 'Make decision', name:'updateValues'],
  [$class: 'ChoiceParameterDefinition', choices: "dance\nsing", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
}
}
    node{
      
      stage('Something cooking'){
      getInputs()
      if (a<b){
      selectedInputs['defaultValue'] = "walk"
      newChoice = "${selectedInputs['defaultValue']}"
      echo "name: ${selectedInputs['defaultValue']}"
      echo "new choice: ${newChoice}" 
      }
      }
    }
