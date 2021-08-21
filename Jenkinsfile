def a = 1
def b = 2
def getEnvs(){
  timeout(time:2,unit:"MINUTES"){
selectedEnvs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'ChoiceParameterDefinition', choices: "no\nyes", description: 'Make decision', name:'updateValues'],
  [$class: 'ChoiceParameterDefinition', choices: "dance\nsing", description: 'Make decision', name:'module']

  ])
  return(selectedEnvs)  
}
}

def getInputs(){
  timeout(time:2,unit:"MINUTES"){
selectedInputs = input(
  id: 'Proceed', message:'Choose something', parameters: [
  [$class: 'StringParameterDefinition', defaultValue: "some java option", description: 'Make decision', name:'javaOpts'],
  [$class: 'StringParameterDefinition', defaultValue: "1", description: 'Make decision', name:'replicaCount']

  ])
  return(selectedInputs)  
}
}
    node{
      
      stage('Something cooking'){
      getEnvs()
      getInputs()
        if ("${selectedEnvs}['updateValues']" == "yes"){
            if("${selectedEnvs}['module']" == "sing"){
            
            selectedInputs['javaOpts'] = "the set default java option"
            selectedInputs['replicaCount'] = "2"
            newJavaOption = "${selectedInputs['javaOpts']}"
            newReplicaCount = "${selectedInputs['replicaCount']}"
            echo "selected value: ${selectedEnvs['updateValues']}"
            echo "selected module : ${selectedEnvs['module']}"
            echo "new java option: ${newJavaOption}"
            echo "new replica count: ${newReplicaCount}"  
          }
       
      }
      }
    }








