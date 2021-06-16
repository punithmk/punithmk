node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk"
	}
	stage ('Build') {
    		dir("punith-assignment-bdd-java") {
                	bat'mvn clean install -P api'
       		}
	}
}
