def a = 1
def b = 2
def getInputs(){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "No", description: 'Make decision', name:'updateValues']
  ])
return(selectedInputs)    
}
    node{
      if (a<b){
      getInputs()
      selectedInputs['updateValues'] = "yes"
      newChoice = "${selectedInputs['updateValues']}"
        echo "${selectedInputs['updateValues']}"
        print (newChoice)
        echo "$newChoice"
        echo "${newChoice}"
      }
    }
