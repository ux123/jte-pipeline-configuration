def a = 1
def b = 2
def appName=""
def getInputs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "no", description: 'Make decision', name:'updateValues']
  ])
  return(selectedInputs)  
}
    node{
      
      stage('Something cooking'){
      getInputs()
      if ("${selectedInputs[updateValues]}"=="no"){
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
