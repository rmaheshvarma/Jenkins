
job("test-dsl-db") {
       description 'Setup git repo copy to s3 '
    wrappers {
      timestamps()
      
      }
    
    logRotator {
      daysToKeep(90)
   }
      
     parameters {
        choiceParam('ACCOUNT', ['root-7865457'],'Select the AWS Account')
        choiceParam('REGION', ['us-east-1','us-west-1','us-est-2','us-west-2'],'Select the AWS REGION')
	choiceParam('ENV_TYPE', ['dev','stage','prod'],'Select the ENV_TYPE')
	choiceParam('TENANT', ['test-rnd-pm'],'Select the TENANT')
