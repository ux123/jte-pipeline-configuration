stage("Running unit test"){
  unit_test()
}
stage("Running build"){
  make()
}
stage("Running code analysis"){
  static_code_analysis()
}

def a = 2
def b = 1

def c = 3
def d = 2

def e = 4
def f = 3

if (a > b){
stage("Rerunning unit test "){
  unit_test()
}
}
if (c > d){
stage("Rerunning unit test "){
  unit_test()
}
}
if (e > f){
stage("Rerunning unit test "){
  unit_test()
}
}

if (f > e){
stage("Rerunning make test "){
  make()
}
}
