def a = 1
def b = 2
def getEnvs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "No", description: 'Make decision', name:'updateValues'
  ])
return(selectedEnv)    
}
    node{
      if (a<b){
      selectedInputs['updteValues'] = "yes"
      newChoice = "${selectedInputs['updteValues']}"
        echo "${selectedInputs['updteValues']}"
        print (newChoice)
        echo "$newChoice
        echo "${newChoice}"
      }
    }
