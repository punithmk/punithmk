node {
	stage ('SCM checkout'){
		git "https://github.com/punithmk/punithmk"
	}
	stage ('Build') {
    		dir("punith-assignment-bdd-java") {
  			sh "'${mvnHome}/bin/mvn'  clean install -P dev"
       		}
	}
}
