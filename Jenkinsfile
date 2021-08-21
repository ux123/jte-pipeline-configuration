def a = 1
def b = 2
def appName=""
def getInputs(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "no", description: 'Make decision', name:'updateValues'],
  [$class: 'ChoiceParameterDefinition', choices: "no\nYes", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
}
}
    node{
      
      stage('Something cooking'){
      getInputs()
      if ("${selectedInputs['module']}"=="no"){
      appName = "${selectedInputs['updateValues']}"
      println (appName)
      selectedInputs['name'] = "yes"
      newChoice = "${selectedInputs['name']}"
      echo "${selectedInputs['name']}"
      println (newChoice)
      echo "$newChoice"
      echo "${newChoice}" 
      }
      }
    }
