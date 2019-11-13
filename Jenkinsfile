pipeline
  {
   agent any
     stages
       {
        stage("compile stage")
         {
            steps
            {
     		   withMaven(maven : 'TestMaven')
     		    {
				   sh 'mvn clean compile'
				}
			}
		}
		stage("Testing stage")
         {
            steps
            {
     		   withMaven(maven : 'TestMaven')
     		    {
				   sh 'mvn test'
				}
			}
		}
		stage("Deployment stage")
         {
            steps
            {
     		   withMaven(maven : 'TestMaven')
     		    {
				   sh 'mvn deploy'
				}
			}
		}
	   }
	}	