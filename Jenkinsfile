def a = 9
def b = 6
def c = 7
def d = 5
def getInputs(){
  timeout(time:10, unit:'MINUTES'){
  selectedInputs = input(
  id:'Proceed', message: 'choose', parameters:[
    [$class: 'StringParameterDefinition', defaultValue:"{javaOpts}", description:'Environemnt', name:'javaOpts'],
    [$class: 'StringParameterDefinition', defaultValue:"{replicaCount}", description:'Podst', name:'replicaCount']])
  }
}
node{
  getInputs()
if (a > b){
  javaOpts= "Testing Options for Java"
  replicaCount="4"
}
  javaOpts = "{selectedInputs['javaOpts']}"
  javaOpts = "{selectedInputs['replicaCount']}"
  println ("Using these selected inputs:\n" + selectedInputs)
  
  timeout (time:10, unit:'MINUTES'){
    if (d<c){
    sh """ 
    --set javaOpts=${javaOpts}\
    --set replicaCount=${replicaCount}\
    println ("Java Option from shell: $javaOpts")
    println ("Replica Count from shell: $replicaCount")
    """
    }
  }
  }

