def a = 9
def b = 6
def c = 7
def d = 5
def getInputs(){
  timeout(time:10, unit:'MINUTES'){
  selectedInputs = input(
  id:'Proceed', message: 'choose', parameters:[
    [$class: 'StringParameterDefinition', defaultValue:"${javaOpts}", description:'Environemnt', name:'javOpts'],
    [$class: 'StringParameterDefinition', defaultValue:"${replicaCount}", description:'No of Pods', name:'repCount']])
  }
}
node{
  getInputs()
if (a > b){
  javaOpts= "Testing Options for Java"
  replicaCount="4"
}
  javaOpts = "{selectedInputs['javOpts']}"
  replicaCount = "{selectedInputs['repCount']}"
  println ("Using these selected inputs:\n" + selectedInputs)
  
    if (d < c){
    javaOpts="${javaOpts}"
    replicaCount="${replicaCount}"
    println("Java Option from shell: $javaOpts")
    println("Replica Count from shell: $replicaCount")
    
  }
  //println("Java Option from shell: $javaOpts")
  //println("Replica Count from shell: $replicaCount")
  }

