def num1 = 1
def num2 = 2
stage("Running unit test"){
  unit_test()
}
stage("Running build"){
  make()
}
stage("Running code analysis"){
  static_code_analysis()
}
stage("Rerunning unit test "){
  unit_test()
}
