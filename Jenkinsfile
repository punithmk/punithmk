node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk"
	}
	stage ('Build') {
    		dir("punith-assignment-bdd-java") {
  			
			withMaven(maven : 'apache-maven-3.6.1') {
                		bat'mvn clean install -P dev'
            		}
       		}
	}
}
