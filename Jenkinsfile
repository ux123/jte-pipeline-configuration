def a =1
def b =2

def getInputs(){
  timeout(time:60,unit:'MINUTES'){
      selectedInputs = input(
  id: 'Proceed', message:"Choose module", parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "sing", description: 'Make decision', name:'module']
  ])
  return(selectedInputs)  
  }
}
  node{
      
      stage('Something cooking'){
      getInputs()
      if (a<b){
      selectedInputs['module'] = "yes"
      newChoice = "${selectedInputs['module']}"
      //echo "input : ${selectedInputs['module']}"
      echo "new choice: ${newChoice}" 
      }
      }
    }
    

