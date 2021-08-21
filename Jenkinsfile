def a = 1
def b = 2
def appName=""
def getInputs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "No", description: 'Make decision', name:'updateValues']
  ])
    
}
    node{
      
      stage('Something cooking'){
      getInputs()
      currentBuild.Description = "${selectedInputs['updateValues']}"
      if (a<b){
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
