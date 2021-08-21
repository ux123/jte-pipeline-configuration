def a = 1
def b = 2
def appName=""
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
      appName = "${selectedInputs['updateValues']}"
      if (a<b){
      println "app name: $appName"
      selectedInputs['name'] = "walk"
      newChoice = "${selectedInputs['name']}"
      echo "name: ${selectedInputs['name']}"
      echo "new choice: ${newChoice}" 
      println "app name: $appName"
      }
      }
    }
