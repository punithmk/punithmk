node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk"
	}
	stage ('Build') {
    		dir("punith-assignment-bdd-java") {
			def mvn_version = 'M3'
			withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  			    	sh "mvn clean install -P dev"
			}
       		}
	}
}
