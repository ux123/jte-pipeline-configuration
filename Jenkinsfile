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
      if (a<b){
      getInputs()
      
      appName = "${selectedInputs['updateValues']}"
      
      }
    }
