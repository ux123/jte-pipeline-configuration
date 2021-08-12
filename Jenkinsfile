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
stage("Rerunning build"){
  unit_test()
}
stage("Rerunning build"){
  unit_test()
}
