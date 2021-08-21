def a = 1
def b = 2
def appName=""
def getInputs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "No", description: 'Make decision', name:'updateValues']
  ])
return(selectedInputs)    
}
    node{
      getInputs()
      if (a<b){
      selectedInputs['name'] = "yes"
      newChoice = "${selectedInputs['name']}"
      echo "${selectedInputs['name']}"
      println (newChoice)
      echo "$newChoice"
      echo "${newChoice}"
      appName = "${selectedInputs['updateValues']}"
      
      }
    }
