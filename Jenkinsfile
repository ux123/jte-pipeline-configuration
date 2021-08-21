def a = 1
def b = 2
def appName=""
def getInputs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "no", description: 'Make decision', name:'updateValues'],
  [$class: 'ChoiceParameterDefinition', choices: "no\nYes", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
}
    node{
      
      stage('Something cooking'){
      getInputs()
      if ("${getInputs.selectedInputs['module']}"=="no"){
      appName = "${getInputs.selectedInputs['updateValues']}"
       println (appName)
      getInputs.selectedInputs['name'] = "yes"
      newChoice = "${getInputs.selectedInputs['name']}"
      echo "${getInputs.selectedInputs['name']}"
      println (newChoice)
      echo "$newChoice"
      echo "${newChoice}" 
      }
      }
    }
