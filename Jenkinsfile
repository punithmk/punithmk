node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk"
	}
	stage ('Build') {
    		dir("punith-assignment-bdd-java") {
  			sh "mvn clean install -P dev"
       		}
	}
}
